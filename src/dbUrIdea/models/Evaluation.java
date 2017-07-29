package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * Created by UrIdea on 14/06/2017.
 */
public class Evaluation {
 private int id;
  private Employee idEvaluator;
private Employee idUserEmployee;
private Company company;
 private Area area;

 private float grade;
 private float grade1;
  private float grade2;

 private String comment;

  private Timestamp date;

     private float avg_grade;

     private float competitive;
    private float commitment_company;
     private float teamwork;
     private float proactive;
     private float work_under_pressure;
     private float objective;
     private float analytical;
   private float decision_making;
    private float leadership;
    private float responsibility;
    private float punctuality;
    private float honesty;
    private float respect;
    private float organized;
    private float language_skills;
    private float computer_skills;
    private float give_successful_solutions;
    private float communication_skills;
    private float business_skills;
    private float business_knowledge;
    private float resource_optimization;
    private float market_knowledge;
    private float performance;
    private float efficiency;
    private float productivity;
    private float innovative;











    public Evaluation() {
    }

    public Evaluation(int id, Employee idEvaluator, Employee idUserEmployee, Company company, Area area, float grade, float grade1, float grade2, String comment, Timestamp date, float avg_grade, float competitive, float commitment_company, float teamwork, float proactive, float work_under_pressure, float objective, float analytical, float decision_making, float leadership, float responsibility, float punctuality, float honesty, float respect, float organized, float language_skills, float computer_skills, float give_successful_solutions, float communication_skills, float business_skills, float business_knowledge, float resource_optimization, float market_knowledge, float performance, float efficiency, float productivity, float innovative) {
        this.id = id;
        this.idEvaluator = idEvaluator;
        this.idUserEmployee = idUserEmployee;
        this.company = company;
        this.area = area;
        this.grade = grade;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.comment = comment;
        this.date = date;
        this.avg_grade = avg_grade;
        this.competitive = competitive;
        this.commitment_company = commitment_company;
        this.teamwork = teamwork;
        this.proactive = proactive;
        this.work_under_pressure = work_under_pressure;
        this.objective = objective;
        this.analytical = analytical;
        this.decision_making = decision_making;
        this.leadership = leadership;
        this.responsibility = responsibility;
        this.punctuality = punctuality;
        this.honesty = honesty;
        this.respect = respect;
        this.organized = organized;
        this.language_skills = language_skills;
        this.computer_skills = computer_skills;
        this.give_successful_solutions = give_successful_solutions;
        this.communication_skills = communication_skills;
        this.business_skills = business_skills;
        this.business_knowledge = business_knowledge;
        this.resource_optimization = resource_optimization;
        this.market_knowledge = market_knowledge;
        this.performance = performance;
        this.efficiency = efficiency;
        this.productivity = productivity;
        this.innovative = innovative;
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

    public String getCommentAsValue() {
        return "'" +getComment()+ "'";
    }

    public String getAvg_gradeAsString() {

        return String.valueOf(getAvg_grade());
    }

    public String getCompetitiveAsString() {
        return String.valueOf(getCompetitive());
    }
    public String getCommitment_companyAsString() {
        return String.valueOf(getCommitment_company());
    }
    public String getTeamworkAsString() {
        return String.valueOf(getTeamwork());
    }
    public String getProactiveAsString() {
        return String.valueOf(getProactive());
    }
    public String getWork_under_pressureAsString() {
        return String.valueOf(getWork_under_pressure());
    }
    public String getObjectiveAsString() {
        return String.valueOf(getObjective());
    }
    public String getAnalyticalAsString() {
        return String.valueOf(getAnalytical());
    }
    public String getDecision_makingAsString() {
        return String.valueOf(getDecision_making());
    }
    public String getLeadershipAsString() {
        return String.valueOf(getLeadership());
    }
    public String getResponsibilityAsString() {
        return String.valueOf(getResponsibility());
    }
    public String getPunctualityAsString() {
        return String.valueOf(getPunctuality());
    }
    public String getHonestyAsString() {
        return String.valueOf(getHonesty());
    }
    public String getRespectAsString() {
        return String.valueOf(getRespect());
    }
    public String getOrganizedAsString() {
        return String.valueOf(getOrganized());
    }

    public String getLanguage_skillsAsString() {
        return String.valueOf(getLanguage_skills());
    }
    public String getComputer_skillsAsString() {
        return String.valueOf(getComputer_skills());
    }
    public String getGive_successful_solutionsAsString() {
        return String.valueOf(getGive_successful_solutions());
    }

    public String getCommunication_skillsAsString() {
        return String.valueOf(getCommunication_skills());
    }
    public String getBusiness_skillsAsString() {
        return String.valueOf(getBusiness_skills());
    }
    public String getBusiness_knowledgeAsString() {
        return String.valueOf(getBusiness_knowledge());
    }
    public String getResource_optimizationAsString() {
        return String.valueOf(getResource_optimization());
    }
    public String getMarket_knowledgeAsString() {
        return String.valueOf(getMarket_knowledge());
    }
    public String getPerformanceAsString() {
        return String.valueOf(getPerformance());
    }
    public String getEfficiencyAsString() {
        return String.valueOf(getEfficiency());
    }
    public String getProductivityAsString() {
        return String.valueOf(getProductivity());
    }
    public String getInnovativeAsString() {
        return String.valueOf(getInnovative());
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
                    .setIdEvaluator(employeesEntity.findById(
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
                    .setGrade(rs.getFloat("grade"))
                    .setGrade1(rs.getFloat("grade1"))
                    .setGrade2(rs.getFloat("grade2"))
                    .setCompetitive(rs.getFloat("competitive"))
                    .setCommitment_company(rs.getFloat("commitment_company"))
                    .setTeamwork(rs.getFloat("teamwork"))
                    .setProactive(rs.getFloat("proactive"))
                    .setWork_under_pressure(rs.getFloat("work_under_pressure"))
                    .setObjective(rs.getFloat("objective"))
                    .setAnalytical(rs.getFloat("analytical"))
                    .setDecision_making(rs.getFloat("decision_making"))
                    .setLeadership(rs.getFloat("leadership"))
                    .setResponsibility(rs.getFloat("responsibility"))
                    .setPunctuality(rs.getFloat("punctuality"))
                    .setHonesty(rs.getFloat("honesty"))
                    .setRespect(rs.getFloat("respect"))
                    .setOrganized(rs.getFloat("organized"))
                    .setLanguage_skills(rs.getFloat("language_skills"))
                    .setComputer_skills(rs.getFloat("computer_skills"))
                    .setGive_successful_solutions(rs.getFloat("give_successful_solutions"))
                    .setCommunication_skills(rs.getFloat("communication_skills"))
                    .setBusiness_skills(rs.getFloat("business_skills"))
                    .setBusiness_knowledge(rs.getFloat("business_knowledge"))
                    .setResource_optimization(rs.getFloat("resource_optimization"))
                    .setMarket_knowledge(rs.getFloat("market_knowledge"))
                    .setPerformance(rs.getFloat("performance"))
                    .setEfficiency(rs.getFloat("efficiency"))
                    .setProductivity(rs.getFloat("productivity"))
                    .setInnovative(rs.getFloat("innovative"))
                    .setComment(rs.getString("comment"))
                    .setAvg_grade(rs.getFloat("avg_grade"))

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

    public Employee getIdEvaluator() {
        return idEvaluator;
    }

    public Evaluation setIdEvaluator(Employee idEvaluator) {
        this.idEvaluator = idEvaluator;
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

    public float getGrade() {
        return grade;
    }

    public Evaluation setGrade(float grade) {
        this.grade = grade;
        return this;
    }

    public float getGrade1() {
        return grade1;
    }

    public Evaluation setGrade1(float grade1) {
        this.grade1 = grade1;
        return this;
    }

    public float getGrade2() {
        return grade2;
    }

    public Evaluation setGrade2(float grade2) {
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

    public Timestamp getDate() {
        return date;
    }

    public Evaluation setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    public float getAvg_grade() {
        return avg_grade;
    }

    public Evaluation setAvg_grade(float avg_grade) {
        this.avg_grade = avg_grade;
        return this;
    }

    public float getCompetitive() {
        return competitive;
    }

    public Evaluation setCompetitive(float competitive) {
        this.competitive = competitive;
        return this;
    }

    public float getCommitment_company() {
        return commitment_company;
    }

    public Evaluation setCommitment_company(float commitment_company) {
        this.commitment_company = commitment_company;
        return this;
    }

    public float getTeamwork() {
        return teamwork;
    }

    public Evaluation setTeamwork(float teamwork) {
        this.teamwork = teamwork;
        return this;
    }

    public float getProactive() {
        return proactive;
    }

    public Evaluation setProactive(float proactive) {
        this.proactive = proactive;
        return this;
    }

    public float getWork_under_pressure() {
        return work_under_pressure;
    }

    public Evaluation setWork_under_pressure(float work_under_pressure) {
        this.work_under_pressure = work_under_pressure;
        return this;
    }

    public float getObjective() {
        return objective;
    }

    public Evaluation setObjective(float objective) {
        this.objective = objective;
        return this;
    }

    public float getAnalytical() {
        return analytical;
    }

    public Evaluation setAnalytical(float analytical) {
        this.analytical = analytical;
        return this;
    }

    public float getDecision_making() {
        return decision_making;
    }

    public Evaluation setDecision_making(float decision_making) {
        this.decision_making = decision_making;
        return this;
    }

    public float getLeadership() {
        return leadership;
    }

    public Evaluation setLeadership(float leadership) {
        this.leadership = leadership;
        return this;
    }

    public float getResponsibility() {
        return responsibility;
    }

    public Evaluation setResponsibility(float responsibility) {
        this.responsibility = responsibility;
        return this;
    }

    public float getPunctuality() {
        return punctuality;
    }

    public Evaluation setPunctuality(float punctuality) {
        this.punctuality = punctuality;
        return this;
    }

    public float getHonesty() {
        return honesty;
    }

    public Evaluation setHonesty(float honesty) {
        this.honesty = honesty;
        return this;
    }

    public float getRespect() {
        return respect;
    }

    public Evaluation setRespect(float respect) {
        this.respect = respect;
        return this;
    }

    public float getOrganized() {
        return organized;
    }

    public Evaluation setOrganized(float organized) {
        this.organized = organized;
        return this;
    }

    public float getLanguage_skills() {
        return language_skills;
    }

    public Evaluation setLanguage_skills(float language_skills) {
        this.language_skills = language_skills;
        return this;
    }

    public float getComputer_skills() {
        return computer_skills;
    }

    public Evaluation setComputer_skills(float computer_skills) {
        this.computer_skills = computer_skills;
        return this;
    }

    public float getGive_successful_solutions() {
        return give_successful_solutions;
    }

    public Evaluation setGive_successful_solutions(float give_successful_solutions) {
        this.give_successful_solutions = give_successful_solutions;
        return this;
    }

    public float getCommunication_skills() {
        return communication_skills;
    }

    public Evaluation setCommunication_skills(float communication_skills) {
        this.communication_skills = communication_skills;
        return this;
    }

    public float getBusiness_skills() {
        return business_skills;
    }

    public Evaluation setBusiness_skills(float business_skills) {
        this.business_skills = business_skills;
        return this;
    }

    public float getBusiness_knowledge() {
        return business_knowledge;
    }

    public Evaluation setBusiness_knowledge(float business_knowledge) {
        this.business_knowledge = business_knowledge;
        return this;
    }

    public float getResource_optimization() {
        return resource_optimization;
    }

    public Evaluation setResource_optimization(float resource_optimization) {
        this.resource_optimization = resource_optimization;
        return this;
    }

    public float getMarket_knowledge() {
        return market_knowledge;
    }

    public Evaluation setMarket_knowledge(float market_knowledge) {
        this.market_knowledge = market_knowledge;
        return this;
    }

    public float getPerformance() {
        return performance;
    }

    public Evaluation setPerformance(float performance) {
        this.performance = performance;
        return this;
    }

    public float getEfficiency() {
        return efficiency;
    }

    public Evaluation setEfficiency(float efficiency) {
        this.efficiency = efficiency;
        return this;
    }

    public float getProductivity() {
        return productivity;
    }

    public Evaluation setProductivity(float productivity) {
        this.productivity = productivity;
        return this;
    }

    public float getInnovative() {
        return innovative;
    }

    public Evaluation setInnovative(float innovative) {
        this.innovative = innovative;
        return this;
    }
}
