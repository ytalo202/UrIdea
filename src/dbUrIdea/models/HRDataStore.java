package dbUrIdea.models;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Magnus on 21/06/2017.
 */
public class HRDataStore {

    private Connection connection;
    private CompaniesEntity companiesEntity;
    private CvsEntity cvsEntity;
    private EmailAddressesEntity emailAddressesEntity;
    private EmployeesEntity employeesEntity;
    private EvaluationsEntity evaluationsEntity;
    private CommentsEntity commentsEntity;
    private PaymentsEntity paymentsEntity;
    private PaymentsTypesEntity paymentsTypesEntity;


    public HRDataStore(Connection connection) {
        this.setConnection(connection);
    }


    public HRDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public HRDataStore setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }


    //-----------------Company
    public CompaniesEntity getCompaniesEntity() {
        if (companiesEntity == null) {
            companiesEntity = new CompaniesEntity(getConnection());
        }
        return companiesEntity;

    }

    public HRDataStore setCompaniesEntity(CompaniesEntity companiesEntity) {
        this.companiesEntity = companiesEntity;
        return this;
    }

    public List<Company> findAllCompanies() {
        return getCompaniesEntity().findAll(
                getEmailAddressesEntity());
    }

    public boolean createCompany(Company company) {

        return getCompaniesEntity().add(company);
    }

    //-------------------Cv
    public CvsEntity getCvsEntity() {
        if (cvsEntity == null) {
            cvsEntity = new CvsEntity(getConnection());
        }
        return cvsEntity;


    }

    public HRDataStore setCvsEntity(CvsEntity cvsEntity) {
        this.cvsEntity = cvsEntity;
        return this;
    }

    public List<Cv> findAllCvs() {
        return getCvsEntity().findAll(
                getEmployeesEntity(),
                getCompaniesEntity(),
                getEmailAddressesEntity());
    }

    public boolean createCv(Cv cv) {
        return getCvsEntity().add(cv);
    }
    public boolean updateCv(Cv cv) {
        return getCvsEntity().update(cv);
    }

    public Cv findCvById(int  id){
        return getCvsEntity().findById(id,getEmployeesEntity(),getCompaniesEntity(),getEmailAddressesEntity());
    }


