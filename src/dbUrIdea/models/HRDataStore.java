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

    public CompaniesEntity getCompaniesEntity() {
        return companiesEntity;
    }

    public HRDataStore setCompaniesEntity(CompaniesEntity companiesEntity) {
        this.companiesEntity = companiesEntity;
        return this;
    }

    public CvsEntity getCvsEntity() {
        return cvsEntity;
    }

    public HRDataStore setCvsEntity(CvsEntity cvsEntity) {
        this.cvsEntity = cvsEntity;
        return this;
    }


    public EmailAddressesEntity getEmailAddressesEntity() {
        return emailAddressesEntity;
    }

    public HRDataStore setEmailAddressesEntity(EmailAddressesEntity emailAddressesEntity) {
        this.emailAddressesEntity = emailAddressesEntity;
        return this;
    }

    public EmployeesEntity getEmployeesEntity() {
        return employeesEntity;
    }

    public HRDataStore setEmployeesEntity(EmployeesEntity employeesEntity) {
        this.employeesEntity = employeesEntity;
        return this;
    }

    public EvaluationsEntity getEvaluationsEntity() {
        return evaluationsEntity;
    }

    public HRDataStore setEvaluationsEntity(EvaluationsEntity evaluationsEntity) {
        this.evaluationsEntity = evaluationsEntity;
        return this;
    }

    public CommentsEntity getCommentsEntity() {
        return commentsEntity;
    }

    public HRDataStore setCommentsEntity(CommentsEntity commentsEntity) {
        this.commentsEntity = commentsEntity;
        return this;
    }


    public PaymentsEntity getPaymentsEntity() {
        return paymentsEntity;
    }

    public HRDataStore setPaymentsEntity(PaymentsEntity paymentsEntity) {
        this.paymentsEntity = paymentsEntity;
        return this;
    }

    public PaymentsTypesEntity getPaymentsTypesEntity() {
        return paymentsTypesEntity;
    }

    public HRDataStore setPaymentsTypesEntity(PaymentsTypesEntity paymentsTypesEntity) {
        this.paymentsTypesEntity = paymentsTypesEntity;
        return this;
    }

    public List<Company> findAllCompanies() {
        return getCompaniesEntity().findAll(
                getEmailAddressesEntity());
    }

    public boolean createCompany(Company company) {

        return getCompaniesEntity().add(company);
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


    public List<EmailAddress> findAllEmailAdresses() {

        return getEmailAddressesEntity().findAll();
    }

    public boolean createEmailAddress(EmailAddress emailAddress) {
        return getEmailAddressesEntity().add(emailAddress);
    }

    public List<Employee> findAllEmployees() {

        return getEmployeesEntity().findAll(
                getCompaniesEntity(),
                getEmailAddressesEntity()
               );
    }

    public boolean createEmployee(Employee employee) {
        return getEmployeesEntity().add(employee);
    }

    public List<Evaluation> findAllEvaluations() {

        return getEvaluationsEntity().findAll(
                getEmployeesEntity(),
                getCompaniesEntity(),
                getEmailAddressesEntity())
               ;
    }

    public boolean createEvaluation(Evaluation evaluation) {
        return getEvaluationsEntity().add(evaluation);
    }

    public List<Commentary> findAllEvidences() {

        return getCommentsEntity().findAll(
                getEvaluationsEntity(),
                getCompaniesEntity(),
                getEmployeesEntity(),
                getEmailAddressesEntity());
    }

    public boolean createEvidencce(Commentary commentary) {
        return getCommentsEntity().add(commentary);
    }




    public List<Payment> findAllPayments() {

        return getPaymentsEntity().findAll(
                getCompaniesEntity()
                ,getPaymentsTypesEntity()
                ,getEmailAddressesEntity()
        );
    }

    public boolean createPayment(Payment payment) {
        return getPaymentsEntity().add(payment);
    }

    public List<PaymentsType> findAllPaymentsType() {

        return getPaymentsTypesEntity().findAll();
    }

    public boolean createPaymentType(PaymentsType paymentsType) {
        return getPaymentsTypesEntity().add(paymentsType);
    }



}

