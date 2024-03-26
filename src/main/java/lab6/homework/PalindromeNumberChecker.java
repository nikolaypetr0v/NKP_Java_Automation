package main.java.lab6.homework;

import java.util.Scanner;

public class PalindromeNumberChecker {
    public static void main(String[] args) {
        /*
        5. A takes as input a non-negative integer and returns true if the number is a palindrome;
        Non-negative integer is called a palindrome if it reads forward and backward in the same way. For
        example, the numbers 5, 121, 3443, and 123454321 are palindromes.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer:");
        int intNumber = Math.abs(scanner.nextInt());
        boolean isPalindrome = isNumPalindrome(intNumber);

        if(isPalindrome){
            System.out.println("The integer is a palindrome.");
        }
        else
            System.out.println("The integer is not a palindrome.");
    }

    static boolean isNumPalindrome(int nonNegativeInt){
        String intAsAString = String.valueOf(nonNegativeInt);
        String reversedInt = "";

        for (int i = intAsAString.length() - 1; i >= 0 ; i--) {
            reversedInt = reversedInt + intAsAString.charAt(i);
        }

        return intAsAString.equals(reversedInt);
    }
}
