package dbUrIdea.models;

import java.sql.Connection;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class PaymentEntity extends BaseEntity {

    public PaymentEntity() {
        super();
    }


    public PaymentEntity(Connection connection) {
        super(connection,"payments");
    }


}
