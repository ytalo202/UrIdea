package dbUrIdea.models;

/**
 * Created by Yoshinon on 14/06/2017.
 */
public class StateCompany {

    private String id;
    private String description;

    public StateCompany() {
    }

    public StateCompany(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public StateCompany setId(String id) {
        this.id = id;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public StateCompany setDescription(String description) {
        this.description = description;
        return this;
    }
}
