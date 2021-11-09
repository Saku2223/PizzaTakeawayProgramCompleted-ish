package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> pizzaSize = new ArrayList();
        pizzaSize.add("small");
        pizzaSize.add("medium");
        pizzaSize.add("large");
        System.out.println("What pizza size would you like? (small, medium, or large)");
        double smallPizza = 7.99D;
        double mediumPizza = 10.99D;
        double largePizza = 13.99D;
        int var9 = input.nextInt();

        try {
            System.out.println("What topping would you like? (cheese, pineapple, mushrooms, pepperoni, etc)");
            int topping1 = input.nextInt();
            System.out.println("Enter your second topping");
            int topping2 = input.nextInt();
            System.out.println("Would you like any more toppings?");
            if (input.next().equals("Yes")) {
                int var12 = input.nextInt();
            }
        } catch (InputMismatchException var14) {
            System.out.println("Not a pizza topping!");
        }

        double x = 1.25D;
        System.out.println("Total is " + pizzaSize + x);
    }
}