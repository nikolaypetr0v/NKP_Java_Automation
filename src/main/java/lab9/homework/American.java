package main.java.lab9.homework;

public class American extends Person{
    public American(String name, String sex, String religion, String job, String EGN, String countryOfResidence) {
        super(name, sex, religion, "English", job, "American", EGN, countryOfResidence);
    }

    public void celebrateThanksgiving() {
        System.out.println("I am celebrating Thanksgiving on the fourth Tuesday of November.");
    }
}
