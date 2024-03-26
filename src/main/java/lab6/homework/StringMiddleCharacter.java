package main.java.lab6.homework;

import java.util.Scanner;

public class StringMiddleCharacter {
    public static void main(String[] args) {
        /*
         3. Write a Java method to display the middle character of a string.
            Note:
            a) If the length of the string is even there will be two middle characters.
            b) If the length of the string is odd there will be one middle character.
            Write a Java method to count all words in a string.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string1 = scanner.nextLine();
        String middleChar = findStringMiddleChar(string1);

        System.out.println("The middle char in the string is: " + middleChar);

        System.out.println("Enter a multiple-words string:");
        String complexString = scanner.nextLine();
        int numOfWords = countWordsInString(complexString);
        if(numOfWords == 1){
            System.out.println("The string contains " + numOfWords + " word.");
        }
        else if(numOfWords > 1){
            System.out.println("The string contains " + numOfWords + " words.");
        }
    }

    static String findStringMiddleChar(String stringInMethod){
        if(stringInMethod.length() % 2 == 0){
            System.out.println("The string is even.");
            return stringInMethod.substring((stringInMethod.length() / 2) - 1, (stringInMethod.length() / 2) + 1);
        }
        System.out.println("The string is odd.");
        return String.valueOf(stringInMethod.charAt(stringInMethod.length() / 2));
    }

    static int countWordsInString(String longString){
        String[] wordsArr = longString.split(" ");
        return wordsArr.length;
    }
}
