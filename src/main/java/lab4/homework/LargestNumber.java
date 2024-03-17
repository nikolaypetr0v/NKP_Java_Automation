package main.java.lab4.homework;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        /*
        4. Find the largest number from a given array and print it in a console. Hint: use for loop
         */

        Scanner scanner = new Scanner(System.in);
        int numArr[] = {3,7,12,0,6,1,28};
        int largestNum = numArr[0];

        for (int i = 1; i < numArr.length; i++) {
            if(numArr[i] > largestNum){
                largestNum = numArr[i];
            }
        }

        System.out.println("The largest number in the array is: " + largestNum);
    }
}
