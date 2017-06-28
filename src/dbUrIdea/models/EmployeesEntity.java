package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 15/06/2017.
 */
public class EmployeesEntity extends BaseEntity {


    public EmployeesEntity() {
        super();
        setTableName("employees");
    }

    public EmployeesEntity(Connection connection) {
        super(connection,"employees");
    }

    public List<Employee> findAll(CompaniesEntity companiesEntity,
                                  EmailAddressesEntity emailAddressesEntity) {
        return findByCriteria("", companiesEntity, emailAddressesEntity);
    }
    public Employee findById(String id,
                             CompaniesEntity companiesEntity,

                             EmailAddressesEntity emailAddressesEntity
                            ) {
        String criteria = "id = " + "'" + id + "'";
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

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
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
        String sql = "UPDATE companies SET " +
                "password = "+employee.getPasswordAsValue()+ ", " +
                "employee_name = " +employee.getNameAsValue()+ ", " +
                "employee_first_last_name = " + employee.getFirstLastNameAsValue()+ ", " +
                "employee_second_last_name = "+ employee.getSecondLastNameAsValue()+ ", " +
                "phone_number = "+ employee.getPhoneNumberAsString()+ ", " +
                "cell_phone_number = " + employee.getCellPhoneNumberAsString()+ ", " +
                "address = "+ employee.getAddressAsValue()+ ", " +
                "department = "+employee.getDepartmentAsValue()+ ", " +
                "birthdate = "+employee.getBirthdateAsString()+ ", " +
                " WHERE id = " + employee.getIdAsValue();

        return change(sql);
    }

    public boolean add(Employee employee) {
        String sql = "INSERT INTO employees(id, id_company, id_user_type, id_email_address, password, employee_name, employee_first_last_name, employee_second_last_name, phone_number, address, department, birthdate) " +
                "VALUES("
                +employee.getIdAsValue() + ", "
                +employee.getCompany().getIdAsValue()+ ", "
                +employee.getEmployeeTypeAsString()+ ", "
                +employee.getEmailAddress().getIdAsString()+ ", "
                +employee.getPasswordAsValue()+ ", "
                +employee.getNameAsValue()+ ", "
                +employee.getFirstLastNameAsValue()+ ", "
                +employee.getSecondLastNameAsValue()+ ", "
                +employee.getPhoneNumberAsString()+ ", "
                +employee.getCellPhoneNumberAsString()+ ", "
                +employee.getAddressAsValue()+ ", "
                +employee.getDepartmentAsValue()+ ", "
                +employee.getBirthdateAsString()+ ")";
        return change(sql);
    }



    public boolean delete(Employee employee) {
        String sql = "DELETE FROM employees WHERE id = " +
                employee.getIdAsValue();
        return change(sql);
    }
    public boolean delete(String id) {
        String sql = "DELETE FROM employees WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }

}