/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex32;

import java.util.Scanner;
import java.util.Random;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();
    private static int num,counter = 0;

    public static void main(String[] args) {
        System.out.println("Let's play a Guessing game!");
        Select();
    }

    public static void Select() {
        System.out.print("\nEnter the level of difficulty (1,2,3): ");
        while (true) {
            String select = sc.nextLine();
            try {
                int mode = Integer.parseInt(select);
                if (mode == 1) {
                    num = rand.nextInt(11);
                    Game();
                } else if (mode == 2) {
                    num = rand.nextInt(101);
                    Game();
                } else if (mode == 3) {
                    num = rand.nextInt(1001);
                    Game();
                }
            } catch (Exception e) {
                System.out.print("Invalid input. Please enter only (1,2,3).");
            }
        }
    }

    public static void Game() {
        int user;
        System.out.print("I have my number. What's your guess? ");

        while (true) {
            String answer = sc.nextLine();
            counter++;
            try {
                user = Integer.parseInt(answer);
                if(user == 0){
                    System.out.print("Cannot be zero. Try again.");
                }else if (user < num) {
                    System.out.print("Too low. Guess again. ");
                } else if (user > num) {
                    System.out.print("Too high. Guess again. ");
                } else {
                    System.out.printf("You got it in %s guesses!\n", counter);
                    PlayAgain();
                }
            } catch (NumberFormatException e) {
                System.out.println("numbers only.");
            }

        }
    }
    public static void PlayAgain() {
        System.out.print("Do you wish to play again (Y/N)?");
        String play = sc.nextLine();
        if (play.equalsIgnoreCase("y")) {
            Select();
        } else if (play.equalsIgnoreCase("n")) {
            System.out.print("Thanks for playing!");
            System.exit(-1);
        }
    }
}

