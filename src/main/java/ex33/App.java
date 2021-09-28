/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex33;

import java.util.*;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void main(String[] args) {
        input_user();
        Magic8Ball();
    }
    public static void input_user(){
        System.out.println("What is your question? ");
        String input = sc.nextLine();
    }
    public static String Magic8Ball(){
        String input;
        String[] answers = {"Yes.", "No.", "Maybe.", "Ask again later."};
        int random_ans = rand.nextInt(4);
        System.out.print(answers[random_ans]);
        return answers[random_ans];
    }
}
