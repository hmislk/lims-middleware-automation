package org.carecode.lims.libraries;

/**
 *
 * @author buddh
 */
public class ResultsRecord {

    private int frameNumber;
    private String testCode;
    private double resultValue;
    private double minimumValue;
    private double maximumValue;
    private String flag;
    private String sampleType;
    private String resultUnits;
    private String resultDateTime;
    private String instrumentName;

    // Constructor
    public ResultsRecord(int frameNumber, String testCode, double resultValue, String resultUnits,
            String resultDateTime, String instrumentName) {
        this.frameNumber = frameNumber;
        this.testCode = testCode;
        this.resultValue = resultValue;
        this.resultUnits = resultUnits;
        this.resultDateTime = resultDateTime;
        this.instrumentName = instrumentName;
    }

    
    
    
    // Getters and Setters
    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

    public double getResultValue() {
        return resultValue;
    }

    public void setResultValue(double resultValue) {
        this.resultValue = resultValue;
    }

    public String getResultUnits() {
        return resultUnits;
    }

    public void setResultUnits(String resultUnits) {
        this.resultUnits = resultUnits;
    }

    public String getResultDateTime() {
        return resultDateTime;
    }

    public void setResultDateTime(String resultDateTime) {
        this.resultDateTime = resultDateTime;
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    public double getMinimumValue() {
        return minimumValue;
    }

    public void setMinimumValue(double minimumValue) {
        this.minimumValue = minimumValue;
    }

    public double getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(double maximumValue) {
        this.maximumValue = maximumValue;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getSampleType() {
        return sampleType;
    }

    public void setSampleType(String sampleType) {
        this.sampleType = sampleType;
    }
}
