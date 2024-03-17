package main.java.lab4.examples;

public class DoWhileLoopExample2 {
    public static void main(String[] args) {
        int arr[] = {2,11,45,9};

        int i = 0;
        do{
            System.out.println("arr[i]: " + arr[i]);
            i++;
        }while (i<4);
    }
}
