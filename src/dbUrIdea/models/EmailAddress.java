package dbUrIdea.models;

/**
 * Created by Magnus on 6/15/2017.
 */
public class EmailAddress {
    private String id;

    public EmailAddress(String id) {
        this.id = id;
    }

    public EmailAddress() {
    }

    public String getId() {
        return id;
    }

    public EmailAddress setId(String id) {
        this.id = id;
        return this;
    }
}
