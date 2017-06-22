package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by UrIdea on 15/06/2017.
 */
public class Evidence {
    private String id;
    private EvidencesType evidencesType;
    private Evaluation evaluation;

    public Evidence() {
    }

    public Evidence(String id, EvidencesType evidencesType, Evaluation evaluation) {
        this.setId(id);
        this.setEvidencesType(evidencesType);
        this.setEvaluation(evaluation);
    }


    public String getId() {
        return id;
    }

    public Evidence setId(String id) {
        this.id = id;
        return this;
    }

    public String getIdAsValue() {
        return "'" + getId() + "'";
    }


    public EvidencesType getEvidencesType() {
        return evidencesType;
    }

    public Evidence setEvidencesType(EvidencesType evidencesType) {
        this.evidencesType = evidencesType;
        return this;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public Evidence setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
        return this;
    }


    public static Evidence build(ResultSet rs, EvidencesTypesEntity evidencesTypesEntity,
                                 EvaluationsEntity evaluationsEntity,
                                 CompaniesEntity companiesEntity
            ,EmployeesEntity employeesEntity,
                                 EmailAddressesEntity emailAddressesEntity,
                                 UserTypesEntity userTypesEntity,
                                 StatesCompaniesEntity statesCompaniesEntity) {
        try {
            return (new Evidence())
                    .setId(rs.getString("id"))

                    .setEvidencesType(evidencesTypesEntity.findById
                            (rs.getInt("id_evidence_type")))
                    .setEvaluation(evaluationsEntity.findById
                            (rs.getString("id_evaluation"),employeesEntity,companiesEntity,userTypesEntity,emailAddressesEntity,statesCompaniesEntity));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
