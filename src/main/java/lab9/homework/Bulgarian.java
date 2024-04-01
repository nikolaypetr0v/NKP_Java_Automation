package main.java.lab9.homework;

public class Bulgarian extends Person{

    public Bulgarian(String name, String sex, String religion, String job, String EGN, String countryOfResidence) {
        super(name, sex, religion, "Bulgarian", job, "Bulgarian", EGN, countryOfResidence);
    }

    @Override
    public void sayHello() {
        System.out.println("Здравейте на всички!");
    }

    public void danceHoro() {
        System.out.println("Танцувам хоро!");
    }
}
