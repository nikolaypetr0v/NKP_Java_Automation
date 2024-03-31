package main.java.lab8.homework.shape;

public abstract class Shape {
    /*
    1. Create abstract class Shape. Add 2 abstract methods – getArea / getPerimeter – return type of
    both methods is Double
    Create class Circle which inherits Shape. Implement all abstract methods in Circle.
    Create class Square which inherits Shape. Implement all abstract methods in Square.
    Use Math.Pi for Circle calculations.
    Create a main class and add the code on next slide. Try to predict what will be the result and then
    execute the code
     */
    abstract double getArea(double areaNum);
    abstract double getPerimeter(double perimeterNum);
}
