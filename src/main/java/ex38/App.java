/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex38;

import java.util.ArrayList;
import java.util.Scanner;


public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = sc.nextLine();
        String[] original = data.split(" ");

        ArrayList<Integer> NewArray = FilterEvenNumber(original);
        System.out.println(EvenNumbers(NewArray));
    }

    public static ArrayList<Integer> FilterEvenNumber(String [] numbers) {
        var list = new ArrayList<Integer>();
        for (String i : numbers) {
            int s = Integer.parseInt(i);
            if (s % 2 == 0) {
               list.add(s);
            }
        }
        return list;
    }
    public static String EvenNumbers(ArrayList<Integer> newArray) {
        String result = "The even numbers are";
        for (Integer integer : newArray) {
            result += " "+ integer;
        }
        return result;
    }
}