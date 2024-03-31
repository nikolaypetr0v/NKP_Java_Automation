package main.java.lab8.homework.employee;

public class EmployeeExercises {
    public static void main(String[] args) {
        Employee firstEmployee = new Employee(1, "Nikolay", "Petrov", 1000);
        String name = firstEmployee.getName();
        System.out.println("Employee's full name is: " + name);

        double annualSalary = firstEmployee.getAnnualSalary();
        System.out.println("Employee's annual salary is: " + annualSalary);
        System.out.println(firstEmployee);

        double raisedSalary = firstEmployee.raiseSalary(10);
        System.out.println("Employee's new salary is: " + raisedSalary);

        annualSalary = firstEmployee.getAnnualSalary();
        System.out.println("Employee's annual salary has changed to: " + annualSalary);
        System.out.println(firstEmployee);

        Employee secondEmployee = new Employee(2, "Ivan", "Petrov", 1200);
        name = secondEmployee.getName();
        System.out.println("Employee's full name is: " + name);

        annualSalary = secondEmployee.getAnnualSalary();
        System.out.println("Employee's annual salary is: " + annualSalary);
        System.out.println(secondEmployee);

        raisedSalary = secondEmployee.raiseSalary(10);
        System.out.println("Employee's new salary is: " + raisedSalary);

        annualSalary = secondEmployee.getAnnualSalary();
        System.out.println("Employee's annual salary has changed to: " + annualSalary);
        System.out.println(secondEmployee);
    }
}
