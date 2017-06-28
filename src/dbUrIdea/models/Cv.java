package dbUrIdea.models;


import com.sun.org.apache.bcel.internal.generic.RET;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Cv {
 private String id;
 private Employee employee;
 private int cvType;
 private String description;



    public Cv() {
 }

    public Cv(String id, Employee employee, int cvType, String description) {
        this.id = id;
        this.employee = employee;
        this.cvType = cvType;
        this.description = description;

    }

    public String getIdAsValue() {
        return "'" + getId() + "'";
    }
    public String getDescriptionAsValue() {
        return "'" + getDescription() + "'";
    }
    public String getcvTypeAsString(){return String.valueOf(getCvType());}

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



 public String getDescription() {
  return description;
 }

 public Cv setDescription(String description) {
  this.description = description;
  return this;
 }

    public int getCvType() {
        return cvType;
    }

    public Cv setCvType(int cvType) {
        this.cvType = cvType;
        return this;
    }


    public static Cv build(ResultSet rs,
                           EmployeesEntity employeesEntity,
                           CompaniesEntity companiesEntity,
                           EmailAddressesEntity emailAddressesEntity
                           ) {
        try {
            return (new Cv())
                    .setId(rs.getString("id"))
                    .setEmployee(employeesEntity.findById(rs.getString("id_employee"), companiesEntity, emailAddressesEntity))
                    .setCvType(rs.getInt("cv_type"))
                    .setDescription(rs.getString("description"));


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
