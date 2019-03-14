package com.LickingHeights;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Method 1
        printGreetings();
            System.out.println("User! How are you doing today?");
        //Method 2
        printReply();
            System.out.println("");

    }
    public static void printGreetings(String noun){
        System.out.println("Hello " + noun);
    }
    public static void printReply(String noun){
        System.out.println("That's great! I am glad you are having a good day.");
    }
}
