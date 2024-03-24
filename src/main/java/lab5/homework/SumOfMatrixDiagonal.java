package main.java.lab5.homework;

import java.util.Scanner;

public class SumOfMatrixDiagonal {
    public static void main(String[] args) {
        double[][] matrix = new double[4][4];
        double firstDiagonalSum = 0;
        double secondDiagonalSum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numeric elements to fill the matrix: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j)
                    firstDiagonalSum += matrix[i][j];
                if ((i + j) == 3)
                    secondDiagonalSum += matrix[i][j];
            }
        }

        System.out.println("The sum of the first matrix diagonal is: " + firstDiagonalSum);
        System.out.println("The sum of the second matrix diagonal is: " + secondDiagonalSum);
    }
}
