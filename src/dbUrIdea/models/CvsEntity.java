package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Yoshinon on 15/06/2017.
 */
public class CvsEntity extends BaseEntity {

    public CvsEntity() {
        super();
    }

    public CvsEntity(Connection connection) {
        super(connection,"cvs");
    }

    public List<Cv> findAll(EmployeesEntity employeesEntity,
                            CompaniesEntity companiesEntity,
                            EmailAddressesEntity emailAddressesEntity
                            ) {
        return findByCriteria("", employeesEntity,companiesEntity, emailAddressesEntity
                );
    }

    public Cv findById(String id,
                       EmployeesEntity employeesEntity,
                       CompaniesEntity companiesEntity,
                       EmailAddressesEntity emailAddressesEntity
                       ) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, employeesEntity, companiesEntity,  emailAddressesEntity).get(0);
    }

    public List<Cv> findByCriteria(String criteria, EmployeesEntity employeesEntity,
                                   CompaniesEntity companiesEntity,
                                   EmailAddressesEntity emailAddressesEntity
                                   ) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Cv> cvs = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) cvs.add(Cv.build(rs, employeesEntity, companiesEntity,  emailAddressesEntity
            ));
            return cvs;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return cvs;
    }

    public List<Cv> findAllOrderByName(EmployeesEntity employeesEntity,
                                       CompaniesEntity companiesEntity,
                                       EmailAddressesEntity emailAddressesEntity,
                                       boolean isAscending) {
        return findByCriteria("true ORDER BY id" +
                (isAscending ? "" : " DESC"), employeesEntity, companiesEntity, emailAddressesEntity
                );
    }
//ponerlo al resto de enititys
    public boolean add(Cv cv) {
        String sql = "INSERT INTO cvs(id, id_employee, cv_type, description) VALUES(" +
                cv.getIdAsValue() + ", " +
                cv.getEmployee().getIdAsValue()+", " +
                cv.getcvTypeAsString()+ ", " +
                cv.getDescriptionAsValue()+
                ")";
        return change(sql);
    }

    public boolean update(Cv cv) {
        String sql = "UPDATE cvs SET " +
                "description = " + cv.getDescriptionAsValue() +
                " WHERE id = " + cv.getIdAsValue();
        return change(sql);
    }

    public boolean delete(Cv cv) {
        String sql = "DELETE FROM cvs WHERE id = " +
                cv.getIdAsValue();
        return change(sql);
    }

    public boolean delete(String id) {
        String sql = "DELETE FROM cvs WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }




}
