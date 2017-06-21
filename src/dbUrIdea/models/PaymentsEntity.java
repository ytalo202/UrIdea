package dbUrIdea.models;

import java.sql.Connection;

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


}
