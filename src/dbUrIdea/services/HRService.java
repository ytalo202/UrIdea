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
    public int getCompanyCount() {return getCompanies().size();}

    public boolean addComp2(Company company) {

        return getDataStore().addCompany2(company);
    }

    public List<EmailAddress> getEmailAddresses() {
        return getDataStore().findAllEmail();
    }

    public int getEmailCount() {
        return getEmailAddresses().size();
    }



    public List<PaymentsType> getPaymentsTypes(){
        return getDataStore().findAllPaymentsType();
    }

    public List<EmailAddress> getEmailsOrderById() {
        return getDataStore().findAllEmailsOrderById();
    }


    public List<Cv> getCvs() {
        return getDataStore().findAllCvs();
    }

    ///----------evaluation
    public List<Evaluation> getEvaluations(){

        return getDataStore().findAllEvaluations();
    }

    public  List<Employee> getEmployees(){
        return getDataStore().findAllEmployees();
    }
    public  List<Payment> getAllPayments(){
        return getDataStore().findAllPayments();

    }

    public List<Employee> findAllEmployeeById(int id)
    {
        return getDataStore().findAllEmployeeById(id);
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
//-----------
    public boolean createComp(Company company) {

        return getDataStore().createCompany(company);
    }
//---------------------------------

//{{{{{
    public boolean createEmployee(Employee employee) {

        return getDataStore().createEmployee(employee);
    }

//----

    public boolean createEmployee2(Employee employee) {

        return getDataStore().createEmpleado2(employee);
    }


    public Employee getEmployeeById(int id) {

        return getDataStore().findEmployeeById(id);
    }

    public boolean updateEmployee(Employee employee) {

        return getDataStore().updateEmployee(employee);
    }



    public Evaluation getEvaluationById(int id) {

        return getDataStore().findEvaluationById(id);
    }
/*
    public boolean updateEvaluation(Evaluation evaluation) {

        return getDataStore().updateEvaluation(evaluation);
    }*/


    ///--------EVALUACION
    public boolean createEvaluationAdministracion(Evaluation evaluation) {

        return getDataStore().createEvaluationAdministration(evaluation);
    }
    public boolean createEvaluationInformatica(Evaluation evaluation) {

        return getDataStore().createEvaluationInformatica(evaluation);
    }
    public boolean createEvaluationMarketing(Evaluation evaluation) {

        return getDataStore().createEvaluationMarketing(evaluation);
    }
    public boolean createEvaluationPracticantes(Evaluation evaluation) {

        return getDataStore().createEvaluationPracticantes(evaluation);
    }
    public boolean createEvaluationProduccion(Evaluation evaluation) {

        return getDataStore().createEvaluationProduction(evaluation);
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


    //----Company login
    public Company getIdByCompany
            (String name,String pass) {

        return getDataStore().findIdByCompany(name,pass);
    }

    //----empleado login

    public Employee getIdByEmployee
            (String email,String password) {
        return getDataStore().findIdByEmployee(email,password);
    }
//-----------

    public EmailAddress getIdByEmail(String email) {
        return getDataStore().findIdByEmail(email);
    }

//--------------
    public List<Employee> findAdmin(
            int type ,int id_company
    ) {
        return getDataStore().findAllAdmin(
                type,id_company
        );
    }

    public List<Employee> findAllxArea(int type ,int id_company,int are)
    {
        return getDataStore().findAllxArea(type, id_company, are);
    }

    public boolean updateEmployee2(Employee employee) {

        return getDataStore().updateEmployee2(employee);
    }


    public List<Employee> findEmployee(
            int id_company
    ) {
        return getDataStore().findAllEmployee(
                id_company
        );
    }




    public boolean changeEmployee(Employee employee) {
        return getDataStore().changeEmployee(employee);
    }


    public List<Area> findAllAreas() {

        return getDataStore().findAllAreas();
    }
    public Area getAreaById(int id){
        return getDataStore().findAreById(id);
    }

    public boolean createArea(Area area) {

        return getDataStore().createArea(area);
    }

    public boolean updateArea(Area area) {

        return getDataStore().updateArea(area);
    }
/*
    public List<Evaluation> findAllEvaluationProm() {

        return getDataStore().findAllEvaluationProm();
    }*/

    public List<Evaluation> findListEvaluatsById(int id) {

        return getDataStore().findListEvaluationById(id);
    }

    public List<Evaluation> findEvaluationAgv(int id) {

        return getDataStore().findEvaluationAgv(id);
    }

    public List<Cv> findAllCvsByIdEmployee(int idEmployee)
    {
        return getDataStore().findAllCvsById(idEmployee);
    }


}