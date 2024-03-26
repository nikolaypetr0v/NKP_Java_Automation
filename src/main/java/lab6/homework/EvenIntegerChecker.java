package main.java.lab6.homework;

import java.util.Scanner;

public class EvenIntegerChecker {
    public static void main(String[] args) {
        /*
        4. Write a method named isEven that accepts an int argument. The method should return true if the
argument is even, or false otherwise.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int intNumber = Math.abs(scanner.nextInt());
        boolean isIntEven = isEven(intNumber);

        if (isIntEven){
                System.out.println("The entered integer is even.");
        }
        else
            System.out.println("The entered integer is odd.");
    }

    static boolean isEven(int methodInt){
        if(methodInt % 2 == 0){
            return true;
        }
        return false;
    }
}
