/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex29;

import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String rate = "0";
        double years = formula(user_input(rate));
        System.out.println(output(years));
    }

    public static String user_input(String rate) {
        while (rate.matches("\\b[^0-9]+\\b.*") || rate.equals("0")) {
            System.out.print("What is the rate of return? ");
            rate = sc.nextLine();

            if (rate.matches("\\b[^0-9]+\\b.*") || rate.equals("0")) {
                System.out.print("Sorry. That's not a valid input. \n");
            }
        }

        return rate;
    }
    public static double formula(String r) {
        double number = Double.parseDouble(r);
        return Math.ceil(72 / number);
    }

    public static String output(double years) {
        return String.format("It will take %.0f years to double your initial investment", years);
    }
}
