/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

package ex30;


public class App {
    public static void main(String[] args) {
        MultiplicationTable();
    }
    public static void MultiplicationTable(){
        for (int i = 1; i <= 12; i++){
            for (int j = 1; j <= 12; j++){
                System.out.print(Output(i,j));
            }
            System.out.println();
        }
    }
    public static String Output(int i, int j){
        return String.format("%5d",i * j);
    }
}
