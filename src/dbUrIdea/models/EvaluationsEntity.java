package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class EvaluationsEntity extends BaseEntity{

    public EvaluationsEntity() {
        super();
    }

    public EvaluationsEntity(Connection connection) {

        super(connection,"evaluations");
    }

    public List<Evaluation> findbyIdEmpleadoListado(int id,EmployeesEntity employeesEntity,
                                                    CompaniesEntity companiesEntity,

                                                    EmailAddressesEntity
                                                            emailAddressesEntity,AreasEntity areasEntity
    ) {

        String criteria = "id_user_employee = "+id+" ORDER BY id DESC";

        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity,areasEntity);
    }


    public List<Evaluation> findAll(EmployeesEntity employeesEntity,
                                    CompaniesEntity companiesEntity,

                                    EmailAddressesEntity
                                            emailAddressesEntity,AreasEntity areasEntity
                                    ) {
        return findByCriteria("", employeesEntity, companiesEntity,
                emailAddressesEntity,areasEntity);
    }
    public Evaluation findById(int id,
                             EmployeesEntity employeesEntity,
                             CompaniesEntity companiesEntity,
                             EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
                             ) {
        String criteria = "id = " + String.valueOf(id);
        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity,areasEntity).get(0);
    }

    public Evaluation findByIdEvaluator(int id,
                                      EmployeesEntity employeesEntity,
                                      CompaniesEntity companiesEntity,
                                      EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
                                      ) {
        String criteria = "id_evaluator = " +String.valueOf(id); ;
        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity,areasEntity).get(0);
    }




    public List<Evaluation> findbyIdEmpleado(int id,EmployeesEntity employeesEntity,
                                    CompaniesEntity companiesEntity,

                                    EmailAddressesEntity
                                            emailAddressesEntity,AreasEntity areasEntity
    ) {

        String criteria = "id_user_employee = " +id;

        return findByAGV(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity,areasEntity);
    }



    public Evaluation findByFirstLastName(String userEmployee,
                                        EmployeesEntity employeesEntity,
                                        CompaniesEntity companiesEntity,
                                        EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
                                       ) {
        String criteria = "id_user_employee = " + "'" + userEmployee + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity,areasEntity).get(0);
    }


    public List<Evaluation> findByCriteria(String criteria,
                                           EmployeesEntity employeesEntity,
                                           CompaniesEntity companiesEntity,
                                           EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
                                          ) {

        String sql =

                //getDefaultAgvQuery()
                getDefaultQuery()
                +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Evaluation> evaluations = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evaluations.add(Evaluation.build(rs,
                    employeesEntity, companiesEntity,
                    emailAddressesEntity,areasEntity));

            return evaluations;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return evaluations;
    }
