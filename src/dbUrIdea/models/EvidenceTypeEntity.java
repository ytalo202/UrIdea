package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 6/15/2017.
 */
public class EvidenceTypeEntity extends BaseEntity{

    public EvidenceTypeEntity(Connection connection) {

        super(connection,"evidences_types");
    }

    public EvidenceTypeEntity() {

        super();
    }
    List<EvidencesType> findAll() {
        return findByCriteria("");
    }

    public EvidencesType findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public EvidencesType findByName(String name) {
        String criteria = " email_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<EvidencesType> findAllOrderedByName() {
        String criteria = "true ORDER BY name";
        return findByCriteria(criteria);
    }

    public List<EvidencesType> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<EvidencesType> evidences_types= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                evidences_types.add(EvidencesType.build(resultSet));
            }
            return evidences_types;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(EvidencesType evidencesType) {
        String sql = "INSERT INTO emails_addresses(id, name, description) " +
                "VALUES(" + evidencesType.getId() + ", " +
                evidencesType.getName()+", " + evidencesType.getDescription()+ ")";
        return change(sql);
    }

    public boolean delete(EvidencesType evidencesType) {
        String sql = "DELETE FROM emails_addresses WHERE id = " + evidencesType.getIdAsString();
        return change(sql);
    }
    public boolean delete(String email) {
        return change("DELETE FROM emails_addresses WHERE email_data = " +
                "'" + email + "'");
    }




}
