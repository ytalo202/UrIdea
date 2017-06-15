package dbUrIdea.models;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Evaluation {
    private String id;
    private Employee idEmployee;
   private Employee idUserEmployee;
    private Company company;
    private String date;
    private float grade;

    public Evaluation() {
    }

    public Evaluation(String id, Employee idEmployee, Employee idUserEmployee, Company company, String date, float grade) {
        this.setId(id);
        this.setIdEmployee(idEmployee);
        this.setIdUserEmployee(idUserEmployee);
        this.setCompany(company);
        this.setDate(date);
        this.setGrade(grade);
    }

    public String getId() {
        return id;
    }

    public Evaluation setId(String id) {
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

    public String getDate() {
        return date;
    }

    public Evaluation setDate(String date) {
        this.date = date;
        return this;
    }

    public float getGrade() {
        return grade;
    }

    public Evaluation setGrade(float grade) {
        this.grade = grade;
        return this;
    }
}
