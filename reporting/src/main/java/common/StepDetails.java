package common;

import java.sql.Timestamp;

public class StepDetails {
    private int stepId;
    private String stepName;
    private String stepDescription;
    private boolean stepResult;
    private Timestamp stepStarts;
    private Timestamp stepEnds;


    public int getStepId() {
        return stepId;
    }

    public void setStepId(int stepId) {
        this.stepId = stepId;
    }

    public String getStepName() {
        return stepName;
    }

    public void setStepName(String stepName) {
        this.stepName = stepName;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public boolean isStepResult() {
        return stepResult;
    }

    public void setStepResult(boolean stepResult) {
        this.stepResult = stepResult;
    }

    public Timestamp getStepStarts() {
        return stepStarts;
    }

    public void setStepStarts(Timestamp stepStarts) {
        this.stepStarts = stepStarts;
    }

    public Timestamp getStepEnds() {
        return stepEnds;
    }

    public void setStepEnds(Timestamp stepEnds) {
        this.stepEnds = stepEnds;
    }
}
