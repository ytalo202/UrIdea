package dbUrIdea.models;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class DataType {
    private String id;
    private String name;


    public DataType() {
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
}
