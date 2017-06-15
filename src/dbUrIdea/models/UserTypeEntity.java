package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class UserTypeEntity extends BaseEntity{
    public UserTypeEntity() {
        super();
    }

    public UserTypeEntity(Connection connection) {
        super(connection,"user_types");
    }
    List<UserType> findAll() {
        return findByCriteria("");
    }

    public UserType findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }
    public UserType findByName(String name) {
        String criteria = " user_type_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<UserType> findAllOrderedByName() {
        String criteria = " true ORDER BY user_type_name";
        return findByCriteria(criteria);
    }
    public List<UserType> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<UserType> user_types = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
               user_types.add(UserType.build(resultSet));
            }
            return user_types;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(UserType userType) {
        String sql = "INSERT INTO user_types(id, user_type_name,description) " +
                "VALUES(" + userType.getIdAsString() + ", " +
                userType.getUserTypeNameAsValue() +","+userType.getDescriptionAsValue() +")";
        return change(sql);
    }

    public boolean delete(UserType userType) {
        String sql = "DELETE FROM user_types WHERE id = " + userType.getIdAsString();
        return change(sql);
    }

    public boolean delete(String user_type_name) {
        return change("DELETE FROM user_types WHERE user_type_name = " +
                "'" + user_type_name + "'");
    }

    public boolean update(UserType userType) {
        String sql = "UPDATE user_types SET user_type_name = " + userType.getUserTypeNameAsValue()+
                " WHERE id = " + userType.getIdAsString();
        return change(sql);
    }

}
