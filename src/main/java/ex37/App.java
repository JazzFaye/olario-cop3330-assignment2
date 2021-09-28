/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex37;

import java.util.*;

public class App {
    private static final Scanner sc = new Scanner(System.in);
    private static final Random random = new Random();
    private static final String Letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final String Numbers = "0123456789";
    private static final String Special_Char = "!@#$%&*?<>[]{}+-_=~/,.()";
    private static int length, special_char, numbers;


    public static void main(String[] args) {
       user_input();
       String output = GeneratePassword(length,special_char,numbers);
       System.out.printf("Your password is %s",output);
    }
    public static void user_input(){
        System.out.print("What's the minimum length? ");
        length = Integer.parseInt(sc.nextLine());
        System.out.print("How many special characters? ");
        special_char = Integer.parseInt(sc.nextLine());
        System.out.print("How many numbers? ");
        numbers = Integer.parseInt(sc.nextLine());
    }

    public static String GeneratePassword(int length, int special, int nums) {
        ArrayList<Character> chars = new ArrayList<>();
        //loop for special characters
        for(int i=0; i<special; i++){
            chars.add(Special_Char.charAt(random.nextInt(Special_Char.length())));
        }
        //loop for numbers
        for(int i=0; i<nums; i++){
            chars.add(Numbers.charAt(random.nextInt(Numbers.length())));
        }
        //loop for letters
        for(int i=chars.size()-1; i<length; i++){
            chars.add(Letters.charAt(random.nextInt(Letters.length())));
        }
        Collections.shuffle(chars);
        String result = "";
        //Loop to convert every character in a string to an array
        for(Character s : chars)
        {
            result = result + s;
        }
        return result;
    }
}