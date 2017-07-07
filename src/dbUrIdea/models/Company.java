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
    private int companyState;

    public Company() {
    }

    public Company(String id, String password, String nameCompany, EmailAddress emailAdress, String description, String address, int phoneNumber, int companyState) {
        this.id = id;
        this.password = password;
        this.nameCompany = nameCompany;
        this.emailAdress = emailAdress;
        this.description = description;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.companyState = companyState;
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
    public String getCompanyStateAsString(){return String.valueOf(getCompanyState());}

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

    public int getCompanyState() {
        return companyState;
    }

    public Company setCompanyState(int companyState) {
        this.companyState = companyState;
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

    public static Company build(ResultSet rs, EmailAddressesEntity emailAddressEntity) {
        try {
            return (new Company())
                    .setId(rs.getString("id"))
                    .setPassword(rs.getString("password"))
                    .setNameCompany(rs.getString("name_company"))
                    .setDescription(rs.getString("description"))
                    .setCompanyState(rs.getInt("company_state"))
                    .setEmailAdress(emailAddressEntity.findById(
                            rs.getInt("id_email_address")))
                    .setAddress(rs.getString("address"))
                    .setPhoneNumber(rs.getInt("phone_number"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}