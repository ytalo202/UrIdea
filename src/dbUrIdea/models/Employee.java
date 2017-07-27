package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Employee {
    private int id;
    private int id2;
    private String password;
    private String name;
    private String firstLastName;
    private String SecondLastName;
    private int phoneNumber;
    private int cellPhoneNumber;
    private int dni;
    private String address;
    private String department;
    private Date birthdate;
    private Company company;
    private int employeeType;
    private EmailAddress emailAddress;
    private Area area;

    public Employee() {
    }

    public Employee(int id, String password,
                    String name, String firstLastName,
                    String secondLastName, int phoneNumber, int cellPhoneNumber,
                    int dni, String address, String department, Date birthdate,
                    Company company, int employeeType, EmailAddress emailAddress, Area area) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.firstLastName = firstLastName;
        SecondLastName = secondLastName;
        this.phoneNumber = phoneNumber;
        this.cellPhoneNumber = cellPhoneNumber;
        this.dni = dni;
        this.address = address;
        this.department = department;
        this.birthdate = birthdate;
        this.company = company;
        this.employeeType = employeeType;
        this.emailAddress = emailAddress;
        this.setArea(area);
    }


    public int getId2() {

        return id2;
    }

    public Employee setId2(int id2) {
        this.id2 = id2;
        return this;
    }

    public String getId2AsString() {
        return String.valueOf(getId2());
    }



    public int getId() {
        return id;
    }

    public Employee setId(int id) {
        this.id = id;
        return this;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public String getPasswordAsValue() {
        return "'" + getPassword() + "'";
    }

    public String getNameAsValue() {
        return "'" + getName() + "'";
    }

    public String getFirstLastNameAsValue() {
        return "'" + getFirstLastName() + "'";
    }
    public String getSecondLastNameAsValue() {
        return "'" + getSecondLastName() + "'";
    }

    public String getPhoneNumberAsString()
    {
        return String.valueOf(getPhoneNumber());
    }

    public String getCellPhoneNumberAsString()
    {
        return String.valueOf(getCellPhoneNumber());
    }

    public String getAddressAsValue() {
        return "'" + getAddress() + "'";
    }
    public String getEmployeeTypeAsString(){return String.valueOf(getEmployeeType());}
    public String getDniAsString(){return String.valueOf(getDni());}
    public String getDepartmentAsValue() {
        return "'" + getDepartment() + "'";
    }
    //date ? lo vemos luego  --- lo vemos abajoo


    public String getBirthdateAsValue()
    {
        return  "'"+String.valueOf(getBirthdate())+"'";
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

    public int getEmployeeType() {
        return employeeType;
    }

    public Employee setEmployeeType(int employeeType) {
        this.employeeType = employeeType;
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

    public static Employee build(ResultSet rs, CompaniesEntity companiesEntity,
                                 EmailAddressesEntity emailAddressesEntity,
                                 AreasEntity areasEntity
    ) {
        try {
            return (new Employee())
                    .setId(rs.getInt("id"))
                    .setCompany(companiesEntity.findById(
                            rs.getInt("id_company"),
                             emailAddressesEntity))
                    .setEmailAddress(emailAddressesEntity.findById(
                            rs.getInt("id_email_address")))
                    .setArea(areasEntity.findById(
                            rs.getInt("id_areas")))
                    .setEmployeeType(rs.getInt("employee_type"))
                    .setPassword(rs.getString("password"))
                    .setName(rs.getString("employee_name"))
                    .setFirstLastName(rs.getString("employee_first_last_name"))
                    .setSecondLastName(rs.getString("employee_second_last_name"))
                    .setDni(rs.getInt("dni"))
                    .setPhoneNumber(rs.getInt("phone_number"))
                    .setCellPhoneNumber(rs.getInt("cell_phone_number"))
                    .setAddress(rs.getString("address"))
                    .setDepartment(rs.getString("department"))
                    .setBirthdate(rs.getDate("birthdate"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getDni() {
        return dni;
    }

    public Employee setDni(int dni) {
        this.dni = dni;
        return this;
    }

    public Area getArea() {
        return area;
    }

    public Employee setArea(Area area) {
        this.area = area;
        return this;
    }
}
