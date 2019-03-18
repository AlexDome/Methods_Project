package com.LickingHeights;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //declare
        Scanner keyboard;
            keyboard = new Scanner(System.in);
    //initialize
        String noun2;
            noun2 = ("World");
                String userName;
                    int firstNumber, secondNumber,
                        thirdNumber, fourthNumber;
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
        System.out.println("Thank you very much");
    //Methods Print
        //Method 1
        printGreetings("World");
        //Method 2
        helloName("" + userName);
        //Method 3
        System.out.println("Im going to multiply your First and Second Numbers");
            System.out.println(firstNumber * secondNumber);
        //Method 4
        System.out.println("Now im going to divide your Third and Fourth Numbers");
            System.out.println(thirdNumber / fourthNumber);
        //Method 5
        System.out.println("Finally im going to find the maximum of your First and Third Numbers");
            System.out.println(firstNumber ^ ((firstNumber ^ thirdNumber)& -(firstNumber << thirdNumber)));
        //Method 6
        change("" + noun2);
    //Methods Code
    }
    private static void printGreetings(String noun) {
        System.out.println("Hello " + noun);
    }
    private static void helloName(String userName) {
        System.out.println("Hello " + userName);
    }
    public static int multiply(int firstNumber, int secondNumber) {
        int answer = firstNumber * secondNumber;
        return answer;
    }
    public static int divide(int thirdNumber, int fourthNumber) {
        int answer2 = thirdNumber / fourthNumber;
        return answer2 * 2;
    }
    public static int max(int firstNumber, int thirdNumber){
        return firstNumber ^ ((firstNumber ^ thirdNumber)& -(firstNumber << thirdNumber));
    }
    private static void change(String noun2) {
        System.out.println(noun2 + " Hello");
    }
}

