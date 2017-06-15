package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by UrIdea on 15/06/2017.
 */
public class DataType {
    private String id;
    private String name;



    public DataType() {
    }

    public String getIdAsValue() {
        return "'" + getId() + "'";
    }

    public String getNameAsValue() {
        return "'" + getName() + "'";
    }


    public DataType(String id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public String getId() {
        return id;
    }

    public DataType setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public DataType setName(String name) {
        this.name = name;
        return this;
    }

    public static DataType build(ResultSet resultSet) {
        try {
            return (new DataType())
                    .setId(resultSet.getString("id"))
                    .setName(resultSet.getString("data_type_name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
