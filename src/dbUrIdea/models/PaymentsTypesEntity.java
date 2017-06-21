package dbUrIdea.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 * Created by Yoshinon on 17/06/2017.
 */
public class PaymentsTypesEntity extends BaseEntity{

    public PaymentsTypesEntity() {
    }

    public PaymentsTypesEntity(Connection connection) {
        super(connection,"payment_types");
    }
    List<PaymentsType> findAll() {
        return findByCriteria("");
    }

    public PaymentsType findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);

        return findByCriteria(criteria).get(0);
    }

    public PaymentsType findByName(String name) {
        String criteria = " payment_type_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<PaymentsType> findAllOrderedByName() {
        String criteria = "true ORDER BY payment_type_name";
        return findByCriteria(criteria);
    }

    public List<PaymentsType> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<PaymentsType> payment_types = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                payment_types.add(PaymentsType.build(resultSet));
            }
            return payment_types;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return payment_types;
    }

    public boolean add(PaymentsType paymentsType) {
        String sql = "INSERT INTO payment_types(id, payment_type_name) " +
                "VALUES(" + paymentsType.getIdAsString() + ", " +
                paymentsType.getNameAsValue() + ")";
        return change(sql);
    }

    public boolean delete(PaymentsType paymentsType) {
        String sql = "DELETE FROM payment_types WHERE id = " + paymentsType.getIdAsString();
        return change(sql);
    }

    public boolean delete(String name) {
        return change("DELETE FROM payment_types WHERE payment_type_name = " +
                "'" + name + "'");
    }

    public boolean update(PaymentsType paymentsType) {
        String sql = "UPDATE payment_types SET payment_type_name = " + paymentsType.getNameAsValue() +
                " WHERE id = " + paymentsType.getIdAsString();
        return change(sql);
    }






}
