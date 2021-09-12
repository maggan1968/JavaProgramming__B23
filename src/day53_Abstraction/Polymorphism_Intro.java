package day53_Abstraction;

import day45_Inheritance.employeeTask.*;
import day51_Abstraction.shapeTask.Circle;
import day51_Abstraction.shapeTask.Rectangle;
import day51_Abstraction.shapeTask.Shape;
import day51_Abstraction.shapeTask.Square;

import java.util.ArrayList;
import java.util.Arrays;

public class Polymorphism_Intro {
    public static void main(String[] args) {

        Shape circle = new Circle(5);
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(4, 5);

        /*
        WebDriver driver = new ChromeDriver();
                           new FireFoxDriver();
                           new OperaDriver();
                           ....

                           driver.get();
         */

        System.out.println("------------------------------------------------------------");


        Shape[] array = {
                new Circle(5),
                new Square(10),
                new Rectangle(4, 5)};


        System.out.println("----------------------------------------------------------------");

        Employee employee1 = new Tester(null, ' ',  1, 1,"", 10);

        boolean isDeveloper =  employee1 instanceof Developer;
        boolean isTester = employee1 instanceof Tester;
        //  boolean isHonda = employee1 instanceof Honda;
        boolean isPerson = employee1 instanceof Person;
        boolean isDriver = employee1 instanceof Driver;

        System.out.println(isDeveloper);
        System.out.println(isTester);
        //    System.out.println(isHonda);
        System.out.println(isPerson);
        System.out.println(isDriver);


        System.out.println("-----------------------------------------------");

       ArrayList<Shape> shapes = new ArrayList<>(Arrays.asList(array));
        shapes.addAll(Arrays.asList(
                new Square(15),  new Square(15),  new Square(15),
                new Square(15),  new Square(15),  new Square(15),  new Square(15),
                new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10), new Circle(10),
                new Rectangle(100, 200),  new Rectangle(100, 200),  new Rectangle(100, 200),  new Rectangle(100, 200),
                new Square(15)
        ));
        int numberOfSquares = 0,
                numberOfRectangles = 0,
                numberOfCircles = 0;



    }
}