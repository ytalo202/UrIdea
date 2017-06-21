package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 6/15/2017.
 */
public class EvidencesTypesEntity extends BaseEntity{

    public EvidencesTypesEntity(Connection connection) {

        super(connection,"evidences_types");
    }

    public EvidencesTypesEntity() {

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
        String sql = "INSERT INTO evidences_types(id, name, description) " +
                "VALUES(" + evidencesType.getIdAsString() + ", " +
                evidencesType.getNameAsValue()+", " + evidencesType.getDescriptionAsValue()+ ")";
        return change(sql);
    }

    public boolean delete(EvidencesType evidencesType) {
        String sql = "DELETE FROM evidences_types WHERE id = " + evidencesType.getIdAsString();
        return change(sql);
    }
    public boolean delete(String name) {
        return change("DELETE FROM evidences_types WHERE name = " +
                "'" + name + "'");
    }


    public boolean update(EvidencesType evidencesType) {
        String sql = "UPDATE evidences_types SET name = " +
                evidencesType.getName() +
                " WHERE id = " + evidencesType.getIdAsString();
        return change(sql);
    }


}
