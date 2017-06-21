package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class StatesCompaniesEntity extends BaseEntity{

    public StatesCompaniesEntity() {
        super();
    }

    public StatesCompaniesEntity(Connection connection) {

        super(connection,"states_companies");
    }

    List<StatesCompany> findAll() {
        return findByCriteria("");
    }

    public StatesCompany findById(String id) {
        String criteria = " id = '" +
                id + "'";
        return findByCriteria(criteria).get(0);
    }
    public StatesCompany findByDescription(String description) {
        String criteria = " description = '" +
                description + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<StatesCompany> findAllOrderedByDescription() {
        String criteria = "true ORDER BY description";
        return findByCriteria(criteria);
    }

    public List<StatesCompany> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<StatesCompany> states_companies = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                states_companies.add(StatesCompany.build(resultSet));
            }
            return states_companies;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(StatesCompany statesCompany) {
        String sql = "INSERT INTO states_companies(id, description) " +
                "VALUES(" + statesCompany.getIdAsValue() + ", " +
                statesCompany.getDescriptionAsValue() + ")";
        return change(sql);
    }

    public boolean delete(StatesCompany statesCompany) {
        String sql = "DELETE FROM states_companies WHERE id = "
                + statesCompany.getIdAsValue();
        return change(sql);
    }

    public boolean delete(String description) {
        return change("DELETE FROM states_companies WHERE description = " +
                "'" + description + "'");
    }

    public boolean update(StatesCompany statesCompany) {
        String sql = "UPDATE states_companie SET description = " + statesCompany.getDescriptionAsValue() +
                " WHERE id = " + statesCompany.getIdAsValue();
        return change(sql);
    }



}
