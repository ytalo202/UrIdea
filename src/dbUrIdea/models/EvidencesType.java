package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by UrIdea on 15/06/2017.
 */
public class EvidencesType {
    private int id;
    private String name;
    private String description;

    public EvidencesType() {
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public String getNameAsValue() {
        return "'" + getName() + "'";
    }

    public String getDescriptionAsValue() {
        return "'" + getDescription() + "'";
    }



    public EvidencesType(int id, String name, String description) {
        this.setId(id);
        this.setName(name);
        this.setDescription(description);
    }

    public int getId() {
        return id;
    }

    public EvidencesType setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EvidencesType setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public EvidencesType setDescription(String description) {
        this.description = description;
        return this;
    }

    public static EvidencesType build(ResultSet resultSet) {
        try {
            return (new EvidencesType())
                    .setId(resultSet.getInt("id"))
                    .setName(resultSet.getString("name"))
                    .setDescription(resultSet.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
