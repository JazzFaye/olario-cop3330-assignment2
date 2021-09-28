/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex31;

import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static int rest_pulse, age;

    public static void main(String[] args) {
        user_input();
        TargetHeartRate(rest_pulse,age);
    }
    public static void user_input(){
        try {
            System.out.print("Please enter your resting pulse rate: ");
            rest_pulse = sc.nextInt();
            System.out.print("Please enter your age: ");
            age = sc.nextInt();
            System.out.printf("\nResting pulse: %d \t\tAge: %d \n", rest_pulse,age);
        } catch (NumberFormatException e) {
            System.out.print("Invalid input. Enter numerical values only.");
        }
    }
    public static int TargetHeartRate(int rest_pulse, int age){
        int Heart_Rate = 0;
        System.out.println("\nIntensity |\t Rate\n----------|--------");
        for(int i = 55; i <= 95; i += 5){
            Heart_Rate = (int) Math.ceil((((220 - age) - rest_pulse) * i/100) + rest_pulse);
            System.out.print((String.format(" %s%%\t  |\t%s bpm\n", i, Heart_Rate)));
        }
        return Heart_Rate;
    }
}
