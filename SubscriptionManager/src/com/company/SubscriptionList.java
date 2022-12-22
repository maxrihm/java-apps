package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SubscriptionList {
    public List<Subscription> subscriptions_list;

    public SubscriptionList() throws IOException {
        subscriptions_list = new ArrayList<Subscription>();
        createFromArr(); sortByDaysLeft();
    }

    public void createFromArr() throws IOException {
        InputSubscription read = new InputSubscription();
        String[] arr = read.stringToArr();
        for (int i=0; i < arr.length; i += 3) subscriptions_list.add(new Subscription(arr[i], Double.parseDouble(arr[i+1]), arr[i+2]));       
    }
    
    public void showAll() {
        subscriptions_list.forEach((s) -> {
            s.show();
            System.out.println("\n");
        });
    }

    public void sortByDaysLeft() {
        subscriptions_list.sort(Comparator.comparing(Subscription::getDaysLeft));
    }

    public void totalPrice() {
        double sum = subscriptions_list.stream().mapToDouble(Subscription::getPrice).sum();
        System.out.println("Total price "+sum);
    }

}
    
