package com.entity;

import java.io.Serializable;
import java.util.List;

/**
 * (Bill)实体类
 *
 * @author makejava
 * @since 2020-10-26 19:50:48
 */
public class Bill implements Serializable {
    private static final long serialVersionUID = 750401876349540855L;

    public Bill(){}
    public Bill(List<String> stringList,List<Double> doubleList) {
        this.id = null;
        this.dealDay = stringList.get(0);
        this.dealTime = stringList.get(1);
        this.interestDay = stringList.get(2);
        this.dealType = stringList.get(3);
        this.debit = doubleList.get(0);
        this.credit = doubleList.get(1);
        this.balance = doubleList.get(2);
        this.digest = stringList.get(4);
        this.serialNo = stringList.get(5);
        this.flowNo = stringList.get(6);
        this.businessName = stringList.get(7);
        this.purpose = stringList.get(8);
        this.businessNo = stringList.get(9);
        this.businessDigest = stringList.get(10);
        this.otherDigest = stringList.get(11);
        this.payBranch = stringList.get(12);
        this.payName = stringList.get(13);
        this.payNo = stringList.get(14);
        this.payBankNo = stringList.get(15);
        this.payBankName = stringList.get(16);
        this.payBankAddress = stringList.get(17);
        this.companyBranch = stringList.get(18);
        this.companyNo = stringList.get(19);
        this.companyName = stringList.get(20);
        this.information = stringList.get(21);
        this.accessory = stringList.get(22);
        this.strikeBalance = stringList.get(23);
        this.extendDigest = stringList.get(24);
        this.transactionNo = stringList.get(25);
        this.billNo = stringList.get(26);
        this.orderNo = stringList.get(27);
        this.interiorNo = stringList.get(28);
    }

    private Integer id;

    private String dealDay;

    private String dealTime;

    private String interestDay;

    private String dealType;

    private Double debit;

    private Double credit;

    private Double balance;

    private String digest;

    private String serialNo;

    private String flowNo;

    private String businessName;

    private String purpose;

    private String businessNo;

    private String businessDigest;

    private String otherDigest;

    private String payBranch;

    private String payName;

    private String payNo;

    private String payBankNo;

    private String payBankName;

    private String payBankAddress;

    private String companyBranch;

    private String companyNo;

    private String companyName;

    private String information;

    private String accessory;

    private String strikeBalance;

    private String extendDigest;

    private String transactionNo;

    private String billNo;

    private String orderNo;

    private String interiorNo;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDealDay() {
        return dealDay;
    }

    public void setDealDay(String dealDay) {
        this.dealDay = dealDay;
    }

    public String getDealTime() {
        return dealTime;
    }

    public void setDealTime(String dealTime) {
        this.dealTime = dealTime;
    }

    public String getInterestDay() {
        return interestDay;
    }

    public void setInterestDay(String interestDay) {
        this.interestDay = interestDay;
    }

    public String getDealType() {
        return dealType;
    }

    public void setDealType(String dealType) {
        this.dealType = dealType;
    }

    public Double getDebit() {
        return debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getFlowNo() {
        return flowNo;
    }

    public void setFlowNo(String flowNo) {
        this.flowNo = flowNo;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getBusinessNo() {
        return businessNo;
    }

    public void setBusinessNo(String businessNo) {
        this.businessNo = businessNo;
    }

    public String getBusinessDigest() {
        return businessDigest;
    }

    public void setBusinessDigest(String businessDigest) {
        this.businessDigest = businessDigest;
    }

    public String getOtherDigest() {
        return otherDigest;
    }

    public void setOtherDigest(String otherDigest) {
        this.otherDigest = otherDigest;
    }

    public String getPayBranch() {
        return payBranch;
    }

    public void setPayBranch(String payBranch) {
        this.payBranch = payBranch;
    }

    public String getPayName() {
        return payName;
    }

    public void setPayName(String payName) {
        this.payName = payName;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getPayBankNo() {
        return payBankNo;
    }

    public void setPayBankNo(String payBankNo) {
        this.payBankNo = payBankNo;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public String getPayBankAddress() {
        return payBankAddress;
    }

    public void setPayBankAddress(String payBankAddress) {
        this.payBankAddress = payBankAddress;
    }

    public String getCompanyBranch() {
        return companyBranch;
    }

    public void setCompanyBranch(String companyBranch) {
        this.companyBranch = companyBranch;
    }

    public String getCompanyNo() {
        return companyNo;
    }

    public void setCompanyNo(String companyNo) {
        this.companyNo = companyNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getStrikeBalance() {
        return strikeBalance;
    }

    public void setStrikeBalance(String strikeBalance) {
        this.strikeBalance = strikeBalance;
    }

    public String getExtendDigest() {
        return extendDigest;
    }

    public void setExtendDigest(String extendDigest) {
        this.extendDigest = extendDigest;
    }

    public String getTransactionNo() {
        return transactionNo;
    }

    public void setTransactionNo(String transactionNo) {
        this.transactionNo = transactionNo;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getInteriorNo() {
        return interiorNo;
    }

    public void setInteriorNo(String interiorNo) {
        this.interiorNo = interiorNo;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", dealDay='" + dealDay + '\'' +
                ", dealTime='" + dealTime + '\'' +
                ", interestDay='" + interestDay + '\'' +
                ", dealType='" + dealType + '\'' +
                ", debit=" + debit +
                ", credit=" + credit +
                ", balance=" + balance +
                ", digest='" + digest + '\'' +
                ", serialNo='" + serialNo + '\'' +
                ", flowNo='" + flowNo + '\'' +
                ", businessName='" + businessName + '\'' +
                ", purpose='" + purpose + '\'' +
                ", businessNo='" + businessNo + '\'' +
                ", businessDigest='" + businessDigest + '\'' +
                ", otherDigest='" + otherDigest + '\'' +
                ", payBranch='" + payBranch + '\'' +
                ", payName='" + payName + '\'' +
                ", payNo='" + payNo + '\'' +
                ", payBankNo='" + payBankNo + '\'' +
                ", payBankName='" + payBankName + '\'' +
                ", payBankAddress='" + payBankAddress + '\'' +
                ", companyBranch='" + companyBranch + '\'' +
                ", companyNo='" + companyNo + '\'' +
                ", companyName='" + companyName + '\'' +
                ", information='" + information + '\'' +
                ", accessory='" + accessory + '\'' +
                ", strikeBalance='" + strikeBalance + '\'' +
                ", extendDigest='" + extendDigest + '\'' +
                ", transactionNo='" + transactionNo + '\'' +
                ", billNo='" + billNo + '\'' +
                ", orderNo='" + orderNo + '\'' +
                ", interiorNo='" + interiorNo + '\'' +
                '}';
    }
}