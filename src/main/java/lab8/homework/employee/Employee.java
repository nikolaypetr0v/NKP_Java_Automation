package main.java.lab8.homework.employee;

public class Employee {
    /*
    2. Create class Employee with the following attributes – id, first name, last name , salary per month.
    Id, first name , last name – must be set only once
    Salary – can be updated any time
    Add the following methods – getName() / getAnnualSalary() / raiseSalary()
    getName – combines firstname and last name
    getAnnualSalary – return what is the annual salary for the employee
    raiseSalary – modify current salary by X% and return the update salary
    toString – should print all the information about the employee
     */

    private final int id;
    private final String firstName;
    private final String lastName;
    private double salary;

    Employee(int id, String firstName, String lastName, double salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    void setSalary(double employeeSalary){
        salary = employeeSalary;
    }

    String getName(){
        return firstName + " " + lastName;
    }

    double getAnnualSalary(){
        return salary * 12;
    }

    double raiseSalary(double raiseRate){
        double updatedSalary;
        if(raiseRate > 0){
            updatedSalary = salary + (salary * raiseRate / 100);
            return this.salary = updatedSalary;
        }
        else return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id = '" + id + '\'' +
                ", first name = '" + firstName + '\'' +
                ", last name = " + lastName +
                ", salary = " + salary +
                '}';
    }
}
