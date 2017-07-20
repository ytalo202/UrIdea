package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 15/06/2017.
 */
public class EmployeesEntity extends BaseEntity {


    public EmployeesEntity() {
        super();

    }

    public EmployeesEntity(Connection connection) {

        super(connection,"employees");
    }

    public List<Employee> findAll(
            CompaniesEntity companiesEntity,
                                  EmailAddressesEntity emailAddressesEntity) {
        return findByCriteria("", companiesEntity, emailAddressesEntity);
    }
    public Employee findById(int id,
                             CompaniesEntity companiesEntity,

                             EmailAddressesEntity emailAddressesEntity
                            ) {
        String criteria = "id = " + String.valueOf(id);
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity ).get(0);
    }

    public Employee findByName(String name,
                               CompaniesEntity companiesEntity,

                               EmailAddressesEntity emailAddressesEntity
                              ) {
        String criteria = "employee_name = " + "'" + name + "'";
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity).get(0);
    }

    public Employee findByFirstLastName(String firstLastName,
                                        CompaniesEntity companiesEntity,

                                        EmailAddressesEntity emailAddressesEntity
                                        ) {
        String criteria = "employee_first_last_name = " + "'" + firstLastName + "'";
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity).get(0);
    }

    public Employee findByIdCompany(String id,
                                    CompaniesEntity companiesEntity,

                                    EmailAddressesEntity emailAddressesEntity
                                    ) {
        String criteria = "id_company = " + String.valueOf(id);
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity).get(0);
    }

//-------------------
    public List<Employee> findAdministradores(int type ,int id_company,
                                         CompaniesEntity companiesEntity,

                                    EmailAddressesEntity emailAddressesEntity
    ) {
        String criteria = "employee_type = "+type+" and id_company= "+id_company;
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity);
    }

    public List<Employee> findEmployee(int id_company,
                                              CompaniesEntity companiesEntity,

                                              EmailAddressesEntity emailAddressesEntity
    ) {
        String criteria = "id_company= "+id_company;
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity);
    }


    public Employee findByIdUserType(String id,
                                     CompaniesEntity companiesEntity,

                                     EmailAddressesEntity emailAddressesEntity
                                     ) {
        String criteria = "id_user_type = " + String.valueOf(id);
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity ).get(0);
    }


    public Employee findBySecondLastName(String secondLastName,
                                         CompaniesEntity companiesEntity,

                                         EmailAddressesEntity emailAddressesEntity
                                         ) {
        String criteria = "employee_second_last_name = " + "'" + secondLastName + "'";
        return findByCriteria(criteria, companiesEntity,
                emailAddressesEntity).get(0);
    }

    public List<Employee> findByCriteria(String criteria, CompaniesEntity companiesEntity,
                                         EmailAddressesEntity emailAddressesEntity) {

        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);

        List<Employee> employees = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) employees.add(Employee.build(rs, companiesEntity,emailAddressesEntity));
            return employees;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }
    public boolean update(Employee employee) {
        String sql = "UPDATE employees SET " +
                "employee_type = "+employee.getEmployeeTypeAsString()+ ", " +
                "password = "+employee.getPasswordAsValue()+ ", " +
                "employee_name = " +employee.getNameAsValue()+ ", " +
                "employee_first_last_name = " + employee.getFirstLastNameAsValue()+ ", " +
                "employee_second_last_name = "+ employee.getSecondLastNameAsValue()+ ", " +
                "dni = "+ employee.getDniAsString()+ ", " +
                "phone_number = "+ employee.getPhoneNumberAsString()+ ", " +
                "cell_phone_number = " + employee.getCellPhoneNumberAsString()+ ", " +
                "address = "+ employee.getAddressAsValue()+ ", " +
                "department = "+employee.getDepartmentAsValue()+ ", " +
               "birthdate = "+employee.getBirthdateAsValue()+
                " WHERE id = " + employee.getIdAsString();

        return change(sql);
    }

    public boolean changeEmployee(Employee employee) {
        String sql = "UPDATE employees SET " +
                "employee_type = "+employee.getEmployeeTypeAsString()+
                " WHERE id = " + employee.getIdAsString();
        return change(sql);
    }


    public boolean add(Employee employee) {
        String sql = "INSERT employees(" +
                "id_company, id_email_address, employee_type, password, " +
                "employee_name, employee_first_last_name, employee_second_last_name," +
                " dni, phone_number, cell_phone_number, address, department, birthdate) " +
                "VALUES("
                +employee.getCompany().getIdAsString()+ ", "
                +employee.getEmailAddress().getIdAsString()+ ", "
                +employee.getEmployeeTypeAsString()+ ", "
                +employee.getPasswordAsValue()+ ", "
                +employee.getNameAsValue()+ ", "
                +employee.getFirstLastNameAsValue()+ ", "
                +employee.getSecondLastNameAsValue()+ ", "
                +employee.getDniAsString()+", "
                +employee.getPhoneNumberAsString()+ ", "
                +employee.getCellPhoneNumberAsString()+ ", "
                +employee.getAddressAsValue()+ ", "
                +employee.getDepartmentAsValue()+ ", "
                 +employee.getBirthdateAsValue()
                + ")";
        return change(sql);
    }


    public boolean add2(Employee employee) {
        String sql = "INSERT employees(" +
                "id_company, id_email_address, employee_type, password, " +
                "employee_name, dni) "+
                "VALUES("
                +employee.getCompany().getIdAsString()+", "
                +employee.getEmailAddress().getIdAsString()+ ", "
                +employee.getEmployeeTypeAsString()+ ", "
                +employee.getPasswordAsValue()+ ", "
                +employee.getNameAsValue()+", "
                +employee.getDni()
                + ")";
        return change(sql);
    }



    public boolean delete(Employee employee) {
        String sql = "DELETE FROM employees WHERE id = " +
                employee.getIdAsString();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM employees WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }
/*
    public boolean verAdministrador(Employee employee) {
        String sql = "SELECT * from employees where employee_type = " +
                "'" + id + "'";
        return change(sql);
    }*/

//VALIDAR CORREO Y CONTRASEÑA
    public Employee findByNameAndPass(String email,String password ,EmailAddressesEntity emailAddressEntity,CompaniesEntity companiesEntity) {
        return findIdByEmailAndPassword(email,password ,emailAddressEntity,companiesEntity).get(0);
    }

    public List<Employee> findIdByEmailAndPassword(String email, String password, EmailAddressesEntity emailAddressEntity,CompaniesEntity companiesEntity) {
        String sql ="select a.id,a.id_company,a.id_email_address,a.employee_type,a.password,a.employee_name,a.employee_first_last_name,a.employee_second_last_name,a.dni,a.phone_number,a.cell_phone_number,a.photo,a.address,a.department,a.birthdate from employees a left join email_addresses b on a.id_email_address = b.id where email_data='"+ email+"' and a.password ='"+password+"'";
        List<Employee> employees = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) employees.add(Employee.build(rs, companiesEntity, emailAddressEntity));
            return employees;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }


    private Connection conn = null;
    private Statement st = null;
    private ResultSet rs = null;

    public boolean validar(String nom ,
                           String clave ){
        boolean encontrado = false;
        try {
            conn = this.getConnection();
            st = conn.createStatement();
            rs=st.executeQuery("select * from" +
                    " companies where name_company = '"+nom+"' and password = '"+clave+"'");
            if (rs.next()){
                encontrado=true;
            }
            this.closesConnection();

        }catch (Exception e){

        }
        return encontrado;
    }


}