package main.java.lab8.homework.shape;

public class Circle extends Shape{
    double getArea(double radius){
        return Math.PI * radius * radius;
    }

    double getPerimeter(double radius){
        return 2 * Math.PI * radius;
    }
}
