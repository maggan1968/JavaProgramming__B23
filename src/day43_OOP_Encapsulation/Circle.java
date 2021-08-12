package day43_OOP_Encapsulation;

public class Circle {
    //               10      30
    private double radius, diameter;

    private static double PI = 3.14;

    public double getRadius(){
        return radius;
    }

    public double getDiameter(){
        return  diameter;
    }

    public void setRadius(double radius){
        if(radius < 0){
            System.out.println("Radius of the circle can not be negative");
            return; // exits the method
        }

        this.radius  =radius; // r= 3
        setDiameter(radius* 2); // d= r* 2
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
        setRadius(diameter/2);
    }


    public Circle(double radius) {
       setRadius(radius);
    }


}
