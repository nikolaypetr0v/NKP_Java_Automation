package main.java.lab9.homework;

import java.time.LocalDate;

public class Person {
    /*
    Create class Person which has the following attributes: name, sex, religion, language spoken, job, nationality,
    EGN, date of birth, age, country of residence.
    The date of birth attribute and age are composed during the creation of an object based on the EGN.
    EGN consists of 10 digits. If provided value for EGN or sex are not correct throw exception.
    If wrong sex is provided program must continue its normal execution with printing relevant message.
    Only job and country of residence could change their values. All other attributes can`t be changes once they are set.
    The Person class should have methods – sayHello(), celebrateEaster(), isAdult(), canTakeLoan() with the relevant parameters if any.
    sayHello() should print Hello based on concrete person spoken language, default is in English.
    celebrateEaster should print if the concrete person celebrates Easter based on their religion.
    isAdult should take in consideration the country of residence.
    canTakeLoan is based on the job.
    Languages – Bulgarian / Italian / English; Countries – Bulgaria (18) / Italy (18) / USA (21); Sex – Male / Female
    Religions – Orthodox / Catholic / Islam
    Create 4 classes Child, Bulgarian, American and Italian which inherit Person class
    Use polymorphism to change the implementation of the methods that need different behavior.
    Implement new methods specific only for the concrete class.
    Create different objects in the main class and use their methods.
     */

    private final String name;
    private final String sex;
    private final String religion;
    private final String spokenLanguage;
    private String job;
    private String nationality;
    private final String EGN;
    private LocalDate dateOfBirth;
    private int age;
    private String countryOfResidence;

    public Person(String name, String sex, String religion, String spokenLanguage, String job, String nationality, String EGN, String countryOfResidence){
        this.name = name;
        this.sex = checkSex(sex);
        this.religion = religion;
        this.spokenLanguage = spokenLanguage;
        this.job = job;
        this.nationality = nationality;
        this.EGN = validateEGN(EGN);
        this.dateOfBirth = getDateOfBirth(this.EGN);
        this.age = getAge(this.dateOfBirth);
        this.countryOfResidence = countryOfResidence;
    }

    public String checkSex(String personSex) throws IllegalArgumentException{
        if(personSex.equals("Male") || personSex.equals("Female")){
            return personSex;
        }
        throw new IllegalArgumentException("Please provide a valid value for sex. Valid options are 'Male' or 'Female'");
    }

    private String validateEGN(String personEGN){
        if (personEGN.length() == 10 && hasOnlyDigits(personEGN)) {
            return personEGN;
        } else {
            throw new IllegalArgumentException("The provided EGN is not valid! The EGN must contain only 10 digits!");
        }
    }

    private boolean hasOnlyDigits(String str1){
        try {
            Long.parseLong(str1);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private LocalDate getDateOfBirth(String egn){
        int year = Integer.parseInt(egn.substring(0, 2));
        int month = Integer.parseInt(egn.substring(2, 4));
        int day = Integer.parseInt(egn.substring(4, 6));
        if (month > 40) {
            month -= 40;
            year += 2000;
        } else {
            year += 1900;
        }
        return LocalDate.of(year, month, day);
    }

    private int getAge(LocalDate dateOfBirth){
        return LocalDate.now().getYear() - dateOfBirth.getYear();
    }

    void sayHello(){
        switch (spokenLanguage){
            case "Bulgarian":
                System.out.println("Здравей!");
            case "Italian":
                System.out.println("Ciao!");
            case "Spanish":
                System.out.println("Holla!");
            default:
                System.out.println("Hello");
        }
    }

    public void celebrateEaster(){
        switch (religion){
            case "Orthodox", "Catholic", "Protestant":
                System.out.println(name + " celebrates Easter.");
                break;
            default:
                System.out.println(name + " doesn't celebrate Easter.");
        }
    }

    public boolean isAdult(){
        switch (countryOfResidence) {
            case "Bulgaria", "Italy":
                if(age >= 18){
                    return true;
                }
            case "USA":
                if (age >= 21) {
                    return true;
                }
            default:
                throw new RuntimeException("There is no information about adult age in your country: " + countryOfResidence);
        }
    }

    public boolean canTakeLoan(){
        if (job.equals("null") || job.isEmpty()) {
            return false;
        }

        switch (job) {
            case "student", "unemployed":
                return false;
            default:
                return true;
        }
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setCountry(String country) {
        this.countryOfResidence = country;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", religion='" + religion + '\'' +
                ", language='" + spokenLanguage + '\'' +
                ", job='" + job + '\'' +
                ", nationality='" + nationality + '\'' +
                ", EGN='" + EGN + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", country='" + countryOfResidence + '\'' +
                '}';
    }
}
