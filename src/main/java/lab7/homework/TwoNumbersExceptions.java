package main.java.lab7.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoNumbersExceptions {
    public static void main(String[] args) {
        /*
        1. Write a program which reads two
        numbers from the console and divide
        them. Handle the following exceptions
        – wrong input values / division by 0
         */

        double number1 = 0;
        double number2 = 0;
        double result = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");

        try {
            number1 = scanner.nextDouble();
            number2 = scanner.nextDouble();

            result = divideTwoNumbers(number1, number2);
            System.out.println(number1 + " divided by " + number2 + " equals " + result);
        }
        catch (InputMismatchException ime){
            System.out.println("Input mismatch exception! You entered wrong input values!");
        }
        catch (ArithmeticException ae){
            System.out.println("Arithmetic exception! You cannot divide a number by zero!");
        }
        catch (Exception e) {
            System.out.println("Generic exception!");
        }
        finally {
            scanner.close();
        }
    }

    public static double divideTwoNumbers(double divisible, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException();
        }
        return divisible / divisor;
    }
}
