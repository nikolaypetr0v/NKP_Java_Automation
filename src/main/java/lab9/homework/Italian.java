package main.java.lab9.homework;

import java.util.List;
public class Italian extends Person{
    public Italian(String name, String sex, String religion, String job, String EGN, String countryOfResidence) {
        super(name, sex, religion, "Italian", job, "Italian", EGN, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao a tutti!");
    }

    public void makePizza(List<String> ingredients) {
        System.out.println("I am making a pizza with the following ingredients: " + ingredients);
    }
}
