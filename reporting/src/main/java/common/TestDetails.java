package common;

import java.sql.Timestamp;

public class TestDetails {
    private int testId;
    private String testName;
    private String testDescription;
    private boolean testResult;
    private Timestamp testStarts;
    private Timestamp testEnds;

    public int getTestId() {
        return testId;
    }

    public void setTestId(int testId) {
        this.testId = testId;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getTestDescription() {
        return testDescription;
    }

    public void setTestDescription(String testDescription) {
        this.testDescription = testDescription;
    }

    public boolean isTestResult() {
        return testResult;
    }

    public void setTestResult(boolean testResult) {
        this.testResult = testResult;
    }

    public Timestamp getTestStarts() {
        return testStarts;
    }

    public void setTestStarts(Timestamp testStarts) {
        this.testStarts = testStarts;
    }

    public Timestamp getTestEnds() {
        return testEnds;
    }

    public void setTestEnds(Timestamp testEnds) {
        this.testEnds = testEnds;
    }
}
