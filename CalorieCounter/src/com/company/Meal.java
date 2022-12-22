package com.company;

import java.util.Scanner;

public class Meal {
    static double product_weight;
    static double kcal;
    static String name;

    public static void mealInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Serving size (g) ");
        String s_product_weight = scanner.nextLine();
        product_weight=Double.parseDouble(s_product_weight);
        System.out.print("Calories ");
        String s_kcal = scanner.nextLine();
        kcal=Double.parseDouble(s_kcal);
        System.out.print("Name ");
        String s_name = scanner.nextLine();
        name = s_name;
    }
}
