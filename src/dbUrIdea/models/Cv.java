package dbUrIdea.models;


import java.sql.ResultSet;
import java.sql.SQLException;

public class Cv {
 private String id;
 private Employee employee;
 private DataType dataType;
 private String description;

 public Cv() {
 }

 public Cv(String id, Employee employee, DataType dataType, String description) {
  this.setId(id);
  this.setEmployee(employee);
  this.setDataType(dataType);
  this.setDescription(description);
 }

    public String getIdAsValue() {
        return "'" + getId() + "'";
    }
    public String getDescriptionAsValue() {
        return "'" + getDescription() + "'";
    }


    public String getId() {
  return id;
 }

 public Cv setId(String id) {
  this.id = id;
  return this;
 }

 public Employee getEmployee() {
  return employee;
 }

 public Cv setEmployee(Employee employee) {
  this.employee = employee;
  return this;
 }

 public DataType getDataType() {
  return dataType;
 }

 public Cv setDataType(DataType dataType) {
  this.dataType = dataType;
  return this;
 }

 public String getDescription() {
  return description;
 }

 public Cv setDescription(String description) {
  this.description = description;
  return this;
 }


    public static Cv build(ResultSet rs,
                           EmployeeEntity employeeEntity,
                           DataTypeEntity dataTypeEntity,
                           CompanyEntity companyEntity,
                           UserTypeEntity userTypeEntity,
                           EmailAddressEntity emailAddressEntity,
                           StateCompanyEntity stateCompanyEntity
                            ) {
        try {
            return (new Cv())
                    .setId(rs.getString("id"))
                    .setEmployee(employeeEntity.findById(
                            rs.getString("id_employee")
                            ,companyEntity,userTypeEntity,emailAddressEntity,
                            stateCompanyEntity))
                    .setDataType(dataTypeEntity.findById(rs.getString(
                            "id_data_type")))
                    .setDescription(rs.getString("description"));


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
