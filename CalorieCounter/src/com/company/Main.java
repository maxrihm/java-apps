package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter [N] - if you have nutrition facts about your meal\n" +
                "Enter [R] - if you have only number of calories of your meal\n");
        String choice = scanner.nextLine();

        if (choice.equals("N") || (choice.equals("n"))) {
            Macronutrients m = new Macronutrients();
            Calculate c = new Calculate();
            m.inputMacs();
            System.out.println(m.name + "\n" + "Calories " + c.calculateKcal(m));
            c.calculateMacronutrients(m);
        }

        if (choice.equals("R") || (choice.equals("r"))) {
            Meal meal = new Meal();
            Calculate c = new Calculate();
            meal.mealInput();
            System.out.println(meal.name + "\n" + "Calories per meal " + c.calculateByMeal(meal));
        }


    }
}