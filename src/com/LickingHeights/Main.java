package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //initialize
        String userName;

        //code
        System.out.println("What is your name?");
        userName = keyboard.nextLine();

        //Method 1
        printGreetings("World");

        //Method 2
        helloName("" + userName);

        //Method 3
        int a = 15;
        int b = 17;
        System.out.println(a*b);

        //Method 4
        int c = 1500;
        int d = 5;
        System.out.println(c/d);
    }
    public static void printGreetings(String noun){
        System.out.println("Hello " + noun);
    }
    public static void helloName(String userName){
        System.out.println("Hello " + userName);
    }
    public static int multiply(int firstNumber, int secondNumber){
        int answer = firstNumber * secondNumber;
        return answer;
    }
    public static int divide(int thirdNumber, int fourthNumber){
        int answer2 = thirdNumber / fourthNumber;
        return answer2 * 2;
    }
}
