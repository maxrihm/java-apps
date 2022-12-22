package com.company;
import java.util.Scanner;

public class Macronutrients {
    static double proteins;
    static double fats;
    static double carbohydrates;
    static double product_weight;
    static String name;

    public static void inputMacs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Protein ");
        String s_proteins = scanner.nextLine();
        proteins=Double.parseDouble(s_proteins);
        System.out.print("Fat ");
        String s_fats = scanner.nextLine();
        fats=Double.parseDouble(s_fats);
        System.out.print("Carbohydrate ");
        String s_carbohydrates = scanner.nextLine();
        carbohydrates=Double.parseDouble(s_carbohydrates);
        System.out.print("Serving size (g) ");
        String s_product_weight = scanner.nextLine();
        product_weight=Double.parseDouble(s_product_weight);
        System.out.print("Name ");
        String s_name = scanner.nextLine();
        name = s_name;
    }

}
