package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Evaluation {
   private int id;
   private Employee idEmployee;
   private Employee idUserEmployee;
   private Company company;
     private Area area;

   private double grade;
    private double grade1;
   private double grade2;
    private String comment;
    private double professional_improvement;
    private double avg_grade;

  private Timestamp date;
    private double commitment;
    private double communication;
    private double ethic;
    private double team_management;
    private double decision_making;
    private double strategic_thinking;
    private double customer_orientation;
    private double social_responsability;
    private double time_management;
    private double use_of_resources;
    private double cost_orientation;
    private double knowledge_of_languages;
    private double digital_skills;





    public Evaluation() {
    }

    public Evaluation(int id, Employee idEmployee, Employee idUserEmployee, Company company, Area area, double grade, double grade1, double grade2, String comment, double professional_improvement, double avg_grade, Timestamp date, double commitment, double communication, double ethic, double team_management, double decision_making, double strategic_thinking, double customer_orientation, double social_responsability, double time_management, double use_of_resources, double cost_orientation, double knowledge_of_languages, double digital_skills) {
        this.id = id;
        this.idEmployee = idEmployee;
        this.idUserEmployee = idUserEmployee;
        this.company = company;
        this.area = area;
        this.grade = grade;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.comment = comment;
        this.professional_improvement = professional_improvement;
        this.avg_grade = avg_grade;
        this.date = date;
        this.commitment = commitment;
        this.communication = communication;
        this.ethic = ethic;
        this.team_management = team_management;
        this.decision_making = decision_making;
        this.strategic_thinking = strategic_thinking;
        this.customer_orientation = customer_orientation;
        this.social_responsability = social_responsability;
        this.time_management = time_management;
        this.use_of_resources = use_of_resources;
        this.cost_orientation = cost_orientation;
        this.knowledge_of_languages = knowledge_of_languages;
        this.digital_skills = digital_skills;
    }


    public String getIdAsString() {
        return String.valueOf(getId());
    }


    public String getDateAsValue()
    {


        return  "'"+String.valueOf(getDate())+"'";
    }

    public String getGrade1AsString()
    {
        return String.valueOf(getGrade1());
    }

    public String getGrade2AsString()
    {
        return String.valueOf(getGrade2());
    }

    public String getGradeAsString()
    {
        return String.valueOf(getGrade());
    }

    public String getCommitmentAsString() {
        return String.valueOf(getCommitment());
    }
    public String getCommunicationAsString() {
        return String.valueOf(getCommunication());
    }
    public String getEthicAsString() {
        return String.valueOf(getEthic());
    }
    public String getTeam_managementAsString() {
        return String.valueOf(getTeam_management());
    }
    public String getAsDecision_makingString() {
        return String.valueOf(getDecision_making());
    }
    public String getStrategic_thinkingAsString() {
        return String.valueOf(getStrategic_thinking());
    }
    public String getCustomer_orientationAsString() {
        return String.valueOf(getCustomer_orientation());
    }
    public String getSocial_responsabilityAsString() {
        return String.valueOf(getSocial_responsability());
    }
    public String getTime_managementAsString() {
        return String.valueOf(getTime_management());
    }

    public String getUse_of_resourcesAsString() {
        return String.valueOf(getUse_of_resources());
    }

    public String getCost_orientationAsString() {
        return String.valueOf(getCost_orientation());
    }

    public String getKnowledge_of_languagesAsString() {
        return String.valueOf(getKnowledge_of_languages());
    }

    public String getDigital_skillsAsString() {
        return String.valueOf(getDigital_skills());
    }

    public String getProfessional_improvementAsString() {

        return String.valueOf(getProfessional_improvement());
    }

    public String getCommentAsValue() {
        return "'" +getComment()+ "'";
    }

    public String getAvg_gradeAsString() {

        return String.valueOf(getAvg_grade());
    }









    public static Evaluation build(ResultSet rs,
                           EmployeesEntity employeesEntity,
                           CompaniesEntity companiesEntity,
                           EmailAddressesEntity emailAddressesEntity,
                                   AreasEntity areasEntity
    ) {
        try {
            return (new Evaluation())
                    .setId(rs.getInt("id"))
                    .setIdEmployee(employeesEntity.findById(
                            rs.getInt("id_evaluator")
                            , companiesEntity, emailAddressesEntity,areasEntity
                            ))
                    .setIdUserEmployee(employeesEntity.findById(
                            rs.getInt("id_user_employee")
                            , companiesEntity, emailAddressesEntity,areasEntity
                           ))
                    .setCompany(companiesEntity.findById(
                            rs.getInt("id_company"),
                            emailAddressesEntity))
                    .setArea(areasEntity.findById(
                            rs.getInt("id_area")))

                    .setDate(rs.getTimestamp("evaluation_date_and_time"))
                    .setGrade(rs.getDouble("grade"))
                    .setGrade1(rs.getDouble("grade1"))
                    .setGrade2(rs.getDouble("grade2"))
                    .setCommitment(rs.getDouble("commitment"))
                    .setCommunication(rs.getDouble("communication"))
                    .setEthic(rs.getDouble("ethic"))
                    .setTeam_management(rs.getDouble("team_management"))
                    .setDecision_making(rs.getDouble("decision_making"))
                    .setStrategic_thinking(rs.getDouble("strategic_thinking"))
                    .setCustomer_orientation(rs.getDouble("customer_orientation"))
                    .setSocial_responsability(rs.getDouble("social_responsability"))
                    .setTime_management(rs.getDouble("time_management"))
                    .setUse_of_resources(rs.getDouble("use_of_resources"))
                    .setCost_orientation(rs.getDouble("cost_orientation"))
                    .setKnowledge_of_languages(rs.getDouble("knowledge_of_languages"))
                    .setDigital_skills(rs.getDouble("digital_skills"))
                    .setProfessional_improvement(rs.getDouble("professional_improvement"))
                    .setComment(rs.getString("comment"))
                    .setAvg_grade(rs.getDouble("avg_grade"))

                    ;





        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static Evaluation build2(ResultSet rs,
                                   EmployeesEntity employeesEntity,
                                   CompaniesEntity companiesEntity,
                                   EmailAddressesEntity emailAddressesEntity,
                                   AreasEntity areasEntity
    ) {
        try {
            return (new Evaluation())
                    .setIdUserEmployee(employeesEntity.findById(
                            rs.getInt("id_user_employee")
                            , companiesEntity, emailAddressesEntity,areasEntity
                    ))
                    .setCompany(companiesEntity.findById(
                            rs.getInt("id_company"),
                            emailAddressesEntity))
                    .setGrade(rs.getFloat("avg(grade)"))
                    .setGrade1(rs.getFloat("avg(grade1)"))
                    .setGrade2(rs.getFloat("avg(grade2)"))
                    .setAvg_grade(rs.getFloat("avg(avg_grade)"))
                    ;





        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
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

    public Area getArea() {
        return area;
    }

    public Evaluation setArea(Area area) {
        this.area = area;
        return this;
    }

    public double getGrade() {
        return grade;
    }

    public Evaluation setGrade(double grade) {
        this.grade = grade;
        return this;
    }

    public double getGrade1() {
        return grade1;
    }

    public Evaluation setGrade1(double grade1) {
        this.grade1 = grade1;
        return this;
    }

    public double getGrade2() {
        return grade2;
    }

    public Evaluation setGrade2(double grade2) {
        this.grade2 = grade2;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Evaluation setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public double getProfessional_improvement() {
        return professional_improvement;
    }

    public Evaluation setProfessional_improvement(double professional_improvement) {
        this.professional_improvement = professional_improvement;
        return this;
    }

    public double getAvg_grade() {
        return avg_grade;
    }

    public Evaluation setAvg_grade(double avg_grade) {
        this.avg_grade = avg_grade;
        return this;
    }

    public Timestamp getDate() {
        return date;
    }

    public Evaluation setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    public double getCommitment() {
        return commitment;
    }

    public Evaluation setCommitment(double commitment) {
        this.commitment = commitment;
        return this;
    }

    public double getCommunication() {
        return communication;
    }

    public Evaluation setCommunication(double communication) {
        this.communication = communication;
        return this;
    }

    public double getEthic() {
        return ethic;
    }

    public Evaluation setEthic(double ethic) {
        this.ethic = ethic;
        return this;
    }

    public double getTeam_management() {
        return team_management;
    }

    public Evaluation setTeam_management(double team_management) {
        this.team_management = team_management;
        return this;
    }

    public double getDecision_making() {
        return decision_making;
    }

    public Evaluation setDecision_making(double decision_making) {
        this.decision_making = decision_making;
        return this;
    }

    public double getStrategic_thinking() {
        return strategic_thinking;
    }

    public Evaluation setStrategic_thinking(double strategic_thinking) {
        this.strategic_thinking = strategic_thinking;
        return this;
    }

    public double getCustomer_orientation() {
        return customer_orientation;
    }

    public Evaluation setCustomer_orientation(double customer_orientation) {
        this.customer_orientation = customer_orientation;
        return this;
    }

    public double getSocial_responsability() {
        return social_responsability;
    }

    public Evaluation setSocial_responsability(double social_responsability) {
        this.social_responsability = social_responsability;
        return this;
    }

    public double getTime_management() {
        return time_management;
    }

    public Evaluation setTime_management(double time_management) {
        this.time_management = time_management;
        return this;
    }

    public double getUse_of_resources() {
        return use_of_resources;
    }

    public Evaluation setUse_of_resources(double use_of_resources) {
        this.use_of_resources = use_of_resources;
        return this;
    }

    public double getCost_orientation() {
        return cost_orientation;
    }

    public Evaluation setCost_orientation(double cost_orientation) {
        this.cost_orientation = cost_orientation;
        return this;
    }

    public double getKnowledge_of_languages() {
        return knowledge_of_languages;
    }

    public Evaluation setKnowledge_of_languages(double knowledge_of_languages) {
        this.knowledge_of_languages = knowledge_of_languages;
        return this;
    }

    public double getDigital_skills() {
        return digital_skills;
    }

    public Evaluation setDigital_skills(double digital_skills) {
        this.digital_skills = digital_skills;
        return this;
    }
}
