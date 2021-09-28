/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex27;

import java.util.Scanner;

public class App {
    private static final Scanner input = new Scanner(System.in);
    private static String first_name, last_name, ZIP, Emp_ID;

    public static void main(String[] args) {

        userString();
        String result = validateInput(first_name, last_name, ZIP, Emp_ID);
        System.out.println(result);
    }

    public static void userString() {
        System.out.print("Enter the first name: ");
        first_name = input.nextLine();
        System.out.print("Enter the last name: ");
        last_name = input.nextLine();
        System.out.print("Enter the ZIP code: ");
        ZIP = input.nextLine();
        System.out.print("Enter the employee ID: ");
        Emp_ID = input.nextLine();
    }
    public static boolean validate_firstname(String firstName) {
        return (firstName.length() >= 2);
    }
    public static boolean validate_lastname(String firstName) {
        return (firstName.length() >= 2);
    }
    public static boolean validate_ZIP(String ZIP) {
        return (ZIP.matches("[0-9]{5}"));
    }
    public static boolean validate_ID(String employeeID) {
        return (employeeID.matches("[a-zA-Z]{2}[-][0-9]{4}"));
    }
    public static String validateInput(String firstName, String lastName, String ZIP, String ID) {
            String check = "";
            if (firstName.isEmpty()) {
                check += String.format("The first name must be at least 2 characters long.\n");
                check += String.format("The first name must be filled in.\n");
            } else if (!validate_firstname(firstName)) {
                check += String.format("The first name must be at least 2 characters long.\n");
            }
            if (lastName.isEmpty()) {
                check += String.format("The last name must be at least 2 characters long.\n");
                check += String.format("The last name must be filled in.\n");
            } else if (!validate_lastname(lastName)) {
                check += String.format("The last name must be at least 2 characters long.\n");
            }
            if (!validate_ZIP(ZIP)) {
                check += String.format("The zipcode must be 5 digits long.\n");
            }
            if (!validate_ID(ID)) {
                check += String.format("The employee ID must be in the format of AA-1234.\n");
            }
            if (check.isEmpty()) {
                return "There were no errors found.";
            }
            return check;
        }
    }

