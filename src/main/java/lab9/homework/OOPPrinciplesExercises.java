package main.java.lab9.homework;

import java.util.Arrays;
public class OOPPrinciplesExercises {
    public static void main(String[] args) {
        Person person = new Person("Dimitar", "Male", "orthodox", "Bulgarian", "Manager", "Bulgarian","8103245060","Bulgaria");
        Italian italian = new Italian("Francesco", "Male", "catholic", "Developer", "7605108945", "Italy");
        Bulgarian bulgarian = new Bulgarian("Ivanka", "Female", "orthodox", "unemployed", "9112239583","Bulgaria");
        American american = new American("John", "Male", "catholic", "Boss", "6811125584","USA");
        Child child = new Child("Ivancho", "Male", "orthodox", "Bulgarian", "Bulgaria", "9912239583", "Bulgaria");

        //Common actions
        executePersonActions(person);
        executePersonActions(italian);
        executePersonActions(bulgarian);
        executePersonActions(american);
        executePersonActions(child);

        //Individual actions
        italian.makePizza(Arrays.asList("Cheese", "Mushrooms", "Olives"));
        bulgarian.danceHoro();
        american.celebrateThanksgiving();
        child.playWithToys("Ball");
    }

    private static void executePersonActions(Person person) {
        System.out.println("Execute actions for class " + person.getClass().getSimpleName());
        person.celebrateEaster();
        person.sayHello();
        System.out.println("The person can take loan: " + person.canTakeLoan());
        System.out.println("The person is adult: " + person.isAdult());
    }
}
