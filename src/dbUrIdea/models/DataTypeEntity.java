package dbUrIdea.models;

import javax.xml.crypto.Data;
import javax.xml.datatype.DatatypeConfigurationException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 6/15/2017.
 */
public class DataTypeEntity extends BaseEntity {

    public DataTypeEntity() {
    }

    public DataTypeEntity(Connection connection) {
        super(connection,"data_types");
    }

    public DataTypeEntity(Connection connection, String tableName) {
        super(connection, "data_types");
    }

    List<DataType> findAll() {
        return findByCriteria("");
    }

    public DataType findById(String id) {
        String criteria = " id = '" +
                id +"'";
        return findByCriteria(criteria).get(0);
    }
    public DataType findByName(String name) {
        String criteria = " data_type_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<DataType> findAllOrderedByName() {
        String criteria = " true ORDER BY data_type_name";
        return findByCriteria(criteria);
    }
    public List<DataType> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<DataType> data_types = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                data_types.add(DataType.build(resultSet));
            }
            return data_types;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(DataType dataType) {
        String sql = " INSERT INTO user_types(id, user_type_name) " +
                "VALUES(" + dataType.getIdAsValue() + ", " +
                dataType.getNameAsValue() + ")";
        return change(sql);
    }

    public boolean delete(DataType dataType) {
        String sql = " DELETE FROM user_types WHERE id = " + dataType.getIdAsValue();
        return change(sql);
    }

    public boolean delete(String name) {
        return change(" DELETE FROM user_types WHERE user_type_name = " +
                "'" + name + "'");
    }

    public boolean update(DataType dataType) {
        String sql = " UPDATE user_types SET user_type_name = " + dataType.getNameAsValue() +
                " WHERE id = " + dataType.getIdAsValue();
        return change(sql);
    }


}
