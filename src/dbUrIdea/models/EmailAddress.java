package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;
/**
 * Created by Magnus on 6/15/2017.
 */
public class EmailAddress {
     private int id;
     private String emailData;


    public EmailAddress() {
    }

    public EmailAddress( String emailData) {
        this.setEmailData(emailData);
    }






    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public String getEmailDataAsValue() {
        return "'" + getEmailData() + "'";
    }

    public int getId() {
        return id;
    }

    public EmailAddress setId(int id) {
        this.id = id;
        return this;
    }

    public String getEmailData() {
        return emailData;
    }

    public EmailAddress setEmailData(String emailData) {
        this.emailData = emailData;
        return this;
    }

    public static EmailAddress build(ResultSet resultSet) {
        try {
            return (new EmailAddress())
                    .setId(resultSet.getInt("id"))
                    .setEmailData(resultSet.getString("email_data"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static EmailAddress build2(ResultSet resultSet) {
        try {
            return (new EmailAddress())
                    .setId(resultSet.getInt("id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
