package dbUrIdea.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by UrIdea on 15/06/2017.
 */
    public class Commentary {
    private int id;
    private int commentaryType;
    private Evaluation evaluation;
    private String detail;

    public Commentary() {
    }

    public Commentary(int id, int commentaryType, Evaluation evaluation, String detail) {
        this.id = id;
        this.commentaryType = commentaryType;
        this.evaluation = evaluation;
        this.detail = detail;
    }

    public int getId() {
        return id;
    }

    public Commentary setId(int id) {
        this.id = id;
        return this;
    }

    public String getCommentaryTypeAsString(){return String.valueOf(getCommentaryType());}


    public String getDetailAsValue(){return "'"+ getDetail()+"'";}
    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public int getCommentaryType() {
        return commentaryType;
    }

    public Commentary setCommentaryType(int commentaryType) {
        this.commentaryType = commentaryType;
        return this;
    }

    public String getDetail() {
        return detail;
    }


    public Commentary setDetail(String detail) {
        this.detail = detail;
        return this;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public Commentary setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
        return this;
    }



    public static Commentary build(ResultSet rs, EvaluationsEntity evaluationsEntity,
                                   CompaniesEntity companiesEntity
            , EmployeesEntity employeesEntity, EmailAddressesEntity emailAddressesEntity,AreasEntity areasEntity) {
        try {
            return (new Commentary())
                    .setId(rs.getInt("id"))
                    .setEvaluation(evaluationsEntity.findById
                            (rs.getInt("id_evaluation"),
                                    employeesEntity,companiesEntity,emailAddressesEntity,areasEntity))
                    .setCommentaryType(rs.getInt("comment_type"))
                    .setDetail(rs.getString("detail"))
                    ;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
