package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Yoshinon on 15/06/2017.
 */
public class CvEntity extends BaseEntity {

    public CvEntity() {
        super();
    }

    public CvEntity(Connection connection) {
        super(connection,"cvs");
    }

    public List<Cv> findAll(EmployeeEntity employeeEntity,
                            DataTypeEntity dataTypeEntity,
                            CompanyEntity companyEntity,
                            UserTypeEntity userTypeEntity,
                            EmailAddressEntity emailAddressEntity,
                            StateCompanyEntity stateCompanyEntity) {
        return findByCriteria("",employeeEntity,dataTypeEntity,companyEntity,userTypeEntity,emailAddressEntity
                ,stateCompanyEntity);
    }

    public Cv findById(String id,
                       EmployeeEntity employeeEntity,
                       DataTypeEntity dataTypeEntity,
                       CompanyEntity companyEntity,
                       UserTypeEntity userTypeEntity,
                       EmailAddressEntity emailAddressEntity,
                       StateCompanyEntity stateCompanyEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria,employeeEntity,dataTypeEntity,companyEntity,userTypeEntity,emailAddressEntity
                ,stateCompanyEntity).get(0);
    }

    public List<Cv> findByCriteria(String criteria, EmployeeEntity employeeEntity,
                                   DataTypeEntity dataTypeEntity,
                                   CompanyEntity companyEntity,
                                   UserTypeEntity userTypeEntity,
                                   EmailAddressEntity emailAddressEntity,
                                   StateCompanyEntity stateCompanyEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Cv> cvs = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) cvs.add(Cv.build(rs, employeeEntity,dataTypeEntity,companyEntity,userTypeEntity,emailAddressEntity
            ,stateCompanyEntity));
            return cvs;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return cvs;
    }

    public List<Cv> findAllOrderByName(EmployeeEntity employeeEntity,
                                       DataTypeEntity dataTypeEntity,
                                       CompanyEntity companyEntity,
                                       UserTypeEntity userTypeEntity,
                                       EmailAddressEntity emailAddressEntity,
                                       StateCompanyEntity stateCompanyEntity, boolean isAscending) {
        return findByCriteria("true ORDER BY id" +
                (isAscending ? "" : " DESC"), employeeEntity,dataTypeEntity,companyEntity,userTypeEntity,emailAddressEntity
                ,stateCompanyEntity);
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
