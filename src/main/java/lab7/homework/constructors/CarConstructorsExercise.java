package main.java.lab7.homework.constructors;

public class CarConstructorsExercise {
    public static void main(String[] args) {
        /*
            Create a Car class which has 5 elements name / color / release year / horsepower / second hand tick.
            Name and color must be from string type / release year and horsepower to be integers / second hand is boolean.
            Requirements:
            • If name or color is not specified set N/A as value
            • If release year or horsepower is not specified set -1 as value
            • If second hand is not specified set false as value
            Create a constructors of Car class for the following cases:
            • Create a car by provided name / color / release year / horsepower / second hand
            • Create a car by provided name / color / second hand
            • Create a car by provided name / color / release year / horsepower
            • Create a car by provided name / release year / horsepower / second hand
            • Create a car by provided nothing
            Create Car object using each constructor
        */

        Car car1 = new Car("Fiat", "Silver", 2010, 120, true);
        Car car2 = new Car("BMW", "Blue", true);
        Car car3 = new Car("Opel", "Pink", 2013, 210);
        Car car4 = new Car("Peugeot", 2023, 130, false);
        Car car5 = new Car();

        Car[] cars = {car1, car2, car3, car4, car5};
        for (Car car : cars) {
            System.out.println(car);
        }
    }
}
