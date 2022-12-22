package com.company;

public class Calculate {

    public static double calculateKcal(Macronutrients obj) {
        double kcal = obj.proteins * 4 + obj.carbohydrates * 4 + obj.fats * 9;
        double kcal_total = kcal * obj.product_weight/100;
        kcal_total = round(kcal_total, 1);
        return kcal_total;
    }

    public static void calculateMacronutrients(Macronutrients obj) {
        double proteins_total = obj.proteins * obj.product_weight/100;
        double fats_total = obj.fats * obj.product_weight/100;
        double carbohydrates_total = obj.carbohydrates * obj.product_weight/100;
        proteins_total = round(proteins_total, 1);
        fats_total = round(fats_total, 1);
        carbohydrates_total = round(carbohydrates_total, 1);
        System.out.println("Proteins " + proteins_total);
        System.out.println("Fats " + fats_total);
        System.out.println("Carbohydrates " + carbohydrates_total);
    }

    public static double round(double value, int places) {
        double scale = Math.pow(10, places);
        return Math.round(value * scale) / scale;
    }

    public static double calculateByMeal(Meal obj) {
        double kcal_total = obj.kcal * obj.product_weight/100;
        kcal_total = round(kcal_total, 1);
        return kcal_total;
    }

}
