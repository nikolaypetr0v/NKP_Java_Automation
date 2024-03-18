package main.java.lab5.homework;

import java.util.Scanner;

public class ArrayBiggestElement {
    public static void main(String[] args) {
        /*
        4. Find the biggest element of an array and print it in the console
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length for the array: ");
        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];
        int biggestElem;

        System.out.println("Enter integer elements to fill the array: ");

        //Filling the array with integers.
        int i;
        for (i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        biggestElem = arr[0];
        for (i = 1; i < arr.length; i++) {
            if(arr[i] > biggestElem){
                biggestElem = arr[i];
            }
        }

        System.out.println("The biggest array element is: " + biggestElem);
    }
}
