/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex25;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static String password;

    public static void main(String[] args) {
        getpassword();
        int pc = PasswordValidator(password);
        String output = output(password, pc);
        System.out.println(output);

    }
    public static void getpassword() {
        System.out.print("Please create a password: ");
        password = sc.nextLine();
    }
    public static boolean length(String password) {
        return password.length() >= 8;
    }

    public static boolean letters(String password) {
        Pattern regex = Pattern.compile("[a-zA-Z]+");
        Matcher pass_word = regex.matcher(password);
        return pass_word.find();
    }

    public static boolean numbers(String password) {
        Pattern regex = Pattern.compile("[0-9]+");
        Matcher pass_word = regex.matcher(password);
        return pass_word.find();
    }

    public static boolean special_char(String password) {
        Pattern regex = Pattern.compile("[^a-zA-Z0-9]+");
        Matcher pass_word = regex.matcher(password);
        return pass_word.find();
    }

    public static int PasswordValidator(String password) {
        if (!length(password)) {
            if (numbers(password)) {
                return 1;
            } else if (letters(password)) {
                return 2;
            }
            return 2;
            }
         else if (length(password)) {
            if (letters(password) && numbers(password)) {
                if(special_char(password)){
                    return 4;
                }
                return 3;
            }
        }
        return 1;
    }

    public static String output(String password, int p_strength) {
        return switch (p_strength) {
            default -> "Invalid password.";
            case 1 -> String.format("The password '%s' is a very weak password.", password);
            case 2 -> String.format("The password '%s' is a weak password.", password);
            case 3 -> String.format("The password '%s' is a strong password.", password);
            case 4 -> String.format("The password '%s' is a very strong password.", password);
        };
    }
}





