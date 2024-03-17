package main.java;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class Playground {
    public static void TestInput(){
        String input = "Georgi\n";

        System.setIn(new ByteArrayInputStream(input.getBytes()));
    }

    public static void main(String[] args) {
        TestInput();

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        System.out.println("Hello " + input);
    }
}
