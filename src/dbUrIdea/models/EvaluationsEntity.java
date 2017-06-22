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
                                    UserTypesEntity userTypesEntity,
                                    EmailAddressesEntity emailAddressesEntity,
                                    StatesCompaniesEntity statesCompaniesEntity) {
        return findByCriteria("", employeesEntity, companiesEntity, userTypesEntity,
                emailAddressesEntity, statesCompaniesEntity);
    }
    public Evaluation findById(String id,
                             EmployeesEntity employeesEntity,
                             CompaniesEntity companiesEntity,
                             UserTypesEntity userTypesEntity,
                             EmailAddressesEntity emailAddressesEntity,
                             StatesCompaniesEntity statesCompaniesEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity, userTypesEntity,
                emailAddressesEntity, statesCompaniesEntity).get(0);
    }

    public Evaluation findByIdEvaluator(String id,
                                      EmployeesEntity employeesEntity,
                                      CompaniesEntity companiesEntity,
                                      UserTypesEntity userTypesEntity,
                                      EmailAddressesEntity emailAddressesEntity,
                                      StatesCompaniesEntity statesCompaniesEntity) {
        String criteria = "id_evaluator = " + "'" + id + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity, userTypesEntity,
                emailAddressesEntity, statesCompaniesEntity).get(0);
    }



    public Evaluation findByFirstLastName(String userEmployee,
                                        EmployeesEntity employeesEntity,
                                        CompaniesEntity companiesEntity,
                                        UserTypesEntity userTypesEntity,
                                        EmailAddressesEntity emailAddressesEntity,
                                        StatesCompaniesEntity statesCompaniesEntity) {
        String criteria = "id_user_employee = " + "'" + userEmployee + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity, userTypesEntity,
                emailAddressesEntity, statesCompaniesEntity).get(0);
    }


    public List<Evaluation> findByCriteria(String criteria,
                                           EmployeesEntity employeesEntity,
                                           CompaniesEntity companiesEntity,
                                           UserTypesEntity userTypesEntity,
                                           EmailAddressesEntity emailAddressesEntity,
                                           StatesCompaniesEntity statesCompaniesEntity) {

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Evaluation> evaluations = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evaluations.add(Evaluation.build(rs,
                    employeesEntity, companiesEntity,
                    userTypesEntity, emailAddressesEntity, statesCompaniesEntity));

            return evaluations;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return evaluations;
    }

    public boolean update(Evaluation evaluation) {
        String sql = "UPDATE evaluations SET " +
                "password = "+evaluation.getGradeAsString()+
                " WHERE id = " + evaluation.getIdAsValue();

        return change(sql);
    }

    public boolean delete(Evaluation evaluation) {
        String sql = "DELETE FROM evaluations WHERE id = " +
                evaluation.getIdAsValue();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM evaluations WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }

    public boolean add(Evaluation evaluation) {
        String sql = "INSERT INTO evaluations(id, id_evaluator,id_user_employee,id_company,date,grade) " +
                "VALUES("
                +evaluation.getIdAsValue() + ", "
                +evaluation.getIdEmployee().getIdAsValue()+ ", "
                +evaluation.getIdUserEmployee().getIdAsValue()+ ", "
                +evaluation.getCompany().getIdAsValue()+ ", "
                +evaluation.getDateAsString()+ ", "
                +evaluation.getDateAsString()+ ") ";

        return change(sql);
    }






}