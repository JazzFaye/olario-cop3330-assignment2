/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<String> Emp_name = new ArrayList<>
                ((Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin")));

        String print = Emp_list(Emp_name);
        System.out.println(print);
        System.out.print("List the name you want to delete: ");
        String remove = sc.nextLine();

        Emp_name.removeIf(x -> (x.equals(remove)));
        print = Emp_list(Emp_name);
        System.out.println(print);


    }
    public static String Emp_list(List<String> Emp_name) {
        int count = Emp_name.size();
        String list = ("\nThere are " + count + " employees:\n");
        for (String s : Emp_name) {
            list = list + s + "\n";
        }
        return list;
    }
}



