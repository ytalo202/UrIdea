package dbUrIdea.models;


import java.sql.ResultSet;
import java.sql.SQLException;
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
    private StatesCompany statesCompany;

    public Company() {
    }

    public Company(String id, String password, String nameCompany, EmailAddress emailAdress, String description, String address, int phoneNumber, StatesCompany statesCompany) {
        this.id = id;
        this.password = password;
        this.nameCompany = nameCompany;
        this.emailAdress = emailAdress;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.statesCompany = statesCompany;
    }

    public String getIdAsValue() {
        return "'" + getId() + "'";
    }
    public String getPasswordAsValue() {
        return "'" + getPassword() + "'";
    }
    public String getNameCompanyAsValue() {
        return "'" + getNameCompany() + "'";
    }
    public String getDescriptionAsValue() {
        return "'" + getDescription() + "'";
    }

    public String getAddressAsValue() {
        return "'" + getAddress() + "'";
    }
    public String getPhoneNumberAsString()
    {
        return String.valueOf(getPhoneNumber());
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

    public StatesCompany getStatesCompany() {
        return statesCompany;
    }

    public Company setStatesCompany(StatesCompany statesCompany) {
        this.statesCompany = statesCompany;
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

    public static Company build(ResultSet rs, StatesCompaniesEntity statesCompaniesEntity,
                                EmailAddressesEntity emailAddressEntit) {
        try {
            return (new Company())
                    .setId(rs.getString("id"))
                    .setPassword(rs.getString("password"))
                    .setNameCompany(rs.getString("name_company"))
                    .setDescription(rs.getString("description"))
                    .setStatesCompany(statesCompaniesEntity.findById
                            (rs.getString("id_state_company")))
                    .setEmailAdress(emailAddressEntit.findById(
                            rs.getInt("id_email_address")))
                    .setAddress(rs.getString("address"))
                    .setPhoneNumber(rs.getInt("phone_number"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}