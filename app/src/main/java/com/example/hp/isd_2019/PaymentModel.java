package com.example.hp.isd_2019;

public class PaymentModel {
    private int client_id;
    private double balance;
    private int payment_state;
    String issued_date;
    String payed_date;

    public PaymentModel() {
    }

    public PaymentModel(int client_id, double balance, int payment_state) {
        this.client_id = client_id;
        this.balance = balance;
        this.payment_state = payment_state;
    }

    public int getClient_id() {
        return client_id;
    }

    public double getBalance() {
        return balance;
    }

    public int getPayment_state() {
        return payment_state;
    }

    public String getIssued_date() {
        return issued_date;
    }

    public String getPayed_date() {
        return payed_date;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPayment_state(int payment_state) {
        this.payment_state = payment_state;
    }

    public void setIssued_date(String issued_date) {
        this.issued_date = issued_date;
    }

    public void setPayed_date(String payed_date) {
        this.payed_date = payed_date;
    }
}
