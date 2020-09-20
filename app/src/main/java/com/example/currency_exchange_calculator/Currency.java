package com.example.currency_exchange_calculator;

import java.io.Serializable;

public class Currency implements Serializable {
private String code;
private String symbol;
private double value;

    public Currency(String code, String symbol, double value) {
        this.code = code;
        this.symbol = symbol;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "code='" + code + '\'' +
                ", symbol='" + symbol + '\'' +
                ", value=" + value +
                '}';
    }
    public static  Currency ILS=new Currency("ILS","₪",1);
    public static Currency USD=new Currency("USD","$",3.42);
    public static Currency EUR=new Currency("EUR","€",4.05);
    public static Currency GBP=new Currency("GBP","£",4.41);
    public static Currency AUD=new Currency("AUD","$",2.49);
    public static Currency CAD=new Currency("CAD", "$",2.59);
    public static Currency[] currencies={ILS,USD,EUR,GBP,AUD,CAD};
}

