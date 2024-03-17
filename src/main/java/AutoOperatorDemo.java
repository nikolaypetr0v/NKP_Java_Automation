package main.java;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AutoOperatorDemo {
    public static void TestInput(){
        String input = "100\n" +
                "20\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }
    public static void main(String[] args) {
        TestInput();
        Scanner scanner = new Scanner(System.in);
        //Input original values
        int result;
        int num1 = 1;
        int num2 = 2;

        //Operations done
        //Increment
        result = num1 + num2;
        System.out.println("Result 1: " + result);

        num1++;
        int result2 = num1 + num2;
        System.out.println("Result 2: " + result2);

        int result3 = ++num1 + num2;
        System.out.println("Result 3: " + result3);
        //Output
    }
}
