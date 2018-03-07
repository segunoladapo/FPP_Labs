package fpp.lab4.lab4_2;

/**
 * Created by segun on 3/4/2018.
 */
public class Rectangle extends ClosedCurve{
    private double width;
    private double length;

    public double getLength() {
        return length;
    }

    @Override
    public double computeArea(){
        return getLength() * getWidth();
    }


    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
