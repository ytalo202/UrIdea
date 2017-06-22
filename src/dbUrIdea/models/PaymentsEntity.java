package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class PaymentsEntity extends BaseEntity {

    public PaymentsEntity() {
        super();
    }


    public PaymentsEntity(Connection connection) {
        super(connection,"payments");
    }

    public List<Payment> findAll(CompaniesEntity companiesEntity,
                                 PaymentsTypesEntity paymentsTypesEntity,
                                 StatesCompaniesEntity statesCompaniesEntity,
                                 EmailAddressesEntity emailAddressesEntity
    ) {
        return findByCriteria("", companiesEntity, paymentsTypesEntity,statesCompaniesEntity,
                emailAddressesEntity);
    }

    public Payment findById(String id,
                            CompaniesEntity companiesEntity,
                            PaymentsTypesEntity paymentsTypesEntity,
                            StatesCompaniesEntity statesCompaniesEntity,
                            EmailAddressesEntity emailAddressesEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, companiesEntity,
                paymentsTypesEntity,statesCompaniesEntity,emailAddressesEntity).get(0);
    }




    public List<Payment> findByCriteria(String criteria,CompaniesEntity companiesEntity,
                                        PaymentsTypesEntity paymentsTypesEntity,
                                        StatesCompaniesEntity statesCompaniesEntity,
                                        EmailAddressesEntity emailAddressesEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Payment> payments = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) payments.add(Payment.build(rs,companiesEntity,paymentsTypesEntity,
                    statesCompaniesEntity,emailAddressesEntity));
            return payments;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return payments;
    }



}
