package main.java.lab5.homework;

import java.util.Scanner;

public class FixedSize2DMatrix {
    public static void main(String[] args) {
        /*
        2. Print elements of a given 2-d matrix with 4 rows and 3 columns
         */

        Scanner scanner = new Scanner(System.in);
        double[][] twoDimArr = new double[4][3];

        System.out.println("Enter the 2-D array elements(numbers): ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                twoDimArr[i][j] = scanner.nextDouble();
            }
        }

        //Printing all 2-D array elements
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(twoDimArr[i][j] + " ");
                if(j == 2){
                    System.out.println();
                }
            }
        }
    }
}
