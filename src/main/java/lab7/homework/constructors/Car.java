package main.java.lab7.homework.constructors;

public class Car {
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

    private String name;
    private String color;
    private int releaseYear;
    private int horsepower;
    boolean isSecondhand;

    Car(String name, String color, int releaseYear, int horsepower, boolean isSecondhand){
        this.name = name;
        this.color = color;
        this.releaseYear = releaseYear;
        this.horsepower = horsepower;
        this.isSecondhand = isSecondhand;
    }

    Car(String name, String color, boolean isSecondhand){
        this(name, color, -1, -1, isSecondhand);
    }

    Car(String name, String color, int releaseYear, int horsepower){
        this(name, color, releaseYear, horsepower, false);
    }

    Car(String name, int releaseYear, int horsepower, boolean isSecondhand){
        this(name, "N/A", releaseYear, horsepower, isSecondhand);
    }

    Car(){

    }

    @Override
    public String toString() {
        return "Car{" +
                "name = '" + name + '\'' +
                ", color = '" + color + '\'' +
                ", releaseYear = " + releaseYear +
                ", horsePower = " + horsepower +
                ", secondHand = " + isSecondhand +
                '}';
    }
}