/*
    public boolean update(Evaluation evaluation) {
        String sql = "UPDATE evaluations SET " +
                "grade = "+evaluation.getGradeAsString()+
                "commitment = "+evaluation.getCommitmentAsString()+ ", "+
                "communication = "+evaluation.getCommunicationAsString()+ ", "+
                "ethic = "+evaluation.getEthicAsString()+ ", "+
                "team_management = "+evaluation.getTeam_managementAsString()+ ", "+
                "decision_making = "+evaluation.getAsDecision_makingString()+ ", "+
                "strategic_thinking ="+evaluation.getStrategic_thinkingAsString()+ ", "+
                "customer_orientation = "+evaluation.getCustomer_orientationAsString()+ ", "+
                "social_responsability = "+evaluation.getSocial_responsabilityAsString()+ ", "+
                "time_management = "+evaluation.getTime_managementAsString()+ ", "+
                "use_of_resources = "+evaluation.getUse_of_resourcesAsString()+ ", "+
                "cost_orientation = "+evaluation.getCost_orientationAsString()+ ", "+
                "knowledge_of_languages = "+evaluation.getKnowledge_of_languagesAsString()+ ", "+
                "digital_skills = "+evaluation.getDigital_skillsAsString()+


                " WHERE id = " + evaluation.getIdAsString();

        return change(sql);
    }

    */

    public boolean delete(Evaluation evaluation) {
        String sql = "DELETE FROM evaluations WHERE id = " +
                evaluation.getIdAsString();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM evaluations WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }

    public boolean addInformatica(Evaluation evaluation) {
        String sql = "INSERT evaluations(id_evaluator,id_user_employee, " +
                " id_company, id_area, grade, grade1, grade2," +
                " commitment_company, competitive, work_under_pressure, proactive," +
                " honesty, organized, responsibility, respect, language_skills, computer_skills, market_knowledge, productivity, efficiency, give_successful_solutions, innovative," +
                " comment, avg_grade) " +
                "VALUES("
                +evaluation.getIdEvaluator().getId2AsString()+ ", "
                +evaluation.getIdUserEmployee().getIdAsString()+ ", "
                +evaluation.getCompany().getIdAsString()+ ", "
                +evaluation.getArea().getIdAsString()+ ", "
                +evaluation.getGradeAsString()+ ", "
                +evaluation.getGrade1AsString()+", "
                +evaluation.getGrade2AsString()+", "
                //actitud
                +evaluation.getCommitment_companyAsString()+", "
                +evaluation.getCompetitiveAsString()+ ", "
                +evaluation.getWork_under_pressureAsString()+", "
                +evaluation.getProactiveAsString()+", "
                //valores
                +evaluation.getHonestyAsString()+", "
                +evaluation.getOrganizedAsString()+", "
                +evaluation.getResponsibilityAsString()+", "
                +evaluation.getRespectAsString()+", "
                //crecimiento Profecional
                +evaluation.getLanguage_skillsAsString()+ ", "
                +evaluation.getComputer_skillsAsString()+", "
                +evaluation.getMarket_knowledgeAsString()+", "
                +evaluation.getProductivityAsString()+", "
                +evaluation.getEfficiencyAsString()+", "
                +evaluation.getGive_successful_solutionsAsString()+", "
                +evaluation.getInnovativeAsString()+", "

                +evaluation.getCommentAsValue()+", "
                +evaluation.getAvg_gradeAsString()+
                ")";
        return change(sql);
    }


    public boolean addMarketing(Evaluation evaluation) {
        String sql = "INSERT evaluations(id_evaluator,id_user_employee, " +
                " id_company, id_area, grade, grade1, grade2," +
                " commitment_company, leadership, analytical, objective, decision_making," +
                " punctuality, honesty, organized, responsibility, respect," +
                " language_skills, business_skills, business_knowledge, market_knowledge, productivity, communication_skills, innovative," +
                " comment, avg_grade) " +
                "VALUES("
                +evaluation.getIdEvaluator().getId2AsString()+ ", "
                +evaluation.getIdUserEmployee().getIdAsString()+ ", "
                +evaluation.getCompany().getIdAsString()+ ", "
                +evaluation.getArea().getIdAsString()+ ", "
                +evaluation.getGradeAsString()+ ", "
                +evaluation.getGrade1AsString()+", "
                +evaluation.getGrade2AsString()+", "
                //actitud
                +evaluation.getCommitment_companyAsString()+", "
                +evaluation.getLeadershipAsString()+", "
                +evaluation.getAnalyticalAsString()+", "
                +evaluation.getObjectiveAsString()+", "
                +evaluation.getDecision_makingAsString()+", "

                //valores
                +evaluation.getPunctualityAsString()+", "
                +evaluation.getHonestyAsString()+", "
                +evaluation.getOrganizedAsString()+", "
                +evaluation.getResponsibilityAsString()+", "
                +evaluation.getRespectAsString()+", "
                //crecimiento Profecional
                +evaluation.getLanguage_skillsAsString()+ ", "
                +evaluation.getBusiness_skillsAsString()+", "
                +evaluation.getBusiness_knowledgeAsString()+", "
                +evaluation.getMarket_knowledgeAsString()+", "
                +evaluation.getProductivityAsString()+", "
                +evaluation.getCommunication_skillsAsString()+", "
                +evaluation.getInnovativeAsString()+", "

                +evaluation.getCommentAsValue()+", "
                +evaluation.getAvg_gradeAsString()+
                ")";
        return change(sql);
    }


    public boolean addProduction(Evaluation evaluation) {
        String sql = "INSERT evaluations(id_evaluator,id_user_employee, " +
                " id_company, id_area, grade, grade1, grade2," +
                " commitment_company, work_under_pressure, teamwork, proactive," +
                " punctuality, honesty, organized, responsibility, respect," +
                " efficiency, performance, productivity, resource_optimization, innovative," +
                " comment, avg_grade) " +
                "VALUES("
                +evaluation.getIdEvaluator().getId2AsString()+ ", "
                +evaluation.getIdUserEmployee().getIdAsString()+ ", "
                +evaluation.getCompany().getIdAsString()+ ", "
                +evaluation.getArea().getIdAsString()+ ", "
                +evaluation.getGradeAsString()+ ", "
                +evaluation.getGrade1AsString()+", "
                +evaluation.getGrade2AsString()+", "
                //actitud
                +evaluation.getCommitment_companyAsString()+", "
                +evaluation.getWork_under_pressureAsString()+", "
                +evaluation.getTeamworkAsString()+", "
                +evaluation.getProactiveAsString()+", "

                //valores
                +evaluation.getPunctualityAsString()+", "
                +evaluation.getHonestyAsString()+", "
                +evaluation.getOrganizedAsString()+", "
                +evaluation.getResponsibilityAsString()+", "
                +evaluation.getRespectAsString()+", "

                //crecimiento Profecional
                +evaluation.getEfficiencyAsString()+", "
                +evaluation.getPerformanceAsString()+", "
                +evaluation.getProductivityAsString()+", "
                +evaluation.getResource_optimizationAsString()+", "
                +evaluation.getInnovativeAsString()+", "

                +evaluation.getCommentAsValue()+", "
                +evaluation.getAvg_gradeAsString()+
                ")";
        return change(sql);
    }


    public boolean addAdministration(Evaluation evaluation) {
        String sql = "INSERT evaluations(id_evaluator,id_user_employee, " +
                " id_company, id_area, grade, grade1, grade2," +
                " commitment_company, proactive, objective, decision_making, teamwork," +
                " punctuality, honesty, organized, responsibility, respect," +
                " communication_skills, language_skills, business_skills, " +
                "business_knowledge, resource_optimization, productivity, efficiency, innovative," +
                " comment, avg_grade) " +
                "VALUES("
                +evaluation.getIdEvaluator().getId2AsString()+ ", "
                +evaluation.getIdUserEmployee().getIdAsString()+ ", "
                +evaluation.getCompany().getIdAsString()+ ", "
                +evaluation.getArea().getIdAsString()+ ", "
                +evaluation.getGradeAsString()+ ", "
                +evaluation.getGrade1AsString()+", "
                +evaluation.getGrade2AsString()+", "
                //actitud
                +evaluation.getCommitment_companyAsString()+", "
                +evaluation.getProactiveAsString()+", "
                +evaluation.getObjectiveAsString()+", "
                +evaluation.getDecision_makingAsString()+", "
                +evaluation.getTeamworkAsString()+", "

                //valores
                +evaluation.getPunctualityAsString()+", "
                +evaluation.getHonestyAsString()+", "
                +evaluation.getOrganizedAsString()+", "
                +evaluation.getResponsibilityAsString()+", "
                +evaluation.getRespectAsString()+", "
                //crecimiento Profecional
                +evaluation.getCommunication_skillsAsString()+", "
                +evaluation.getLanguage_skillsAsString()+", "
                +evaluation.getBusiness_skillsAsString()+", "
                +evaluation.getBusiness_knowledgeAsString()+", "
                +evaluation.getResource_optimizationAsString()+", "
                +evaluation.getProductivityAsString()+", "
                +evaluation.getEfficiencyAsString()+", "
                +evaluation.getInnovativeAsString()+", "

                +evaluation.getCommentAsValue()+", "
                +evaluation.getAvg_gradeAsString()+
                ")";
        return change(sql);
    }


    public boolean addPractitioners(Evaluation evaluation) {
        String sql = "INSERT evaluations(id_evaluator,id_user_employee, " +
                " id_company, id_area, grade, grade1, grade2," +
                " commitment_company, proactive, teamwork, decision_making," +
                " punctuality, honesty, organized, responsibility, respect," +
                " performance, efficiency, productivity, innovative," +
                " comment, avg_grade) " +
                "VALUES("
                +evaluation.getIdEvaluator().getId2AsString()+ ", "
                +evaluation.getIdUserEmployee().getIdAsString()+ ", "
                +evaluation.getCompany().getIdAsString()+ ", "
                +evaluation.getArea().getIdAsString()+ ", "
                +evaluation.getGradeAsString()+ ", "
                +evaluation.getGrade1AsString()+", "
                +evaluation.getGrade2AsString()+", "
                //actitud
                +evaluation.getCommitment_companyAsString()+", "
                +evaluation.getProactiveAsString()+", "
                +evaluation.getTeamworkAsString()+", "
                +evaluation.getDecision_makingAsString()+", "


                //valores
                +evaluation.getPunctualityAsString()+", "
                +evaluation.getHonestyAsString()+", "
                +evaluation.getOrganizedAsString()+", "
                +evaluation.getResponsibilityAsString()+", "
                +evaluation.getRespectAsString()+", "

                //crecimiento Profecional
                +evaluation.getPerformanceAsString()+", "
                +evaluation.getEfficiencyAsString()+", "
                +evaluation.getProductivityAsString()+", "
                +evaluation.getInnovativeAsString()+", "

                +evaluation.getCommentAsValue()+", "
                +evaluation.getAvg_gradeAsString()+
                ")";
        return change(sql);
    }



