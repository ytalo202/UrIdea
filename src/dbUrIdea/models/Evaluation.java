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

    private double grade;
    private Timestamp date;
    private int commitment;
    private int communication;
    private int ethic;
    private int team_management;
    private int decision_making;
    private int strategic_thinking;
    private int customer_orientation;
    private int social_responsability;
    private int time_management;
    private int use_of_resources;
    private int cost_orientation;
    private int knowledge_of_languages;
    private int digital_skills;





    public Evaluation() {
    }

    public Evaluation(int id, Employee idEmployee, Employee idUserEmployee, Company company, double grade, Timestamp date, int commitment, int communication, int ethic, int team_management, int decision_making, int strategic_thinking, int customer_orientation, int social_responsability, int time_management, int use_of_resources, int cost_orientation, int knowledge_of_languages, int digital_skills) {
        this.id = id;
        this.idEmployee = idEmployee;
        this.idUserEmployee = idUserEmployee;
        this.company = company;
        this.grade = grade;
        this.setDate(date);
        this.setCommitment(commitment);
        this.setCommunication(communication);
        this.setEthic(ethic);
        this.setTeam_management(team_management);
        this.setDecision_making(decision_making);
        this.setStrategic_thinking(strategic_thinking);
        this.setCustomer_orientation(customer_orientation);
        this.setSocial_responsability(social_responsability);
        this.setTime_management(time_management);
        this.setUse_of_resources(use_of_resources);
        this.setCost_orientation(cost_orientation);
        this.setKnowledge_of_languages(knowledge_of_languages);
        this.setDigital_skills(digital_skills);
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

    public String getCommitmentAsString() {
        return String.valueOf(getId());
    }
    public String getCommunicationAsString() {
        return String.valueOf(getId());
    }
    public String getAsEthicString() {
        return String.valueOf(getId());
    }
    public String getTeam_managementAsString() {
        return String.valueOf(getId());
    }
    public String getAsDecision_makingString() {
        return String.valueOf(getId());
    }
    public String getStrategic_thinkingAsString() {
        return String.valueOf(getId());
    }
    public String getCustomer_orientationAsString() {
        return String.valueOf(getId());
    }
    public String getSocial_responsabilityAsString() {
        return String.valueOf(getId());
    }
    public String getTime_managementAsString() {
        return String.valueOf(getId());
    }

    public String getUse_of_resourcesAsString() {
        return String.valueOf(getId());
    }

    public String getCost_orientationAsString() {
        return String.valueOf(getId());
    }

    public String getKnowledge_of_languagesAsString() {
        return String.valueOf(getId());
    }

    public String getDigital_skillsAsString() {
        return String.valueOf(getId());
    }







    public double getId() {
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



    public double getGrade() {
        return grade;
    }

    public Evaluation setGrade(double grade) {
        this.grade = grade;
        return this;
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
                    .setDate(rs.getTimestamp("evaluation_date_and_time"))
                    .setGrade(rs.getDouble("grade"))
                    .setCommitment(rs.getInt("commitment"))
                    .setCommunication(rs.getInt("communication"))
                    .setEthic(rs.getInt("ethic"))
                    .setTeam_management(rs.getInt("team_management"))
                    .setDecision_making(rs.getInt("decision_making"))
                    .setStrategic_thinking(rs.getInt("strategic_thinking"))
                    .setCustomer_orientation(rs.getInt("customer_orientation"))
                    .setSocial_responsability(rs.getInt("social_responsability"))
                    .setTime_management(rs.getInt("time_management"))
                    .setUse_of_resources(rs.getInt("use_of_resources"))
                    .setCost_orientation(rs.getInt("cost_orientation"))
                    .setKnowledge_of_languages(rs.getInt("knowledge_of_languages"))
                    .setDigital_skills(rs.getInt("digital_skills"));





        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Timestamp getDate() {
        return date;
    }

    public Evaluation setDate(Timestamp date) {
        this.date = date;
        return this;
    }

    public int getCommitment() {
        return commitment;
    }

    public Evaluation setCommitment(int commitment) {
        this.commitment = commitment;
        return this;
    }

    public int getCommunication() {
        return communication;
    }

    public Evaluation setCommunication(int communication) {
        this.communication = communication;
        return this;
    }

    public int getEthic() {
        return ethic;
    }

    public Evaluation setEthic(int ethic) {
        this.ethic = ethic;
        return this;
    }

    public int getTeam_management() {
        return team_management;
    }

    public Evaluation setTeam_management(int team_management) {
        this.team_management = team_management;
        return this;
    }

    public int getDecision_making() {
        return decision_making;
    }

    public Evaluation setDecision_making(int decision_making) {
        this.decision_making = decision_making;
        return this;
    }

    public int getStrategic_thinking() {
        return strategic_thinking;
    }

    public Evaluation setStrategic_thinking(int strategic_thinking) {
        this.strategic_thinking = strategic_thinking;
        return this;
    }

    public int getCustomer_orientation() {
        return customer_orientation;
    }

    public Evaluation setCustomer_orientation(int customer_orientation) {
        this.customer_orientation = customer_orientation;
        return this;
    }

    public int getSocial_responsability() {
        return social_responsability;
    }

    public Evaluation setSocial_responsability(int social_responsability) {
        this.social_responsability = social_responsability;
        return this;
    }

    public int getTime_management() {
        return time_management;
    }

    public Evaluation setTime_management(int time_management) {
        this.time_management = time_management;
        return this;
    }

    public int getUse_of_resources() {
        return use_of_resources;
    }

    public Evaluation setUse_of_resources(int use_of_resources) {
        this.use_of_resources = use_of_resources;
        return this;
    }

    public int getCost_orientation() {
        return cost_orientation;
    }

    public Evaluation setCost_orientation(int cost_orientation) {
        this.cost_orientation = cost_orientation;
        return this;
    }

    public int getKnowledge_of_languages() {
        return knowledge_of_languages;
    }

    public Evaluation setKnowledge_of_languages(int knowledge_of_languages) {
        this.knowledge_of_languages = knowledge_of_languages;
        return this;
    }

    public int getDigital_skills() {
        return digital_skills;
    }

    public Evaluation setDigital_skills(int digital_skills) {
        this.digital_skills = digital_skills;
        return this;
    }
}
