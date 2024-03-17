package main.java.lab4.homework;

public class NumberListIteration {
    public static void main(String[] args) {
        /*
        6. Given a list iterate it and display numbers which are divisible by 5 and if you find number greater than 150 stop
the loop iteration list1 = [12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200]
         */

        int arrList1[] = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        for (int i = 0; i < arrList1.length; i++) {
            if(arrList1[i] > 150){
                break;
            }
            if(arrList1[i] % 5 == 0){
                System.out.println("Number dividable by 5: " + arrList1[i]);
            }
        }
    }
}
