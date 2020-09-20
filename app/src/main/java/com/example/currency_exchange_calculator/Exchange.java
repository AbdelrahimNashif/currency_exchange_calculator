package com.example.currency_exchange_calculator;

import java.io.Serializable;

public class Exchange implements Serializable {
    private Currency from,to;
    private double amount, result;

    public Exchange(Currency from, Currency to, double amount, double result){
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.result = result;
    }

    public Currency getFrom() {
        return from;
    }

    public void setFrom(Currency from) {
        this.from = from;
    }

    public Currency getTo() {
        return to;
    }

    public void setTo(Currency to) {
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
