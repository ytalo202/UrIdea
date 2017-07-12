package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class CommentsEntity extends BaseEntity {

    public CommentsEntity() {
        super();
    }

    public CommentsEntity(Connection connection) {
        super(connection,"comments");
    }

    public List<Commentary>
    findAll(EvaluationsEntity evaluationsEntity,CompaniesEntity companiesEntity,
                                    EmployeesEntity employeesEntity,
                                    EmailAddressesEntity emailAddressesEntity )
    {
        return findByCriteria("", evaluationsEntity,
                companiesEntity,employeesEntity,emailAddressesEntity);
    }

    public Commentary findById(String id,
                               EvaluationsEntity evaluationsEntity,
                               CompaniesEntity companiesEntity,
                               EmployeesEntity employeesEntity,
                               EmailAddressesEntity emailAddressesEntity
    ) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria,evaluationsEntity,
                companiesEntity,employeesEntity,emailAddressesEntity).get(0);
    }


    public List<Commentary> findByCriteria(String criteria,
                                           EvaluationsEntity evaluationsEntity,
                                           CompaniesEntity companiesEntity,
                                           EmployeesEntity employeesEntity,
                                           EmailAddressesEntity emailAddressesEntity)
    {
        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Commentary> comments = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) comments.add(Commentary.build(
                    rs,evaluationsEntity,companiesEntity,employeesEntity,emailAddressesEntity));
            return comments;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return comments;
    }
    public boolean delete(Commentary commentary) {
        String sql = "DELETE FROM commentary WHERE id = " +
                commentary.getIdAsValue();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM evidence WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }

    public boolean add(Commentary commentary) {
        String sql = "INSERT comments(id, id_evaluation, comment_type, detail) " +
                "VALUES("
                + commentary.getIdAsValue() + ", "
                + commentary.getEvaluation().getIdAsValue()+", "
                + commentary.getCommentaryTypeAsString()+", "
                + commentary.getDetailAsValue()+") ";

        return change(sql);
    }
    public boolean update(Commentary commentary) {
        String sql = "UPDATE comments SET comment_type = "
                + commentary.getCommentaryTypeAsString() +",detail = "
                + commentary.getDetailAsValue()
                + " WHERE id = " + commentary.getIdAsValue();
        return change(sql);
    }

}
