package main.java.lab4.homework;

public class ListReversing {
    public static void main(String[] args) {
        /*
        7. Reverse the following list using for loop list1 = [10, 20, 30, 40, 50]
         */

        int[] arrList1 = {10,20,30,40,50};
        int[] reversedList = new int[5];
        int j = arrList1.length - 1;

        for (int i = 0; i < reversedList.length; i++) {
                reversedList[i] = arrList1[j];
                j--;
        }

        System.out.println("The reversed list elements are: ");
        for (int k = 0; k < reversedList.length; k++) {
            System.out.print(reversedList[k] + " ");
        }
    }
}
