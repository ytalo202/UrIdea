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
                            DataTypesEntity dataTypesEntity,
                            CompaniesEntity companiesEntity,
                            UserTypesEntity userTypesEntity,
                            EmailAddressesEntity emailAddressesEntity,
                            StateCompaniesEntity stateCompaniesEntity) {
        return findByCriteria("", employeesEntity, dataTypesEntity, companiesEntity, userTypesEntity, emailAddressesEntity
                , stateCompaniesEntity);
    }

    public Cv findById(String id,
                       EmployeesEntity employeesEntity,
                       DataTypesEntity dataTypesEntity,
                       CompaniesEntity companiesEntity,
                       UserTypesEntity userTypesEntity,
                       EmailAddressesEntity emailAddressesEntity,
                       StateCompaniesEntity stateCompaniesEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, employeesEntity, dataTypesEntity, companiesEntity, userTypesEntity, emailAddressesEntity
                , stateCompaniesEntity).get(0);
    }

    public List<Cv> findByCriteria(String criteria, EmployeesEntity employeesEntity,
                                   DataTypesEntity dataTypesEntity,
                                   CompaniesEntity companiesEntity,
                                   UserTypesEntity userTypesEntity,
                                   EmailAddressesEntity emailAddressesEntity,
                                   StateCompaniesEntity stateCompaniesEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Cv> cvs = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) cvs.add(Cv.build(rs, employeesEntity, dataTypesEntity, companiesEntity, userTypesEntity, emailAddressesEntity
            , stateCompaniesEntity));
            return cvs;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return cvs;
    }

    public List<Cv> findAllOrderByName(EmployeesEntity employeesEntity,
                                       DataTypesEntity dataTypesEntity,
                                       CompaniesEntity companiesEntity,
                                       UserTypesEntity userTypesEntity,
                                       EmailAddressesEntity emailAddressesEntity,
                                       StateCompaniesEntity stateCompaniesEntity, boolean isAscending) {
        return findByCriteria("true ORDER BY id" +
                (isAscending ? "" : " DESC"), employeesEntity, dataTypesEntity, companiesEntity, userTypesEntity, emailAddressesEntity
                , stateCompaniesEntity);
    }
//ponerlo al resto de enititys
    public boolean add(Cv cv) {
        String sql = "INSERT INTO cvs(id, id_employee, id_data_type, description) VALUES(" +
                cv.getIdAsValue() + ", " +
                cv.getEmployee().getIdAsValue()+", " +
                //cv.getNameAsValue() + ", " + "aqui tuviera mi  employer si tuviera unoo !! :c"
                cv.getDataType().getIdAsValue() + ", " +
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
