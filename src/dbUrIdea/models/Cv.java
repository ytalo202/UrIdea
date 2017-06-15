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
                           EmployeeEntity employeeEntity,DataTypeEntity dataTypeEntity) {
        try {
            return (new Cv())
                    .setId(rs.getString("id"));
                    //.setEmployee(employeeEntity.getString("country_name"))
                    //.setDataType(dataTypeEntity.findById(rs.getInt("region_id")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
