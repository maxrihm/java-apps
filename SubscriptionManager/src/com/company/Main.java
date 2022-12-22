package com.company;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException, IOException {
        SubscriptionList sl = new SubscriptionList();
        sl.totalPrice();
        sl.showAll();


    }
}