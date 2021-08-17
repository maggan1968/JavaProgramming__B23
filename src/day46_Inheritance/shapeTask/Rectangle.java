package day46_Inheritance.shapeTask;

public class Rectangle {

    private double length, width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length < 0){
            return;
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <0){
            return;
        }
        this.width = width;
    }



}
