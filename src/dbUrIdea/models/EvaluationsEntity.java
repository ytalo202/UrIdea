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

                                    EmailAddressesEntity emailAddressesEntity
                                    ) {
        return findByCriteria("", employeesEntity, companiesEntity,
                emailAddressesEntity);
    }
    public Evaluation findById(String id,
                             EmployeesEntity employeesEntity,
                             CompaniesEntity companiesEntity,
                             EmailAddressesEntity emailAddressesEntity
                             ) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity).get(0);
    }

    public Evaluation findByIdEvaluator(String id,
                                      EmployeesEntity employeesEntity,
                                      CompaniesEntity companiesEntity,
                                      EmailAddressesEntity emailAddressesEntity
                                      ) {
        String criteria = "id_evaluator = " + "'" + id + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity).get(0);
    }



    public Evaluation findByFirstLastName(String userEmployee,
                                        EmployeesEntity employeesEntity,
                                        CompaniesEntity companiesEntity,
                                        EmailAddressesEntity emailAddressesEntity
                                       ) {
        String criteria = "id_user_employee = " + "'" + userEmployee + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity,
                emailAddressesEntity).get(0);
    }


    public List<Evaluation> findByCriteria(String criteria,
                                           EmployeesEntity employeesEntity,
                                           CompaniesEntity companiesEntity,
                                           EmailAddressesEntity emailAddressesEntity
                                          ) {

        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Evaluation> evaluations = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evaluations.add(Evaluation.build(rs,
                    employeesEntity, companiesEntity,
                    emailAddressesEntity));

            return evaluations;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return evaluations;
    }

    public boolean update(Evaluation evaluation) {
        String sql = "UPDATE evaluations SET evaluation_date = "
                +evaluation.getDateAsValue()+", "+
                "grade = "+evaluation.getGradeAsString()+
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
        String sql = "INSERT evaluations(id, id_evaluator, id_user_employee," +
                " id_company, evaluation_date, grade) " +
                "VALUES("
                +evaluation.getIdAsValue() + ", "
                +evaluation.getIdEmployee().getIdAsValue()+ ", "
                +evaluation.getIdUserEmployee().getIdAsValue()+ ", "
                +evaluation.getCompany().getIdAsValue()+ ", "
                +evaluation.getDateAsValue()+ ", "
                +evaluation.getGradeAsString()+ ") ";

        return change(sql);
    }






}
