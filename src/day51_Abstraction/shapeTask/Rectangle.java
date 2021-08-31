package day51_Abstraction.shapeTask;

public class Rectangle {

    private double l, w;

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if(l <= 0){
            throw new RuntimeException("Invalid Length: "+l);
        }
        this.l = l;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        if(w <= 0){
            throw new RuntimeException("Invalid Width: "+w);
        }
        this.w = w;
    }




}
