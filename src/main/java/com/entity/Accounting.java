package com.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Accounting)实体类
 *
 * @author makejava
 * @since 2020-10-21 17:01:27
 */
public class Accounting implements Serializable {
    private static final long serialVersionUID = 497568220279283980L;
    
    private Integer id;
    
    private String account;
    
    private String accountName;
    
    private Date tradingDate;
    
    private Integer debit;
    
    private Integer credit;
    
    private Integer balance;
    
    private String currency;
    
    private String reciprocalAccountName;
    
    private Integer reciprocalAccount;
    
    private String reciprocalBank;
    
    private Date chargeDate;
    
    private String abstracts;
    
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getTradingDate() {
        return tradingDate;
    }

    public void setTradingDate(Date tradingDate) {
        this.tradingDate = tradingDate;
    }

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getReciprocalAccountName() {
        return reciprocalAccountName;
    }

    public void setReciprocalAccountName(String reciprocalAccountName) {
        this.reciprocalAccountName = reciprocalAccountName;
    }

    public Integer getReciprocalAccount() {
        return reciprocalAccount;
    }

    public void setReciprocalAccount(Integer reciprocalAccount) {
        this.reciprocalAccount = reciprocalAccount;
    }

    public String getReciprocalBank() {
        return reciprocalBank;
    }

    public void setReciprocalBank(String reciprocalBank) {
        this.reciprocalBank = reciprocalBank;
    }

    public Date getChargeDate() {
        return chargeDate;
    }

    public void setChargeDate(Date chargeDate) {
        this.chargeDate = chargeDate;
    }

    public String getAbstracts() {
        return abstracts;
    }

    public void setAbstracts(String abstracts) {
        this.abstracts = abstracts;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Accounting{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", accountName='" + accountName + '\'' +
                ", tradingDate=" + tradingDate +
                ", debit=" + debit +
                ", credit=" + credit +
                ", balance=" + balance +
                ", currency='" + currency + '\'' +
                ", reciprocalAccountName='" + reciprocalAccountName + '\'' +
                ", reciprocalAccount=" + reciprocalAccount +
                ", reciprocalBank='" + reciprocalBank + '\'' +
                ", chargeDate=" + chargeDate +
                ", abstracts='" + abstracts + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}