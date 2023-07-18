package com.banksystem.onlinebankingsystem.Account;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Account{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    @Min(value=3, message="Value must be greater than or equal to 1.")
    @Max(value=3, message="Value must be less  than or equal to 1.")
    private int CVV;
    @NotNull(message = "This is a required field.")
    @Size(min=19, message = "This is a required field.")
    private String cardNumber;
    private String firstName, lastName, nameOfBank;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/yyyy")
    private Date validityPeriod;


    public Account(){}

    public Account(String cardNumber, String firstName, String lastName, Date validityPeriod, String nameOfBank, short CVV){
        this.cardNumber = cardNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.validityPeriod = validityPeriod;
        this.nameOfBank = nameOfBank;
        this.CVV = CVV;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getCVV() {
        return CVV;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNameOfBank() {
        return nameOfBank;
    }

    public Date getValidityPeriod() {
        return validityPeriod;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCVV(int CVV) {
        this.CVV = CVV;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNameOfBank(String nameOfBank) {
        this.nameOfBank = nameOfBank;
    }

    public void setValidityPeriod(Date validityPeriod) {
        this.validityPeriod = validityPeriod;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", CVV=" + CVV +
                ", cardNumber='" + cardNumber + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", validityPeriod='" + validityPeriod + '\'' +
                ", nameOfBank='" + nameOfBank + '\'' +
                '}';
    }
}
