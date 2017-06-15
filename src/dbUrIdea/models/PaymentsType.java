package dbUrIdea.models;

/**
 * Created by Usuario on 15/06/2017.
 */
public class PaymentsType {
    private int id;
    private String name;


    public PaymentsType() {
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
}
