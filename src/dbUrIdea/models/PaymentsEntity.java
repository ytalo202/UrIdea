package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Magnus on 17/06/2017.
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
                                 EmailAddressesEntity emailAddressesEntity)
    {
        return findByCriteria("", companiesEntity, paymentsTypesEntity, emailAddressesEntity);
    }

    public Payment findById(int id,
                            CompaniesEntity companiesEntity,
                            PaymentsTypesEntity paymentsTypesEntity,

                            EmailAddressesEntity emailAddressesEntity) {
        String criteria = "id = " + String.valueOf(id);
        return findByCriteria(criteria, companiesEntity,
                paymentsTypesEntity,emailAddressesEntity).get(0);
    }




    public List<Payment> findByCriteria(String criteria,CompaniesEntity companiesEntity,
                                        PaymentsTypesEntity paymentsTypesEntity,
                                        EmailAddressesEntity emailAddressesEntity) {

        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);

        List<Payment> payments = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) payments.add(Payment.build(
                    rs,companiesEntity,paymentsTypesEntity,emailAddressesEntity));
            return payments;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return payments;
    }


    public boolean add(Payment payment) {
        String sql = "INSERT payments(" +
                "id_companies, id_payment_type," +
                " card_number, name, " +
                " last_name, first_address, second_address, location, country, " +
                "code_zip, " +
                " cell_phone_number," +
                " payment_amount, " +
                " expiry_month, expiry_day, security_code) " +
                "VALUES("
                +payment.getCompany().getIdAsString()+", "
                +payment.getPaymentsType().getIdAsString()+", "
                +payment.getCardNumberAsValue()+", "
                +payment.getNameAsValue()+", "
                +payment.getLastNameAsValue()+", "
                +payment.getFirstAddressAsValue()+", "
                +payment.getSecondAddressAsValue()+", "
                +payment.getLocationAsValue()+", "
                +payment.getCountryAsValue()+", "
                +payment.getCodeZipAsValue()+", "
                +payment.getCellPhoneNumberAsValue()+", "
                +payment.getAmountAsValue()+", "
                +payment.getExpiryMonthAsString()+", "
                +payment.getExpiryDayAsString()+", "
                +payment.getSecurityCodeAsString()+
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

    public boolean update(Payment payment){
        String sql="UPDATE payments SET " +
                //"id_companies="+payment.getCompany().getIdAsString()+", " +
                //"id_payment_type="+payment.getPaymentsType().getIdAsString()+", " +
                "card_number = "+payment.getCardNumberAsValue()
                +", " +
                "name = "+payment.getNameAsValue()+", " +
                "last_name = "+payment.getLastNameAsValue()+", " +
                "first_address = "+payment.getFirstAddressAsValue()+", " +
                "second_address = "+payment.getSecondAddressAsValue()+", " +
                "location = "+payment.getLocationAsValue()+", " +
                "country = "+payment.getCountryAsValue()+", " +
                "code_zip = "+payment.getCodeZipAsValue()+", " +
                "cell_phone_number = "+payment.getCellPhoneNumberAsValue()+", " +
                "payment_amount = "+payment.getAmountAsValue()+", " +
                "expiry_month = "+payment.getExpiryDayAsString()+", " +
                "expiry_day = "+payment.getExpiryMonthAsString()+", " +
                "security_code = "+payment.getSecurityCodeAsString()+
                " WHERE id = "+payment.getIdAsString();
        return change(sql);
    }

    public boolean update(Evaluation evaluation) {
        String sql = "UPDATE evaluations SET " +
                "evaluation_date = "+evaluation.getDateAsValue()+ ", "+
                "grade = "+evaluation.getGradeAsString()+
                " WHERE id = " + evaluation.getIdAsString();

        return change(sql);
    }



}