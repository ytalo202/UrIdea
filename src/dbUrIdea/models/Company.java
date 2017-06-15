package dbUrIdea.models;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Company {
    private String id;
    private String password;
    private String nameCompany;
    private EmailAddress emailAdress;
    private String description;
    private String address;
    private int phoneNumber;
    private StateCompany stateCompany;

    public Company() {
    }

    public Company(String id, String password, String nameCompany, EmailAddress emailAdress, String description, String address, int phoneNumber, StateCompany stateCompany) {
        this.id = id;
        this.password = password;
        this.nameCompany = nameCompany;
        this.emailAdress = emailAdress;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.stateCompany = stateCompany;
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

    public String getNameCompany() {
        return nameCompany;
    }

    public Company setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
        return this;
    }

    public EmailAddress getEmailAdress() {
        return emailAdress;
    }

    public Company setEmailAdress(EmailAddress emailAdress) {
        this.emailAdress = emailAdress;
        return this;
    }
}