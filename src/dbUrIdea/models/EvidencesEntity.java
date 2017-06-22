package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class EvidencesEntity extends BaseEntity {
    public EvidencesEntity() {
        super();
    }

    public EvidencesEntity(Connection connection) {
        super(connection,"evidences");
    }

    public List<Evidence> findAll(EvidencesTypesEntity evidencesTypesEntity,
                                  EvaluationsEntity evaluationsEntity,
                                  CompaniesEntity companiesEntity
            ,EmployeesEntity employeesEntity,
                                  EmailAddressesEntity emailAddressesEntity,
                                  UserTypesEntity userTypesEntity,
                                  StatesCompaniesEntity statesCompaniesEntity
                               ) {
        return findByCriteria("", evidencesTypesEntity,evaluationsEntity,
                companiesEntity,employeesEntity,emailAddressesEntity,userTypesEntity,statesCompaniesEntity);
    }

    public Evidence findById(String id,
                             EvidencesTypesEntity evidencesTypesEntity,
                             EvaluationsEntity evaluationsEntity,
                             CompaniesEntity companiesEntity,
                             EmployeesEntity employeesEntity,
                             EmailAddressesEntity emailAddressesEntity,
                             UserTypesEntity userTypesEntity,
                             StatesCompaniesEntity statesCompaniesEntity

    ) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, evidencesTypesEntity,evaluationsEntity,
                companiesEntity,employeesEntity,emailAddressesEntity,userTypesEntity,statesCompaniesEntity).get(0);
    }


    public List<Evidence> findByCriteria(String criteria, EvidencesTypesEntity evidencesTypesEntity,
                                         EvaluationsEntity evaluationsEntity,
                                         CompaniesEntity companiesEntity
            ,EmployeesEntity employeesEntity,
                                         EmailAddressesEntity emailAddressesEntity,
                                         UserTypesEntity userTypesEntity,
                                         StatesCompaniesEntity statesCompaniesEntity

    ) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Evidence> evidences = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) evidences.add(Evidence.build(
                    rs,evidencesTypesEntity,evaluationsEntity,companiesEntity,employeesEntity,emailAddressesEntity,userTypesEntity,statesCompaniesEntity));
            return evidences;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return evidences;
    }
    public boolean delete(Evidence evidence) {
        String sql = "DELETE FROM evidence WHERE id = " +
                evidence.getIdAsValue();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM evidence WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }

    public boolean add(Evidence evidence) {
        String sql = "INSERT INTO evidences(id, id_evidence_type,id_evaluation) " +
                "VALUES("
                +evidence.getIdAsValue() + ", "
                +evidence.getEvidencesType().getIdAsString()+ ", "
                +evidence.getEvaluation().getIdAsValue()+ ") ";

        return change(sql);
    }

}
