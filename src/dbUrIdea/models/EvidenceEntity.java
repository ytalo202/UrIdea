package dbUrIdea.models;

import java.sql.Connection;

/**
 * Created by Yoshinon on 17/06/2017.
 */
public class EvidenceEntity extends BaseEntity {
    public EvidenceEntity() {
        super();
    }

    public EvidenceEntity(Connection connection) {
        super(connection,"evidences");
    }
}
