package fpp.lab4.lab4_3;

public class Rectangle implements Polygon {
    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double[] getArrayOfSides(){
        return new double[]{width, length};
    }
}
