package main.java.lab4.homework;

import java.util.Scanner;

public class EligibleToWorkPerson {
    public static void main(String[] args) {
        /*
        2. Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible
to work. A person who is eligible to work must be older than or equal to 16 years old.

Example:
Enter your age: 16
You are eligible to work.
         */

        System.out.println("Please enter your age: ");
        Scanner scanner = new Scanner(System.in);
        double userAge = Double.parseDouble(scanner.nextLine());

        if(userAge >= 16){
            System.out.println("You are eligible to work.");
        }
        else System.out.println("Sorry, you are under 16 and not eligible to work!");
    }
}
