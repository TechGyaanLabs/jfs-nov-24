package com.careerit.cj.day9;

import java.time.LocalDate;
import java.util.Locale;

public class Invoice {

    private String number;
    private String name;
    private double amount;
    private String dueDate;
    private LocalDate fromDate;
    private LocalDate toDate;

    public Invoice(String number, String name, double amount, String dueDate, LocalDate fromDate, LocalDate toDate) {
        this.number = number;
        this.name = name;
        this.amount = amount;
        this.dueDate = dueDate;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}
