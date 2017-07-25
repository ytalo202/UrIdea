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

                getDefaultAgvQuery()
                //getDefaultQuery()
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

    public boolean add(Evaluation evaluation) {
        String sql = "INSERT evaluations(id_evaluator, id_user_employee," +
                " id_company, grade, commitment, communication, ethic, team_management," +
                " decision_making, strategic_thinking, customer_orientation, social_responsability," +
                " time_management, use_of_resources, cost_orientation, knowledge_of_languages," +
                " digital_skills) " +
                "VALUES("
                +evaluation.getIdEmployee().getIdAsString()+ ", "
                +evaluation.getIdUserEmployee().getIdAsString()+ ", "
                +evaluation.getCompany().getIdAsString()+ ", "
                +evaluation.getGradeAsString()+ ", "
                +evaluation.getCommitmentAsString()+ ", "
                +evaluation.getCommunicationAsString()+ ", "
                +evaluation.getEthicAsString()+ ", "
                +evaluation.getTeam_managementAsString()+ ", "
                +evaluation.getAsDecision_makingString()+ ", "
                +evaluation.getStrategic_thinkingAsString()+ ", "
                +evaluation.getCustomer_orientationAsString()+ ", "
                +evaluation.getSocial_responsabilityAsString()+ ", "
                +evaluation.getTime_managementAsString()+ ", "
                +evaluation.getUse_of_resourcesAsString()+ ", "
                +evaluation.getCost_orientationAsString()+ ", "
                +evaluation.getKnowledge_of_languagesAsString()+ ", "
                +evaluation.getDigital_skillsAsString()+")";

        return change(sql);
    }

/*
    public List<Evaluation> findEvaluationPromedioById(//int id,
                                                       EmployeesEntity employeesEntity,
                                                       CompaniesEntity companiesEntity,
                                                       EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity) {
        String sql ="select id_user_employee, avg(grade), avg(communication), " +
                "avg(ethic), avg(team_management),avg(decision_making), "+
                "avg(strategic_thinking), avg(customer_orientation), avg(social_responsability),avg(time_management),"+
                "avg(use_of_resources), avg(cost_orientation), avg(knowledge_of_languages),avg(digital_skills) from"+
                " evaluations where id_user_employee = 15";
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
    }*/



    public List<Evaluation> findByAGV(String criteria,
                                           EmployeesEntity employeesEntity,
                                           CompaniesEntity companiesEntity,
                                           EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity
    ) {

        String sql = getDefaultAgvQuery() +
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




}
