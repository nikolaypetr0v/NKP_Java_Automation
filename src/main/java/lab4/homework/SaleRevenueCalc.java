package main.java.lab4.homework;

import java.util.Scanner;

public class SaleRevenueCalc {
    public static void main(String[] args) {
        /*
        3. Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product
input by the user. The discount rate is 15% for the quantity purchased between 100 and 120 units, and 20% for
the quantity purchased greater than 120 units. If the quantity purchased is less than 100 units, the discount rate
is 0%. See the example output as shown below:

Еnter unit price: 25
Enter quantity: 110
The revenue from sale: 2337.5$
Discount: 412.5$(15.0%)
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter product unit price: ");
        double unitPrice = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter the quantity of the product: ");
        double productQuantity = Double.parseDouble(scanner.nextLine());

        char currency = '$';
        double revenue = unitPrice * productQuantity;
        double discountRate = 0;

        if(100 <= productQuantity && productQuantity <= 120){
            discountRate = 0.15;
        } else if (productQuantity > 120) {
            discountRate = 0.20;
        }
        else if(productQuantity < 100){
            discountRate = 0;
        }

        double discount = revenue * discountRate;
        revenue = revenue - discount;
        double discountPercent = discountRate * 100;

        System.out.println("The revenue from a sale is: " + revenue + currency);
        System.out.println("The discount is: " + discount + currency + "(" + discountPercent + "%)");
    }
}
