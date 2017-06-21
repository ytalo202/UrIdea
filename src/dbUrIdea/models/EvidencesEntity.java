package dbUrIdea.models;

import java.sql.Connection;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class EvidencesEntity extends BaseEntity {
    public EvidencesEntity() {
        super();
    }

    public EvidencesEntity(Connection connection) {
        super(connection,"evidences");
    }
}
