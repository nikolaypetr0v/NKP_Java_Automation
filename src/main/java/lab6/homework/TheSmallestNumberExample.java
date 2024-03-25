package main.java.lab6.homework;

import java.util.Scanner;

public class TheSmallestNumberExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double[] threeNumArray = new double[3];

        for (int i = 0; i < threeNumArray.length; i++) {
            threeNumArray[i] = scanner.nextDouble();
        }

        System.out.println("The smallest number is: " + findTheSmallestNumber(threeNumArray));
    }

    static double findTheSmallestNumber(double[] numArray){
        double smallestNumber = numArray[0];
        for (int i = 1; i < numArray.length; i++) {
            if(numArray[i] < numArray[i - 1]){
                smallestNumber = numArray[i];
            }
        }
        return smallestNumber;
    }
}
