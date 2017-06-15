package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class EmailAdreessEntity extends BaseEntity {

    public EmailAdreessEntity(Connection connection) {

        super(connection,"emails_address");
    }

    public EmailAdreessEntity() {

        super();
    }
    List<EmailAddress> findAll() {
        return findByCriteria("");
    }


    public EmailAddress findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }


    public EmailAddress findByEmailData(String name) {
        String criteria = " email_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<EmailAddress> findAllOrderedByEmail() {
        String criteria = "true ORDER BY email_name";
        return findByCriteria(criteria);
    }

    public List<EmailAddress> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<EmailAddress> emails_addreses = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                emails_addreses.add((new EmailAddress())
                        .setId(resultSet.getInt("id"))
                        .setEmailData(resultSet.getString("email_name")));
            }
            return emails_addreses;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}
