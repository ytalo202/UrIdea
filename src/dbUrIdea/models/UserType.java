package dbUrIdea.models;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class UserType {
    private int id;
    private String userTypeName;
    private String description;


    public UserType() {
    }

    public UserType(int id, String userTypeName, String description) {
        this.id = id;
        this.userTypeName = userTypeName;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public UserType setId(int id) {
        this.id = id;
        return this;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public UserType setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
        return this;

    }

    public String getDescription() {
        return description;
    }

    public UserType setDescription(String description) {
        this.description = description;
        return this;

    }
}
