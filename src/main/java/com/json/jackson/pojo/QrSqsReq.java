package com.json.jackson.pojo;

//{
//        "trxNumber": 1256356317,
//        "orgId":5558,
//        "qrCodeUrlText": "http://hwegwgwbduwegdbjhwegdwudywtgwduytdgwebduwdtwged.mnuydgbdwe8dgeudb&&&cwr7gruitr8fut7",
//        "ofaRequestId":2376527645
//        "customerTrxId": 76237657
//        "dateTime": "04062021"
//        }

public class QrSqsReq {

    private String trxNumber;
    private int orgId;
    private String qrCodeUrlText;
    private long ofaRequestId;
    private long customerTrxId;
    private String dateTime;

    public QrSqsReq() {
    }

    public QrSqsReq(String trxNumber, int orgId, String qrCodeUrlText, long ofaRequestId, long customerTrxId, String dateTime) {
        this.trxNumber = trxNumber;
        this.orgId = orgId;
        this.qrCodeUrlText = qrCodeUrlText;
        this.ofaRequestId = ofaRequestId;
        this.customerTrxId = customerTrxId;
        this.dateTime = dateTime;
    }

    public String getTrxNumber() {
        return trxNumber;
    }

    public void setTrxNumber(String trxNumber) {
        this.trxNumber = trxNumber;
    }

    public int getOrgId() {
        return orgId;
    }

    public void setOrgId(int orgId) {
        this.orgId = orgId;
    }

    public String getQrCodeUrlText() {
        return qrCodeUrlText;
    }

    public void setQrCodeUrlText(String qrCodeUrlText) {
        this.qrCodeUrlText = qrCodeUrlText;
    }

    public long getOfaRequestId() {
        return ofaRequestId;
    }

    public void setOfaRequestId(long ofaRequestId) {
        this.ofaRequestId = ofaRequestId;
    }

    public long getCustomerTrxId() {
        return customerTrxId;
    }

    public void setCustomerTrxId(long customerTrxId) {
        this.customerTrxId = customerTrxId;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }


}