/*
    public List<Evaluation> findByNewCriterial(
                                                       EmployeesEntity employeesEntity,
                                                       CompaniesEntity companiesEntity,
                                                       EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity) {
        String sql ="INSERT evaluations(id_evaluator, id_user_employee,id_company,"+
                "grade, commitment, communication, ethic, team_management,decision_making," +
                "strategic_thinking, customer_orientation, social_responsability,time_management," +
                " use_of_resources, cost_orientation, knowledge_of_languages,digital_skills) \n";
        List<Evaluation> evaluations = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evaluations.add(Evaluation.build(rs,
                    employeesEntity, companiesEntity,
                    emailAddressesEntity,areasEntity));

            return evaluations;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return evaluations;
    }
*/

//nuevo build

    public List<Evaluation> findByAGV(String criteria,
                                           EmployeesEntity employeesEntity,
                                           CompaniesEntity companiesEntity,
                                           EmailAddressesEntity emailAddressesEntity,
                                      AreasEntity areasEntity
    ) {

        String sql =
                getDefaultAgvQuery()+
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Evaluation> evaluations = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evaluations.add(Evaluation.build2(rs,
                    employeesEntity, companiesEntity,
                    emailAddressesEntity,areasEntity));

            return evaluations;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return evaluations;
    }




}
