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
    public boolean add(Payment payment) {
        String sql = "INSERT INTO payments(id, id_companies, id_payments_type,card_number,name," +
                "last_name,first_addressF,,second_addressF,date,location,country,code_zip" +
                ",cell_phone_number,payment_amount) " +
                "VALUES("
                + payment.getIdAsString() + ", "
                + payment.getCompany().getIdAsValue()+", "
                + payment.getPaymentsType().getIdAsString()+", "
                +payment.getCardNumberAsValue()+","
                +payment.getNameAsValue()+", "
                +payment.getLastNameFAsValue()+", "
                +payment.getFirstAddressFAsValue()+", "
                +payment.getSecondAddressFAsValue()+", "
                +payment.getDateAsValue()+", "
                +payment.getLocationAsValue()+", "
                +payment.getCountryAsValue()+", "
                +payment.getCodeZipAsValue()+", "
                +payment.getCellPhoneNumberAsValue()+", "
                +payment.getAmountAsValue()+

                ")";
        return change(sql);
    }

    public boolean delete(Payment payment) {
        String sql = "DELETE FROM payments WHERE id = "
                + payment.getId();
        return change(sql);
    }
    public boolean delete(String id) {
        return change("DELETE FROM payments WHERE id = " +
                "'" + id+ "'");
    }






}