//-------------------EmailAddress

    public EmailAddressesEntity getEmailAddressesEntity() {


        if (emailAddressesEntity == null) {
            emailAddressesEntity = new EmailAddressesEntity(getConnection());
        }
        return emailAddressesEntity;
    }


    public HRDataStore setEmailAddressesEntity(EmailAddressesEntity emailAddressesEntity) {
        this.emailAddressesEntity = emailAddressesEntity;
        return this;
    }

    public List<EmailAddress> findAllEmail() {

        return getEmailAddressesEntity().findAll();
    }

    public boolean createEmailAddress(EmailAddress emailAddress) {

        return getEmailAddressesEntity().add(emailAddress);
    }

    public List<EmailAddress> findAllEmailsOrderById() {

        return getEmailAddressesEntity().findAllOrderById(true);
    }

    //-------------------Employee
    public EmployeesEntity getEmployeesEntity() {
        if (employeesEntity == null) {
            employeesEntity = new EmployeesEntity(getConnection());
        }
        return employeesEntity;
    }

    public HRDataStore setEmployeesEntity(EmployeesEntity employeesEntity) {
        this.employeesEntity = employeesEntity;
        return this;
    }

    public List<Employee> findAllEmployees() {

        return getEmployeesEntity().findAll(
                getCompaniesEntity(), getEmailAddressesEntity()
        );
    }
    public Employee findEmployeeById(int  id){
        return getEmployeesEntity().findById(id ,getCompaniesEntity(),getEmailAddressesEntity());
    }

    public boolean createEmployee(Employee employee) {

        return getEmployeesEntity().add(employee);
    }

    public boolean updateEmployee(Employee employee) {

        return getEmployeesEntity().update(employee);
    }

    //------------------Evaluation
    public EvaluationsEntity getEvaluationsEntity() {
        if (evaluationsEntity == null) {
            evaluationsEntity = new EvaluationsEntity(getConnection());
        }
        return evaluationsEntity;
    }

    public HRDataStore setEvaluationsEntity(EvaluationsEntity evaluationsEntity) {
        this.evaluationsEntity = evaluationsEntity;
        return this;
    }

    public List<Evaluation> findAllEvaluations() {

        return getEvaluationsEntity().findAll(
                getEmployeesEntity(),
                getCompaniesEntity(),
                getEmailAddressesEntity());
    }

    public boolean createEvaluation(Evaluation evaluation) {

        return getEvaluationsEntity().add(evaluation);
    }

    public boolean updateEvaluation(Evaluation evaluation) {

        return getEvaluationsEntity().update(evaluation);
    }

    public Evaluation findEvaluationById(int id) {
        return getEvaluationsEntity().findById(
                id,getEmployeesEntity(),getCompaniesEntity(),getEmailAddressesEntity());
    }



    //------------Comments

    public CommentsEntity getCommentsEntity() {
        if (commentsEntity == null) {
            commentsEntity = new CommentsEntity(getConnection());
        }

        return commentsEntity;
    }

    public HRDataStore setCommentsEntity(CommentsEntity commentsEntity) {
        this.commentsEntity = commentsEntity;
        return this;
    }

    public List<Commentary> findAllCommentaries() {

        return getCommentsEntity().findAll(
                getEvaluationsEntity(),
                getCompaniesEntity(),
                getEmployeesEntity(),
                getEmailAddressesEntity());
    }

    public boolean createCommentary(Commentary commentary) {

        return getCommentsEntity().add(commentary);
    }

    //---------------------Payments
    public PaymentsEntity getPaymentsEntity() {
        if (paymentsEntity == null) {
            paymentsEntity = new PaymentsEntity(getConnection());
        }

        return paymentsEntity;
    }

    public HRDataStore setPaymentsEntity(PaymentsEntity paymentsEntity) {
        this.paymentsEntity = paymentsEntity;
        return this;
    }

    public List<Payment> findAllPayments() {

        return getPaymentsEntity().findAll(
                getCompaniesEntity(),
                getPaymentsTypesEntity(),
                getEmailAddressesEntity());
    }

    public boolean createPayment(Payment payment) {

        return getPaymentsEntity().add(payment);
    }







    //-------------------PaymentType

    public PaymentsTypesEntity getPaymentsTypesEntity() {

        if (paymentsTypesEntity == null) {
            paymentsTypesEntity = new PaymentsTypesEntity(getConnection());
        }

        return paymentsTypesEntity;
    }

    public HRDataStore setPaymentsTypesEntity(PaymentsTypesEntity paymentsTypesEntity) {
        this.paymentsTypesEntity = paymentsTypesEntity;
        return this;
    }

    public List<PaymentsType> findAllPaymentsType() {

        return getPaymentsTypesEntity().findAll();
    }

    public boolean createPaymentType(PaymentsType paymentsType) {

        return getPaymentsTypesEntity().add(paymentsType);
    }


    public boolean updatePayment(Payment payment) {
        return getPaymentsEntity().update(payment);
    }

    public Payment findPaymentById(int id) {

        return getPaymentsEntity().findById(id,
                getCompaniesEntity(),getPaymentsTypesEntity(),getEmailAddressesEntity());
    }


    public EmailAddress findEmailById(int id) {
        return getEmailAddressesEntity().findById(id);
    }

    public boolean updateEmail(EmailAddress emailAddress) {

        return getEmailAddressesEntity().update(emailAddress);
    }
    public PaymentsType findPaymentsTypeById(int id) {
        return getPaymentsTypesEntity().findById(id);
    }

    public boolean updatePaymentsType(PaymentsType paymentsType) {
        return getPaymentsTypesEntity().update(paymentsType);
    }



    public Commentary findCommentaryById(int id) {
        return getCommentsEntity().findById(id,
                getEvaluationsEntity(),getCompaniesEntity(),getEmployeesEntity(),getEmailAddressesEntity());
    }

    public boolean updateCommentary(Commentary commentary) {

        return getCommentsEntity().update(commentary);
    }

    public Company findCompanyById(int id) {
        return getCompaniesEntity().findById(id,getEmailAddressesEntity());}

    public boolean updateCompany(Company company) {

        return getCompaniesEntity().update(company);
    }

    public boolean createEmail(EmailAddress emailAddress) {
        return getEmailAddressesEntity().add(emailAddress);
    }

    public boolean deleteEmailById(EmailAddress emailAddress) {
        return getEmailAddressesEntity().deleteById(emailAddress);
    }

   // public boolean validarCompany(String nom,String clave) {return getCompaniesEntity().consulta(nom,clave);}



    public Company findIdByCompany(String email,String password) {
        return getCompaniesEntity().findByNameAndPass(email,password,getEmailAddressesEntity());
    }

    public Employee findAdministradores(int type ,int id_company) {
        return getEmployeesEntity().findAdministradores(
                type,id_company,getCompaniesEntity(),getEmailAddressesEntity());
    }
}
