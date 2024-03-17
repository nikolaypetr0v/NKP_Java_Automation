package main.java;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class ArithmeticOperations {
    public static void TestInput(){
        String input = "100\n" +
                "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());

        //num2 = num1;
        int result = num1 + num1;
        result /= num1;

        System.out.println("The result of the operation is: " + result);
    }
}
