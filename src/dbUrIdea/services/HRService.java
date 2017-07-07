package dbUrIdea.services;

import dbUrIdea.models.*;


import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Yoshinon on 21/06/2017.
 */
public class HRService {

    private Connection connection;
    private HRDataStore dataStore;

    public HRService(InitialContext ctx) {
        try {
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource"))
                    .getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }

    public HRService() {
        try {
            InitialContext ctx = new InitialContext();
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource"))
                    .getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    private Connection getConnection() {
        return connection;
    }

    private HRDataStore getDataStore() {
        if(dataStore == null) {
            dataStore = new HRDataStore(getConnection());
        }
        return dataStore;
    }

    public List<Company> getCompanies() {

        return getDataStore().findAllCompanies();
    }

    public List<EmailAddress> getEmailAddresses() {
        return getDataStore().findAllEmail();
    }

    public List<PaymentsType> getPaymentsTypes(){
        return getDataStore().findAllPaymentsType();
    }

    public List<EmailAddress> getEmailsOrderById() {
        return getDataStore().findAllEmailsOrderById();
    }

    public List<Commentary> getComments() {

        return getDataStore().findAllCommentaries();
    }

    public List<Cv> getCvs() {
        return getDataStore().findAllCvs();
    }

    public List<Evaluation> getEvaluations(){

        return getDataStore().findAllEvaluations();
    }

    public  List<Employee> getEmployees(){
        return getDataStore().findAllEmployees();
    }
    public  List<Payment> getAllPayments(){
        return getDataStore().findAllPayments();
    }


}
