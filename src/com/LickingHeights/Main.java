package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //initialize
        String userName;
        int firstNumber;
        int secondNumber;
        int thirdNumber;
        int fourthNumber;

        //code
        System.out.println("What is your name?");
        userName = keyboard.nextLine();
        System.out.println("Give me a number please");
        firstNumber = keyboard.nextInt();
        System.out.println("Another please");
        secondNumber = keyboard.nextInt();
        System.out.println("Can I have another number please");
        thirdNumber = keyboard.nextInt();
        System.out.println("One last number please");
        fourthNumber = keyboard.nextInt();

        //Method 1
        printGreetings("World");

        //Method 2
        helloName("" + userName);

        //Method 3
        System.out.println(firstNumber*secondNumber);

        //Method 4
        System.out.println(thirdNumber/secondNumber);
    }
    private static void printGreetings(String noun){
        System.out.println("Hello " + noun);
    }
    private static void helloName(String userName){
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
