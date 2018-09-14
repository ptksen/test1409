package com.testbankmanagement.dto;

/**
 * Created by Cao Nguyen on 9/14/2018.
 */
public class BankDTO {
    private String bankName;
    private String bankAccount;
    private String userName;

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "BankDTO{" +
                "bankName='" + bankName + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
