package dbUrIdea.models;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Cv {
 private int id;
 private Employee employee;
 private int cvType;
 private String description;
 private int year;
 private int month;
 private int day;
 private Timestamp date_cv;



    public Cv() {
 }

    public Cv(int id, Employee employee, int cvType, String description, int year, int month, int day, Timestamp date_cv) {
        this.id = id;
        this.employee = employee;
        this.cvType = cvType;
        this.description = description;
        this.year = year;
        this.month = month;
        this.day = day;
        this.setDate_cv(date_cv);
    }


    public String getIdAsString() {
        return String.valueOf(getId());
    }
    public String getDescriptionAsValue() {
        return "'" + getDescription() + "'";
    }
    public String getcvTypeAsString(){return String.valueOf(getCvType());}

    public int getId() {
  return id;
 }

 public Cv setId(int id) {
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
                           EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
                           ) {
        try {
            return (new Cv())
                    .setId(rs.getInt("id"))
                    .setEmployee(employeesEntity.findById(rs.getInt("id_employee")
                            , companiesEntity, emailAddressesEntity,areasEntity))
                    .setCvType(rs.getInt("cv_type"))
                    .setDescription(rs.getString("description"))
                    .setDate_cv(rs.getTimestamp("date_cv"));


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Cv buildFecha(ResultSet rs,
                                    EmployeesEntity employeesEntity,
                                    CompaniesEntity companiesEntity,
                                    EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
    ) {
        try {
            return (new Cv())
                    .setId(rs.getInt("id"))
                    .setYear(rs.getInt("from_unixtime( UNIX_TIMESTAMP(date_cv),'%Y')"))
                    .setMonth(rs.getInt("from_unixtime( UNIX_TIMESTAMP(date_cv),'%m')"))
                    .setDay(rs.getInt("from_unixtime( UNIX_TIMESTAMP(date_cv),'%d')"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int getYear() {
        return year;
    }

    public Cv setYear(int year) {
        this.year = year;
        return this;
    }

    public int getMonth() {
        return month;
    }

    public Cv setMonth(int month) {
        this.month = month;
        return this;
    }

    public int getDay() {
        return day;
    }

    public Cv setDay(int day) {
        this.day = day;
        return this;
    }

    public Timestamp getDate_cv() {
        return date_cv;
    }

    public Cv setDate_cv(Timestamp date_cv) {
        this.date_cv = date_cv;
        return this;
    }
}
