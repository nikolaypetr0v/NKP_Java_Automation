package main.java.lab9.homework;

public class Child extends Person{
    Child(String name, String sex, String religion, String spokenLanguage, String nationality, String EGN, String countryOfResidence) {
        super(name, sex, religion, spokenLanguage, "student", nationality, EGN, countryOfResidence);
    }

    @Override
    public boolean isAdult() {
        System.out.println("The child is not an adult.");
        return false;
    }

    @Override
    public boolean canTakeLoan() {
        System.out.println("The child cannot take a loan.");
        return false;
    }

    @Override
    public void setJob(String job) {
        throw new IllegalArgumentException("The child cannot have a job.");
    }

    public void playWithToys(String toy) {
        System.out.println("I am playing with a " + toy + ".");
    }
}
