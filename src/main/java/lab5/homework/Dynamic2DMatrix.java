package main.java.lab5.homework;

import java.util.Scanner;

public class Dynamic2DMatrix {
    public static void main(String[] args) {
        /*
        3. Print elements of a given 2-d matrix with dynamic rows and columns taken from user input
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2-D array number of columns: ");
        int rows = scanner.nextInt();
        System.out.println("Enter 2-D array number of rows: ");
        int columns = scanner.nextInt();

        double[][] twoDimArr = new double[rows][columns];

        System.out.println("Enter the 2-D array elements(numbers): ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                twoDimArr[i][j] = scanner.nextDouble();
            }
        }

        //Printing all 2-D array elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDimArr[i][j] + " ");
                if(j == columns - 1){
                    System.out.println();
                }
            }
        }
    }
}
