package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class StatesCompany {

    private String id;
    private String description;

    public StatesCompany() {
    }
    public String getIdAsValue() {
        return "'" + getId() + "'";
    }
    public String getDescriptionAsValue() {
        return "'" + getDescription() + "'";
    }

    public StatesCompany(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public StatesCompany setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public StatesCompany setDescription(String description) {
        this.description = description;
        return this;
    }
    public static StatesCompany build(ResultSet resultSet) {
        try {
            return (new StatesCompany())
                    .setId(resultSet.getString("id"))
                    .setDescription(resultSet.getString("description"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}