package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by  UrIdea on 15/06/2017.
 */
public class PaymentsType {
    private int id;
    private String name;


    public PaymentsType() {
    }

    public String getIdAsString()
    {
        return String.valueOf(getId());
    }

    public String getNameAsValue() {
        return "'" + getName() + "'";
    }

    public PaymentsType(int id, String name) {
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    public PaymentsType setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PaymentsType setName(String name) {
        this.name = name;
        return this;
    }


    public static PaymentsType build(ResultSet rs) {
        try {
            return (new PaymentsType())
                    .setId(rs.getInt("id"))
                    .setName(rs.getString("payment_type_name"));


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
