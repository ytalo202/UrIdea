package dbUrIdea.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 15/06/2017.
 */
public class EmployeesEntity extends BaseEntity {


    public EmployeesEntity() {
        super();
        setTableName("employees");
    }

    public EmployeesEntity(Connection connection) {
        super(connection,"employees");
    }

    public List<Employee> findAll(CompaniesEntity companiesEntity, UserTypesEntity userTypesEntity,
                                  EmailAddressesEntity emailAddressesEntity, StateCompaniesEntity stateCompaniesEntity) {
        return findByCriteria("", companiesEntity, userTypesEntity, emailAddressesEntity, stateCompaniesEntity);
    }
    public Employee findById(String id,
                             CompaniesEntity companiesEntity,
                             UserTypesEntity userTypesEntity,
                             EmailAddressesEntity emailAddressesEntity,
                             StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, companiesEntity, userTypesEntity,
                emailAddressesEntity, stateCompaniesEntity).get(0);
    }

    public Employee findByName(String name,
                              CompaniesEntity companiesEntity,
                              UserTypesEntity userTypesEntity,
                              EmailAddressesEntity emailAddressesEntity,
                              StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "employee_name = " + "'" + name + "'";
        return findByCriteria(criteria, companiesEntity, userTypesEntity,
                emailAddressesEntity, stateCompaniesEntity).get(0);
    }

    public Employee findByFirstLastName(String firstLastName,
                                         CompaniesEntity companiesEntity,
                                         UserTypesEntity userTypesEntity,
                                         EmailAddressesEntity emailAddressesEntity,
                                         StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "employee_first_last_name = " + "'" + firstLastName + "'";
        return findByCriteria(criteria, companiesEntity, userTypesEntity,
                emailAddressesEntity, stateCompaniesEntity).get(0);
    }

    public Employee findByIdCompany(String id,
                                        CompaniesEntity companiesEntity,
                                        UserTypesEntity userTypesEntity,
                                        EmailAddressesEntity emailAddressesEntity,
                                        StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "id_company = " + String.valueOf(id);
        return findByCriteria(criteria, companiesEntity, userTypesEntity,
                emailAddressesEntity, stateCompaniesEntity).get(0);
    }

    public Employee findByIdUserType(String id,
                                    CompaniesEntity companiesEntity,
                                    UserTypesEntity userTypesEntity,
                                    EmailAddressesEntity emailAddressesEntity,
                                    StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "id_user_type = " + String.valueOf(id);
        return findByCriteria(criteria, companiesEntity, userTypesEntity,
                emailAddressesEntity, stateCompaniesEntity).get(0);
    }


    public Employee findBySecondLastName(String secondLastName,
                                        CompaniesEntity companiesEntity,
                                        UserTypesEntity userTypesEntity,
                                        EmailAddressesEntity emailAddressesEntity,
                                        StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "employee_second_last_name = " + "'" + secondLastName + "'";
        return findByCriteria(criteria, companiesEntity, userTypesEntity,
                emailAddressesEntity, stateCompaniesEntity).get(0);
    }

    public List<Employee> findByCriteria(String criteria, CompaniesEntity companiesEntity, UserTypesEntity userTypesEntity,
                                         EmailAddressesEntity emailAddressesEntity, StateCompaniesEntity stateCompaniesEntity) {

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Employee> employees = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) employees.add(Employee.build(rs, companiesEntity,
                    userTypesEntity, emailAddressesEntity, stateCompaniesEntity));
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
