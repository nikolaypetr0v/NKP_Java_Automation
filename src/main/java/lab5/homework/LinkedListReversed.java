package main.java.lab5.homework;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListReversed {
    public static void main(String[] args) {
        /*
        5. Reverse the order of the elements in a LinkedList using algorithm
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of the linked list: ");
        int listSize = scanner.nextInt();

        LinkedList<Double> realNumbers = new LinkedList<Double>();
        //Filling the realNumbers linked list with elements.
        System.out.println("Enter the linked list elements(double values).");
        for (int i = 0; i < listSize; i++) {
            realNumbers.add(scanner.nextDouble());
        }

        LinkedList<Double> reversedList = new LinkedList<Double>();
        //Creating a reversed realNumbers linked list.
        for (int j = realNumbers.size() - 1; j >= 0; j--) {
            reversedList.add(realNumbers.get(j));
        }

        System.out.println("Printing the reversed linked list elements...");
        for (Double reversedListElem : reversedList) {
            System.out.println(reversedListElem);
        }
    }
}
