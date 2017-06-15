package dbUrIdea.models;

import java.util.Date;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Employee {
    private String id;
    private String password;
    private String name;
    private String firstLastName;
    private String SecondLastName;
    private int phoneNumber;
    private int cellPhoneNumber;
    private String address;
    private String department;
    private Date birthdate;
    private Company company;
    private UserType userType;
    private EmailAddress emailAddress;

    public Employee() {
    }

    public Employee(String id, String password, String name, String firstLastName, String secondLastName, int phoneNumber, int cellPhoneNumber, String address, String department, Date birthdate, Company company, UserType userType, EmailAddress emailAddress) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.firstLastName = firstLastName;
        SecondLastName = secondLastName;
        this.phoneNumber = phoneNumber;
        this.cellPhoneNumber = cellPhoneNumber;
        this.address = address;
        this.department = department;
        this.birthdate = birthdate;
        this.company = company;
        this.userType = userType;
        this.emailAddress = emailAddress;
    }


    public String getId() {
        return id;
    }

    public Employee setId(String id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Employee setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstLastName() {
        return firstLastName;
    }

    public Employee setFirstLastName(String firstLastName) {
        this.firstLastName = firstLastName;
        return this;
    }

    public String getSecondLastName() {
        return SecondLastName;
    }

    public Employee setSecondLastName(String secondLastName) {
        SecondLastName = secondLastName;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Employee setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public int getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public Employee setCellPhoneNumber(int cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Employee setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }


    public Company getCompany() {
        return company;
    }

    public Employee setCompany(Company company) {
        this.company = company;
        return this;
    }

    public UserType getUserType() {
        return userType;
    }

    public Employee setUserType(UserType userType) {
        this.userType = userType;
        return this;
    }

    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    public Employee setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public Employee setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
        return this;
    }
}
