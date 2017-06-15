package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class EmailAddressEntity extends BaseEntity {

    public EmailAddressEntity(Connection connection) {

        super(connection,"emails_addresses");
    }

    public EmailAddressEntity() {

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


    public EmailAddress findByEmailData(String email) {
        String criteria = " email_name = '" +
                email + "'";
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
                emails_addreses.add(EmailAddress.build(resultSet));
            }
            return emails_addreses;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(EmailAddress emailAddress) {
        String sql = "INSERT INTO emails_addresses(id, email_name) " +
                "VALUES(" + emailAddress.getId() + ", " +
                emailAddress.getEmailData() + ")";
        return change(sql);
    }

    public boolean delete(EmailAddress emailAddress) {
        String sql = "DELETE FROM emails_addresses WHERE id = " + emailAddress.getIdAsString();
        return change(sql);
    }
    public boolean delete(String email) {
        return change("DELETE FROM emails_addresses WHERE email_data = " +
                "'" + email + "'");
    }

    public boolean update(EmailAddress emailAddress) {
        String sql = "UPDATE emails_addresses SET email_data = " +
                emailAddress.getEmailData() +
                " WHERE id = " + emailAddress.getIdAsString();
        return change(sql);
    }






}
