package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //declare
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        //Method 1
        printGreetings("World");
            System.out.println("Hello " );

    }
    public static void printGreetings(String noun){
        System.out.println("Hello " + noun);
    }
}
