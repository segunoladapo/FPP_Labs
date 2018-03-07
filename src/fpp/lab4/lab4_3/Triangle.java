package fpp.lab4.lab4_3;

public class Triangle implements Polygon{
    private final double base;
    private final double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double[] getArrayOfSides(){
        return new double[]{base, height, 0.5};
    }
}
