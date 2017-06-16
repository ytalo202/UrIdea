package dbUrIdea.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Usuario on 15/06/2017.
 */
public class EmployeeEntity extends BaseEntity {


    public EmployeeEntity() {
        super();
        setTableName("employees");
    }

    public EmployeeEntity(Connection connection) {
        super(connection,"employees");
    }

    public List<Employee> findAll(CompanyEntity companyEntity,UserTypeEntity userTypeEntity,
                                  EmailAddressEntity emailAddressEntity,StateCompanyEntity stateCompanyEntity) {
        return findByCriteria("", companyEntity, userTypeEntity, emailAddressEntity,stateCompanyEntity);
    }
    public Employee findById(String id,
                             CompanyEntity companyEntity,UserTypeEntity userTypeEntity,
                             EmailAddressEntity emailAddressEntity,StateCompanyEntity stateCompanyEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, companyEntity, userTypeEntity, emailAddressEntity,stateCompanyEntity).get(0);
    }

    public List<Employee> findByCriteria(String criteria, CompanyEntity companyEntity,UserTypeEntity userTypeEntity,
                                         EmailAddressEntity emailAddressEntity,StateCompanyEntity stateCompanyEntity) {

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Employee> employees = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) employees.add(Employee.build(rs,companyEntity,
                    userTypeEntity,emailAddressEntity,stateCompanyEntity));
            return employees;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return employees;
    }

}
