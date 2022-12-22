package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Subscription {
    private String _name;
    private double _price;

    private String _last_payment_string;
    private LocalDate _last_payment;
    private long _days_left;
    private LocalDate _next_payment;

    public Subscription(String name, double price, String last_payment_string) {
        _name = name;
        _price = price;
        _last_payment_string = last_payment_string;
        _last_payment = LocalDate.parse(_last_payment_string, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        _next_payment = _last_payment.plusMonths(1);
        _days_left = ChronoUnit.DAYS.between(LocalDate.now(), _next_payment);

    }

    public void show() {
        System.out.println("Subscription: "+_name);
        System.out.println("Price: "+_price);
        System.out.println("Last payment: "+_last_payment);
        System.out.println(_days_left+" days left");
        System.out.println("Next payment: "+_next_payment);
    }

    public long getDaysLeft(){
        return _days_left;
    }
    public double getPrice(){
        return _price;
    }

}