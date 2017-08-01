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

    private PaymentsEntity paymentsEntity;
    private PaymentsTypesEntity paymentsTypesEntity;
    private AreasEntity areasEntity;


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
                getEmailAddressesEntity(),getAreasEntity());
    }

    public boolean createCv(Cv cv) {
        return getCvsEntity().add(cv);
    }
    public boolean updateCv(Cv cv) {
        return getCvsEntity().update(cv);
    }

    public Cv findCvById(int  id){
        return getCvsEntity().findById(id,getEmployeesEntity(),getCompaniesEntity(),getEmailAddressesEntity(),getAreasEntity());
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
//...area
    public AreasEntity getAreasEntity() {
        if (areasEntity == null) {
            areasEntity = new AreasEntity(getConnection());
        }

        return areasEntity;
    }

    public HRDataStore setAreasEntity(AreasEntity areasEntity) {
        this.areasEntity = areasEntity;
        return this;
    }


    public List<Area> findAllAreas() {

        return getAreasEntity().findAll(
        );
    }
    public Area findAreById(int id){
        return getAreasEntity().findById(id);
    }

    public boolean createArea(Area area) {

        return getAreasEntity().add(area);
    }

    public boolean updateArea(Area area) {

        return getAreasEntity().update(area);
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
                getCompaniesEntity(), getEmailAddressesEntity(),getAreasEntity()
        );
    }



    public Employee findEmployeeById(int  id){
        return getEmployeesEntity().findById(id ,getCompaniesEntity(),getEmailAddressesEntity(),getAreasEntity());
    }

    public boolean createEmployee(Employee employee) {

        return getEmployeesEntity().add(employee);
    }

    public boolean updateEmployee(Employee employee) {

        return getEmployeesEntity().update(employee);
    }


    public boolean updateEmployee2(Employee employee) {

        return getEmployeesEntity().updateData(employee);
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


///-------------------eVALU
    public boolean createEvaluationAdministration(Evaluation evaluation) {

        return getEvaluationsEntity().addAdministration(evaluation);
    }
    public boolean createEvaluationInformatica(Evaluation evaluation) {

        return getEvaluationsEntity().addInformatica(evaluation);
    }
    public boolean createEvaluationMarketing(Evaluation evaluation) {

        return getEvaluationsEntity().addMarketing(evaluation);
    }
    public boolean createEvaluationPracticantes(Evaluation evaluation) {

        return getEvaluationsEntity().addPractitioners(evaluation);
    }
    public boolean createEvaluationProduction(Evaluation evaluation) {

        return getEvaluationsEntity().addProduction(evaluation);
    }
/*
    public boolean updateEvaluation(Evaluation evaluation) {

        return getEvaluationsEntity().update(evaluation);
    }*/

    public Evaluation findEvaluationById(int id) {
        return getEvaluationsEntity().findById(
                id,getEmployeesEntity(),getCompaniesEntity(),getEmailAddressesEntity(),getAreasEntity());
    }





    //------------Comments









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





    public Company findCompanyById(int id) {
        return getCompaniesEntity().findById(id,getEmailAddressesEntity());}

    public boolean updateCompany(Company company) {

        return getCompaniesEntity().update(company);
    }
//-----------
    public boolean addCompany2(Company company) {

        return getCompaniesEntity().add2(company);
    }


    public boolean
    createEmpleado2(Employee employee) {
        return getEmployeesEntity().add2(employee);
    }


    public boolean createEmail(EmailAddress emailAddress) {
        return getEmailAddressesEntity().add(emailAddress);
    }

    public boolean deleteEmailById(EmailAddress emailAddress) {
        return getEmailAddressesEntity().deleteById(emailAddress);
    }


    public boolean changeArea(Employee employee) {
        return getEmployeesEntity().CambioArea(employee);
    }

   // public boolean validarCompany(String nom,String clave) {return getCompaniesEntity().consulta(nom,clave);}



    public Company findIdByCompany(String name,String pass) {
        return getCompaniesEntity().findByNameAndPass(
                name,pass,getEmailAddressesEntity());

    }

    public EmailAddress findId2ByEmail(String email) {
        return getEmailAddressesEntity().findIdByEmailData(
        email);

    }

    public Employee findIdByEmployee(String email,String password) {
        return getEmployeesEntity().findByNameAndPass(
                email,password,getEmailAddressesEntity(),
                getCompaniesEntity(),getAreasEntity());
    }



    public List<Company> ListCompanyById(int idCom) {

        return getCompaniesEntity().ListById(idCom, getEmailAddressesEntity());
    }

//---------------
    public List<Employee> findAllAdmin(int type ,int id_company)
    {
        return getEmployeesEntity().findAdministradores(type,id_company,getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity());
    }


    public List<Employee> findAllxArea(int type ,int id_company,int area)
    {
        return getEmployeesEntity().findEmpXarea(type,id_company,area,getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity());
    }

    public List<Employee> findAllEmployee(int id_company)
    {
        return getEmployeesEntity().findEmployee(id_company,getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity());
    }


    public List<Employee> findAllEmployeeById(int id)
    {
        return getEmployeesEntity().listFindById(id,getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity());
    }


    public List<Cv> findAllCvsById(int id)
    {
        return getCvsEntity().findByIdEmployee(id,getEmployeesEntity(),
                getCompaniesEntity(),getEmailAddressesEntity(),getAreasEntity());
    }


    public boolean changeEmployee(Employee employee) {
        return getEmployeesEntity().changeEmployee(employee);
    }




//evaluationnnnnnnnnnn


    public List<Evaluation> findEvaluationAgv(int id) {

        return getEvaluationsEntity().findbyIdEmpleado(id,
                getEmployeesEntity(),getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity()
        );
    }

    public List<Evaluation> findListEvaluationById(int id) {

        return getEvaluationsEntity().findbyIdEmpleadoListado(id,
                getEmployeesEntity(),getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity()
        );
    }

    public List<Evaluation> findAllEvaluations() {

        return getEvaluationsEntity().findAll(
                getEmployeesEntity(),
                getCompaniesEntity(),
                getEmailAddressesEntity(),getAreasEntity());
    }

}


