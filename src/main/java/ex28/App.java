/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex28;

import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Please enter the numbers you wish to add: ");
        String input = sc.nextLine();
        int j = Integer.parseInt(input);
        System.out.println(result(Loop(j)));
    }

    public static int Loop(int sum) {
        int total = 0;
        for (int i = 0; i < sum; i++) {
            System.out.print("Enter a number: ");
            double input = sc.nextDouble();
            total += input;
        }
        return total;
    }
    public static String result (int sum){
        String output = "The total is ";
        output += sum;
        return output;
    }

}
