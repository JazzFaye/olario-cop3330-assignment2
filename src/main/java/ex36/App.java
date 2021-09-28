/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex36;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> numbers = GetNumber();
        System.out.println(DisplayNumbers(numbers));
        System.out.println(GetAverage(numbers));
        System.out.println(GetMinimum(numbers));
        System.out.println(GetMaxmimum(numbers));
        System.out.println(GetSt_dev(numbers));
    }

    public static List<String> GetNumber() {
        var numbers = new ArrayList<String>();
        System.out.print("Enter a number: ");
        String get = sc.nextLine();
        while (!get.equalsIgnoreCase("done")) {
                numbers.add(get);
                System.out.printf("Enter a number: ");
                get = sc.nextLine();
            }
        return numbers;
        }
    public static String DisplayNumbers(List<String> numbers) {

        String num = "Numbers: ";
        for (int i = 0; i < numbers.size(); i++){

            try {
                Integer.parseInt(numbers.get(i));
                num += numbers.get(i);
                if (i == numbers.size()-1) {
                    num += ("");
                } else {
                    num += (", ");
                }
            } catch (NumberFormatException exception) {
                numbers.remove(numbers.get(i));
                i--;
            }
        }
        return num;
    }

    public static double GetAverage(List<String> numbers){
        double sum = 0;
        int i;
        System.out.printf("The average is: ");
        for(i = 0; i < numbers.size(); i++){
            sum+= Integer.parseInt(numbers.get(i));
        }
        return sum / numbers.size();
    }

    public static int GetMinimum(List<String> MIN){
        int min = Integer.parseInt(MIN.get(0));
        System.out.print("The Minimum is: ");
        for(int i = 0; i < MIN.size(); i++){
            min = Math.min(Integer.parseInt(MIN.get(0)), Integer.parseInt(MIN.get(i)));
        }
        return min;
    }
    public static int GetMaxmimum(List<String> MAX){
        int max = Integer.parseInt(MAX.get(0));
        System.out.print("The Maximum is: ");
        for(int i = 0; i < MAX.size(); i++){
            max = Math.max((Integer.parseInt(MAX.get(0))), Integer.parseInt(MAX.get(i)));
        }
        return max;
    }
    public static String GetSt_dev(List<String> St_dev){
        DecimalFormat format = new DecimalFormat("#.##");
        double sum = 0.0, temp = 0.0, result;
        String answer = "The Standard deviation is: ";
        for(int i = 0; i < St_dev.size(); i++) {
            sum += Integer.parseInt(St_dev.get(i));
        }
        double average = sum / St_dev.size();

        for(int i = 0; i < St_dev.size(); i++) {
            temp += Math.pow(Integer.parseInt(St_dev.get(i)) - average, 2);
        }
        result  = Math.sqrt(temp/St_dev.size());
        answer = answer + format.format(result);

        return answer;
    }

}




