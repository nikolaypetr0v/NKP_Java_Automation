package main.java.lab8.homework.shape;

public class Square extends Shape{
    double getArea(double side){
        return side * side;
    }

    double getPerimeter(double side){
        return 4 * side;
    }
}
