package dbUrIdea.models;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Company {
    private String id;
    private String password;
    private String description;
    private String address;
    private int phoneNumber;
    private StateCompany stateCompany;

    public Company() {
    }

    public Company(String id, String password, String description, String address, int phoneNumber, StateCompany stateCompany) {
        this.setId(id);
        this.setPassword(password);
        this.setDescription(description);
        this.setAddress(address);
        this.setPhoneNumber(phoneNumber);
        this.setStateCompany(stateCompany);
    }


    public String getId() {
        return id;
    }

    public Company setId(String id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Company setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Company setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Company setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Company setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public StateCompany getStateCompany() {
        return stateCompany;
    }

    public Company setStateCompany(StateCompany stateCompany) {
        this.stateCompany = stateCompany;
        return this;
    }
}