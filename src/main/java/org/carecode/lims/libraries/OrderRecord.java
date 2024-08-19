package org.carecode.lims.libraries;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 
 * Represents an order record for laboratory information systems
 * Author :     Dr M H B Ariyaratne, MBBS, MSc(Biomedical Informatics), MD(Health Informatics) & ChatGPT
 *              Consultant in Health Informatics
 *              buddhika.ari@gmail.com
 * 
 */
public class OrderRecord {
    private int frameNumber;
    private String sampleId;
    private List<String> testNames;
    private String specimenCode;
    private Date orderDateTime; // Changed to Date type
    private String orderDateTimeStr; // Holds the ASTM formatted date string
    private String testInformation;

    // SimpleDateFormat to format the Date object to the required ASTM format
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");

    // Constructor accepting Date object for orderDateTime
    public OrderRecord(int frameNumber, String sampleId, List<String> testNames, String specimenCode, 
                       Date orderDateTime, String testInformation) {
        this.frameNumber = frameNumber;
        this.sampleId = sampleId;
        this.testNames = new ArrayList<>(testNames);
        this.specimenCode = specimenCode;
        this.orderDateTime = orderDateTime;
        this.orderDateTimeStr = dateFormat.format(orderDateTime); // Format the date upon construction
        this.testInformation = testInformation;
    }

    // Constructor for direct string input for backward compatibility or specific use cases
    public OrderRecord(int frameNumber, String sampleId, List<String> testNames, String specimenCode, 
                       String orderDateTimeStr, String testInformation) {
        this.frameNumber = frameNumber;
        this.sampleId = sampleId;
        this.testNames = new ArrayList<>(testNames);
        this.specimenCode = specimenCode;
        this.orderDateTimeStr = orderDateTimeStr;
        this.testInformation = testInformation;
    }

    // Getters and Setters
    public int getFrameNumber() {
        return frameNumber;
    }

    public void setFrameNumber(int frameNumber) {
        this.frameNumber = frameNumber;
    }

    public String getSampleId() {
        return sampleId;
    }

    public void setSampleId(String sampleId) {
        this.sampleId = sampleId;
    }

    public List<String> getTestNames() {
        return new ArrayList<>(testNames);
    }

    public void setTestNames(List<String> testNames) {
        this.testNames = new ArrayList<>(testNames);
    }

    public String getSpecimenCode() {
        return specimenCode;
    }

    public void setSpecimenCode(String specimenCode) {
        this.specimenCode = specimenCode;
    }

    public String getOrderDateTimeStr() {
        orderDateTimeStr = dateFormat.format(getOrderDateTime()); 
        return orderDateTimeStr;
    }

    
    public String getTestInformation() {
        return testInformation;
    }

    public void setTestInformation(String testInformation) {
        this.testInformation = testInformation;
    }

    public Date getOrderDateTime() {
        if(orderDateTime==null){
            orderDateTime=new Date();
        }
        return orderDateTime;
    }
}
