package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class StateCompanyEntity extends BaseEntity{

    public StateCompanyEntity() {
        super();
    }

    public StateCompanyEntity(Connection connection) {
        super(connection,"states_companies");
    }

    List<StateCompany> findAll() {
        return findByCriteria("");
    }

    public StateCompany findById(String id) {
        String criteria = " id = '" +
                id + "'";
        return findByCriteria(criteria).get(0);
    }
    public StateCompany findByDescription(String description) {
        String criteria = " description = '" +
                description + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<StateCompany> findAllOrderedByDescription() {
        String criteria = "true ORDER BY description";
        return findByCriteria(criteria);
    }

    public List<StateCompany> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<StateCompany> states_companies = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                states_companies.add(StateCompany.build(resultSet));
            }
            return states_companies;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(StateCompany stateCompany) {
        String sql = "INSERT INTO states_companies(id, description) " +
                "VALUES(" + stateCompany.getIdAsValue() + ", " +
                stateCompany.getDescriptionAsValue() + ")";
        return change(sql);
    }

    public boolean delete(StateCompany stateCompany) {
        String sql = "DELETE FROM states_companies WHERE id = "
                + stateCompany.getIdAsValue();
        return change(sql);
    }

    public boolean delete(String description) {
        return change("DELETE FROM states_companies WHERE description = " +
                "'" + description + "'");
    }

    public boolean update(StateCompany stateCompany) {
        String sql = "UPDATE states_companie SET description = " + stateCompany.getDescriptionAsValue() +
                " WHERE id = " + stateCompany.getIdAsValue();
        return change(sql);
    }



}
