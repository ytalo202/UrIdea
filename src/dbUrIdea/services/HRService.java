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

    public boolean updatePayment(Payment payment) {
        return getDataStore().updatePayment(payment);
    }


    public Payment getPaymentById(int id) {
        return getDataStore().findPaymentById(
                id);

    }
    public boolean updateEmail(EmailAddress emailAddress) {

        return getDataStore().updateEmail(emailAddress);
    }

    public EmailAddress getEmailAddressById(int id) {
        return getDataStore().findEmailById(id);
    }




    public PaymentsType getPaymentsTypeById(int id) {

        return getDataStore().findPaymentsTypeById(id);
    }



    public boolean updatePaymentsType(PaymentsType paymentsType) {

        return getDataStore().updatePaymentsType(paymentsType);
    }



    //----------------

    public Commentary getCommentaryById(int id) {
        return getDataStore().findCommentaryById(id);
    }


    public boolean updateCommentary(Commentary commentary) {

        return getDataStore().updateCommentary(commentary);
    }


    public Company getCompanyById(int id) {

        return getDataStore().findCompanyById(id);
    }

    public boolean updateCompany(Company company) {

        return getDataStore().updateCompany(company);
    }

    public boolean createEmail(EmailAddress emailAddress) {

        return getDataStore().createEmail(emailAddress);
    }
    public boolean deleteEmailById(EmailAddress emailAddress) {

        return getDataStore().deleteEmailById(emailAddress);
    }

    public boolean createComp(Company company) {

        return getDataStore().createCompany(company);
    }
//---------------------------------


    public boolean createEmployee(Employee employee) {

        return getDataStore().createEmployee(employee);
    }
    public Employee getEmployeeById(int id) {

        return getDataStore().findEmployeeById(id);
    }

    public boolean updateEmployee(Employee employee) {

        return getDataStore().updateEmployee(employee);
    }

    public boolean createComentary(Commentary commentary) {

        return getDataStore().createCommentary(commentary);
    }


    public Evaluation getEvaluationById(int id) {

        return getDataStore().findEvaluationById(id);
    }

    public boolean updateEvaluation(Evaluation evaluation) {

        return getDataStore().updateEvaluation(evaluation);
    }

    public boolean createEvaluation(Evaluation evaluation) {

        return getDataStore().createEvaluation(evaluation);
    }



    public boolean createPayment(Payment payment) {

        return getDataStore().createPayment(payment);
    }


    //public boolean validarCompany(String nom,String clave) {return getDataStore().validarCompany(nom,clave);}



    public Cv getCvById(int id) {

        return getDataStore().findCvById(id);
    }

    public boolean updateCv(Cv cv) {

        return getDataStore().updateCv(cv);
    }

    public boolean createCv(Cv cv) {

        return getDataStore().createCv(cv);
    }

    public Company getIdByCompany(String name,String pass) {

        return getDataStore().findIdByCompany(name,pass);
    }

}