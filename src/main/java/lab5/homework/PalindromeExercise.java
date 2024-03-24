package main.java.lab5.homework;

import java.util.Scanner;

public class PalindromeExercise {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a palindrome:");
        String palindrome = scanner.nextLine();

        boolean isPalindrome = true;
        int leftHalf = 0;
        int rightHalf = palindrome.length() - 1;
        while (leftHalf < rightHalf) {
            if (palindrome.charAt(leftHalf) != palindrome.charAt(rightHalf)) {
                isPalindrome = false;
                break;
            }
            leftHalf++;
            rightHalf--;
        }

        if(isPalindrome){
            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");
        }
    }
}
