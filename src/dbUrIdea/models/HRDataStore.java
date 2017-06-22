package dbUrIdea.models;

import java.sql.Connection;
import java.util.List;

/**
 * Created by Yoshinon on 21/06/2017.
 */
public class HRDataStore {

    private Connection connection;
    private CompaniesEntity companiesEntity;
    private CvsEntity cvsEntity;
    private DataTypesEntity dataTypesEntity;
    private EmailAddressesEntity emailAddressesEntity;
    private EmployeesEntity employeesEntity;
    private EvaluationsEntity evaluationsEntity;
    private EvidencesEntity evidencesEntity;
    private EvidencesTypesEntity evidencesTypesEntity;
    private PaymentsEntity paymentsEntity;
    private PaymentsTypesEntity paymentsTypesEntity;
    private StatesCompaniesEntity statesCompaniesEntity;
    private UserTypesEntity userTypesEntity;


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

    public DataTypesEntity getDataTypesEntity() {
        return dataTypesEntity;
    }

    public HRDataStore setDataTypesEntity(DataTypesEntity dataTypesEntity) {
        this.dataTypesEntity = dataTypesEntity;
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

    public EvidencesEntity getEvidencesEntity() {
        return evidencesEntity;
    }

    public HRDataStore setEvidencesEntity(EvidencesEntity evidencesEntity) {
        this.evidencesEntity = evidencesEntity;
        return this;
    }

    public EvidencesTypesEntity getEvidencesTypesEntity() {
        return evidencesTypesEntity;
    }

    public HRDataStore setEvidencesTypesEntity(EvidencesTypesEntity evidencesTypesEntity) {
        this.evidencesTypesEntity = evidencesTypesEntity;
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

    public StatesCompaniesEntity getStatesCompaniesEntity() {
        return statesCompaniesEntity;
    }

    public HRDataStore setStatesCompaniesEntity(StatesCompaniesEntity statesCompaniesEntity) {
        this.statesCompaniesEntity = statesCompaniesEntity;
        return this;
    }

    public UserTypesEntity getUserTypesEntity() {
        return userTypesEntity;
    }

    public HRDataStore setUserTypesEntity(UserTypesEntity userTypesEntity) {
        this.userTypesEntity = userTypesEntity;
        return this;
    }



    public List<Company> findAllCompanies() {
        return getCompaniesEntity().findAll(
                getStatesCompaniesEntity(),
                getEmailAddressesEntity());
    }

    public boolean createCompany(Company company) {

        return getCompaniesEntity().add(company);
    }

    public List<Cv> findAllCvs() {
        return getCvsEntity().findAll(
                getEmployeesEntity(),
                getDataTypesEntity(),
                getCompaniesEntity(),
                getUserTypesEntity(),
                getEmailAddressesEntity(),
                getStatesCompaniesEntity());
    }

    public boolean createCv(Cv cv) {
        return getCvsEntity().add(cv);
    }

    public List<DataType> findAllDataTypes() {
        return getDataTypesEntity().findAll();
    }

    public boolean createDataType(DataType dataType) {

        return getDataTypesEntity().add(dataType);
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
                getUserTypesEntity(),
                getEmailAddressesEntity(),
                getStatesCompaniesEntity());
    }

    public boolean createEmployee(Employee employee) {
        return getEmployeesEntity().add(employee);
    }



}

