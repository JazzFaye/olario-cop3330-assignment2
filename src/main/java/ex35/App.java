/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex35;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();

    public static void main(String[] args) {
        List<String> names = contestants();
        System.out.println(Winner(names));
    }

    public static List<String> contestants(){
        var person = new ArrayList<String>();
        System.out.printf("Enter a name: ");
        String name = sc.nextLine();
        while (!name.isEmpty()){
            person.add(name);
            System.out.printf("Enter a name: ");
            name = sc.nextLine();
        }
        return person;
    }
    public static String Winner(List<String> names){
       return String.format("The winner is... %s.", names.get(random.nextInt(names.size())));
    }

}
