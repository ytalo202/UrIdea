package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class EvaluationEntity extends BaseEntity{

    public EvaluationEntity() {
        super();
    }

    public EvaluationEntity(Connection connection) {
        super(connection,"evaluations");
    }

    public List<Evaluation> findAll(EmployeeEntity employeeEntity,
                                    CompanyEntity companyEntity,
                                    UserTypeEntity userTypeEntity,
                                    EmailAddressEntity emailAddressEntity,
                                    StateCompanyEntity stateCompanyEntity) {
        return findByCriteria("",employeeEntity, companyEntity, userTypeEntity,
                emailAddressEntity,stateCompanyEntity);
    }
    public Evaluation findById(String id,
                             EmployeeEntity employeeEntity,
                             CompanyEntity companyEntity,
                             UserTypeEntity userTypeEntity,
                             EmailAddressEntity emailAddressEntity,
                             StateCompanyEntity stateCompanyEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria,employeeEntity, companyEntity, userTypeEntity,
                emailAddressEntity,stateCompanyEntity).get(0);
    }

    public Evaluation findByIdEvaluator(String id,
                                      EmployeeEntity employeeEntity,
                                      CompanyEntity companyEntity,
                                      UserTypeEntity userTypeEntity,
                                      EmailAddressEntity emailAddressEntity,
                                      StateCompanyEntity stateCompanyEntity) {
        String criteria = "id_evaluator = " + "'" + id + "'";
        return findByCriteria(criteria, employeeEntity,companyEntity, userTypeEntity,
                emailAddressEntity,stateCompanyEntity).get(0);
    }



    public Evaluation findByFirstLastName(String userEmployee,
                                        EmployeeEntity employeeEntity,
                                        CompanyEntity companyEntity,
                                        UserTypeEntity userTypeEntity,
                                        EmailAddressEntity emailAddressEntity,
                                        StateCompanyEntity stateCompanyEntity) {
        String criteria = "id_user_employee = " + "'" + userEmployee + "'";
        return findByCriteria(criteria, employeeEntity,companyEntity, userTypeEntity,
                emailAddressEntity,stateCompanyEntity).get(0);
    }


    public List<Evaluation> findByCriteria(String criteria,
                                           EmployeeEntity employeeEntity,
                                           CompanyEntity companyEntity,
                                           UserTypeEntity userTypeEntity,
                                           EmailAddressEntity emailAddressEntity,
                                           StateCompanyEntity stateCompanyEntity) {

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Evaluation> evaluations = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evaluations.add(Evaluation.build(rs,
                    employeeEntity,companyEntity,
                    userTypeEntity,emailAddressEntity,stateCompanyEntity));

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








}
