package main.java.lab5.homework;

import java.util.Scanner;

public class SumOfArrayElements {
    public static void main(String[] args) {
        /*
        1. Write program to print sum of a given array elements
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length for the array: ");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        int sum = 0;

        System.out.println("Enter integer elements to fill the array: ");

        //Filling the array with integers.
        for (int i = 0; i < arrLength; i++) {
            arr[i] = scanner.nextInt();
        }

        //Calculating the sum of the array elements
        for (int i = 0; i < arrLength; i++) {
            sum = sum + arr[i];
        }

        System.out.println("The sum of all array elements is: " + sum);
    }
}
