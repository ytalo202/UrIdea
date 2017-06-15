package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 15/06/2017.
 */
public class CompanyEntity extends BaseEntity {

    public CompanyEntity() {
        super();
    }


    public CompanyEntity(Connection connection) {
        super(connection,"companies");
    }
    public List<Company> findAll(StateCompanyEntity stateCompanyEntity,
                                EmailAddressEntity emailAddressEntity) {
        return findByCriteria("", stateCompanyEntity,emailAddressEntity);
    }

    public Company findById(String id, StateCompanyEntity stateCompanyEntity,
                            EmailAddressEntity emailAddressEntit) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, stateCompanyEntity,emailAddressEntit).get(0);
    }
    public Company findByName(String name, StateCompanyEntity stateCompanyEntity,
                            EmailAddressEntity emailAddressEntit) {
        String criteria = "name_company = " + "'" + name + "'";
        return findByCriteria(criteria, stateCompanyEntity,emailAddressEntit).get(0);
    }

    public Company findByState(String state, StateCompanyEntity stateCompanyEntity,
                              EmailAddressEntity emailAddressEntit) {
        String criteria = "id_state_company = " + "'" + state + "'";
        return findByCriteria(criteria, stateCompanyEntity,emailAddressEntit).get(0);
    }

    public List<Company> findByCriteria(String criteria, StateCompanyEntity stateCompanyEntity,
                                        EmailAddressEntity emailAddressEntit) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Company> companies = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) companies.add(Company.build(rs, stateCompanyEntity,emailAddressEntit));
            return companies;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return companies;
    }





}
