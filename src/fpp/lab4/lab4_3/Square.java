package fpp.lab4.lab4_3;

public class Square implements Polygon{

    private final double side;

    public Square(double side){
        this.side = side;
    }

    public double[] getArrayOfSides(){
        return new double[]{side, side};
    }
}
