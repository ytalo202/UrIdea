package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Evaluation {
    private int id;
    private Employee idEmployee;
   private Employee idUserEmployee;
    private Company company;
    private Date date;
    private int grade;



    public Evaluation() {
    }

    public Evaluation(
            int id, Employee idEmployee, Employee idUserEmployee,
            Company company, Date date, int grade) {
        this.id = id;
        this.idEmployee = idEmployee;
        this.idUserEmployee = idUserEmployee;
        this.company = company;
        this.date = date;
        this.grade = grade;
    }


    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public String getDateAsValue()
    {


        return  "'"+String.valueOf(getDate())+"'";
    }

    public String getGradeAsString()
    {
        return String.valueOf(getGrade());
    }





    public int getId() {
        return id;
    }

    public Evaluation setId(int id) {
        this.id = id;
        return this;
    }

    public Employee getIdEmployee() {
        return idEmployee;
    }

    public Evaluation setIdEmployee(Employee idEmployee) {
        this.idEmployee = idEmployee;
        return this;
    }

    public Employee getIdUserEmployee() {
        return idUserEmployee;
    }

    public Evaluation setIdUserEmployee(Employee idUserEmployee) {
        this.idUserEmployee = idUserEmployee;
        return this;
    }

    public Company getCompany() {
        return company;
    }

    public Evaluation setCompany(Company company) {
        this.company = company;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Evaluation setDate(Date date) {
        this.date = date;
        return this;
    }

    public int getGrade() {
        return grade;
    }

    public Evaluation setGrade(int grade) {
        this.grade = grade;
        return this;
    }

    public static Evaluation build(ResultSet rs,
                           EmployeesEntity employeesEntity,
                           CompaniesEntity companiesEntity,
                           EmailAddressesEntity emailAddressesEntity
    ) {
        try {
            return (new Evaluation())
                    .setId(rs.getInt("id"))
                    .setIdEmployee(employeesEntity.findById(
                            rs.getInt("id_evaluator")
                            , companiesEntity, emailAddressesEntity
                            ))
                    .setIdUserEmployee(employeesEntity.findById(
                            rs.getInt("id_user_employee")
                            , companiesEntity, emailAddressesEntity
                           ))
                    .setCompany(companiesEntity.findById(
                            rs.getInt("id_company"),
                            emailAddressesEntity))
                    .setDate(rs.getDate("evaluation_date"))
                    .setGrade(rs.getInt("grade"));




        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
