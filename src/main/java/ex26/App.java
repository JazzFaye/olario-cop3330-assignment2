/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex26;

import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    private static double balance, APR, monthly_payment, months = 0;

    public static void main(String [] args) {
        user_input();
        months = PaymentCalculator.calculateMonthsUntilPaidOff(balance,APR,monthly_payment);
        String output = result_String();
        System.out.println(output);

    }
    public static void user_input(){
        System.out.print("What is your balance? ");
        balance = sc.nextDouble();
        System.out.print("What is the APR on the card (as a percent)? ");
        APR = sc.nextDouble();
        System.out.print("What is the monthly payment you can make? ");
        monthly_payment = sc.nextDouble();
    }
    public static String result_String(){
        return String.format("It will take you %.0f months to pay off this card.", Math.ceil(months));
    }
}
class PaymentCalculator{
    public static double calculateMonthsUntilPaidOff (double b, double APR, double p){
        double i = ((APR/100)/360);
        double overall = -(1/30.0) * Math.log(1 + b/p * (1 - (Math.pow(1 + i, 30)))) / (Math.log(1 + i));
        return Math.ceil(overall);
    }

}

