package com.johnmsaylor;

public class TipCalculator {

    static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double tip = meal_cost * ((float)tip_percent / (float) 100);
        double tax = meal_cost * ((float)tax_percent / (float) 100);
        double total = meal_cost + tip + tax;
        System.out.println(tip);
        System.out.println(tax);
        System.out.println(total);

        System.out.println(Math.round(meal_cost + tip + tax));
    }
}
