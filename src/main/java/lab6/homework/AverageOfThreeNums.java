package main.java.lab6.homework;

import java.util.Scanner;

public class AverageOfThreeNums {
    public static void main(String[] args) {
        /*
        2. Write a Java method to compute the average of three numbers.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();
        double thirdNumber = scanner.nextDouble();

        System.out.println("The average of the three numbers is: " + computeAverageOfThreeNums(firstNumber, secondNumber, thirdNumber));
    }

    static double computeAverageOfThreeNums(double firstNum, double secondNum, double thirdNum){
        return (firstNum + secondNum + thirdNum) / 3;
    }
}
