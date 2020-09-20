package com.example.currency_exchange_calculator;

import java.io.Serializable;

public class Currency implements Serializable {
    private String from,to;
    private double amount, result;

    public Currency(String from, String to, double amount, double result){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.result = result;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", amount=" + amount +
                ", result=" + result +
                '}';
    }
}
