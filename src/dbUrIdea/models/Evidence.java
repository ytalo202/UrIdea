package dbUrIdea.models;

/**
 * Created by UrIdea on 15/06/2017.
 */
public class Evidence {
    private String id;
    private EvidencesType evidencesType;
    private Evaluation evaluation;

    public Evidence() {
    }

    public Evidence(String id, EvidencesType evidencesType, Evaluation evaluation) {
        this.setId(id);
        this.setEvidencesType(evidencesType);
        this.setEvaluation(evaluation);
    }

    public String getId() {
        return id;
    }

    public Evidence setId(String id) {
        this.id = id;
        return this;
    }

    public EvidencesType getEvidencesType() {
        return evidencesType;
    }

    public Evidence setEvidencesType(EvidencesType evidencesType) {
        this.evidencesType = evidencesType;
        return this;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }

    public Evidence setEvaluation(Evaluation evaluation) {
        this.evaluation = evaluation;
        return this;
    }
}
