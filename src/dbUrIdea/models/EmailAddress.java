package dbUrIdea.models;

/**
 * Created by Magnus on 6/15/2017.
 */
public class EmailAddress {
     private int id;
     private String emailData;


    public EmailAddress() {
    }

    public EmailAddress(int id, String emailData) {
        this.setId(id);
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
}
