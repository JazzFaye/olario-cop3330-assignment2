/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static String First;
    private static String Second;
    public static void main(String[] args) {
        Strings();
        answer();
    }

    public static void Strings() {
        System.out.print("Enter two strings and I'll tell you if they are anagrams: \nEnter the first string: ");
        First = sc.nextLine();
        System.out.print("Enter the second string: ");
        Second = sc.nextLine();
    }
    public static boolean isAnagram(String first, String second) {
        String S1 = first.replaceAll("\\s", "");
        String S2 = second.replaceAll("\\s", "");

        boolean checkif;
        if (S1.length() != S2.length()) {
            checkif = false;
        } else {
            char[] array1 = S1.toLowerCase().toCharArray();
            char[] array2 = S2.toLowerCase().toCharArray();
            Arrays.sort(array1);
            Arrays.sort(array2);

            checkif = (Arrays.equals(array1, array2));
        }
        return checkif;
    }
    public static void answer() {
        if (isAnagram(First, Second)) {
            System.out.printf("\"%s\"" + " and " + "\"%s\"" + " are anagrams.", First, Second);
        } else {
            System.out.printf("\"%s\"" + " and " + "\"%s\"" + " not are anagrams.", First, Second);
        }
    }

}





