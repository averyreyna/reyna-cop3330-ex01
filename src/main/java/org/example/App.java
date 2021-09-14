/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        // asks the user for their name
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name? ");
        String inputName = input.nextLine();

        // string concatonation seperate from output on next line
        String nameOutput = "Hello, " + inputName + ", nice to meet you!";

        System.out.println(nameOutput);
    }
}
