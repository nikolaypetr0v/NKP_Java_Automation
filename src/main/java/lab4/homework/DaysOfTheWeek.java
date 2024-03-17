package main.java.lab4.homework;

import java.util.Scanner;

public class DaysOfTheWeek {
    public static void main(String[] args) {
        /*
        1. Write a program to print the days of the week based on the user digit 1-7 input. The message should be “The
[user input digit]-st/nd/rd/th day of the week is [the day of the week]” Hint: Use switch-case.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day of the week(digit in the range 1-7): ");
        int dayOfWeek = Integer.parseInt(scanner.nextLine());

        switch (dayOfWeek){
            case 1:
                System.out.println("The " + dayOfWeek + "-st day of the week is Monday.");
                break;
            case 2:
                System.out.println("The " + dayOfWeek + "-nd day of the week is Tuesday.");
                break;
            case 3:
                System.out.println("The " + dayOfWeek + "-rd day of the week is Wednesday.");
                break;
            case 4:
                System.out.println("The " + dayOfWeek + "-th day of the week is Thursday.");
                break;
            case 5:
                System.out.println("The " + dayOfWeek + "-th day of the week is Friday.");
                break;
            case 6:
                System.out.println("The " + dayOfWeek + "-th day of the week is Saturday.");
                break;
            case 7:
                System.out.println("The " + dayOfWeek + "-th day of the week is Sunday.");
                break;
            default:
                System.out.println("Invalid digit input! Please enter a digit between 1-7.");
        }
    }
}
