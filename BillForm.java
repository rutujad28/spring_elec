package com.example.electricitybillcalculator;

public class BillForm {
    private String name;
    private String mobile;
    private String address;
    private String billingUnit;
    private String month;
    private int units;
    private String payment;

    // Constructors, getters, and setters

    public BillForm() {
        // Default constructor
    }

    public BillForm(String name, String mobile, String address, String billingUnit, String month, int units, String payment) {
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.billingUnit = billingUnit;
        this.month = month;
        this.units = units;
        this.payment = payment;
    }

    // Getters and setters (generated using your IDE or manually)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBillingUnit() {
        return billingUnit;
    }

    public void setBillingUnit(String billingUnit) {
        this.billingUnit = billingUnit;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
}
