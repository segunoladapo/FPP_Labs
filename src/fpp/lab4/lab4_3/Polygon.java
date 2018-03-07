package fpp.lab4.lab4_3;

public interface Polygon {


    double[] getArrayOfSides();

    static double sum(double[] arr) {
        double sum = 0.0;
        for (double value : arr) {
            sum += value;
        }
        return sum;
    }

    default double computePerimeter() {
        double retVal = 1.0;
        for(double val : getArrayOfSides())
            retVal *=val;
        return retVal;
    }


}
