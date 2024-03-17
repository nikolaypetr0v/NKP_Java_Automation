package main.java.lab4.homework;

import java.util.Scanner;

public class VacationAdviser {
    public static void main(String[] args) {
        /*
        5. Write a program which advices the user where to go to a vacation based on the type of the vacation and the
budget. There should be two options – Beach, Mountain. If the user put a different value then the program
should print a message that there is no information about this type of vacation. Budgets are considered per
day per person. If the budget per day for Beach type vacation is smaller than 50 then the program should
advise Bulgaria as a destination, otherwise Outside Bulgaria. If the budget per day for Mountain type vacation
is smaller than 30 then the program should advise Bulgaria as a destination, otherwise Outside Bulgaria.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter vacation type: ");
        String vacationType = scanner.nextLine();

        if(vacationType.equals("Beach") || vacationType.equals("Mountain")){
            System.out.println("Enter number of days: ");
            int numOfDays = scanner.nextInt();

            System.out.println("Enter number of people: ");
            int numOfPeople = scanner.nextInt();

            System.out.println("Enter vacation budget: ");
            double vacationBudget = scanner.nextDouble();

            double dailyBudget = vacationBudget / (numOfDays * numOfPeople);

            switch (vacationType){
                case "Beach":
                    System.out.println("You chose a vacation on the beach!");
                    if(dailyBudget < 50){
                        System.out.println("Your best choice for beach destination is Bulgaria!");
                    }else System.out.println("You better look for a beach destination outside Bulgaria!");
                    break;
                case "Mountain":
                    System.out.println("You chose a vacation in the mountain!");
                    if(dailyBudget < 30){
                        System.out.println("Your best choice for mountain destination is Bulgaria!");
                    }else System.out.println("You better look for a destination outside Bulgaria!");
                    break;
                default:
                    System.out.println("This is a switch default message(not really useful).");
            }
        }
        System.out.println("There is no information about this type of vacation!");
    }
}
