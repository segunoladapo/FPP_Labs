package fpp.lab12.exceptions;

public class IllegalTriangleException extends IllegalClosedCurveException {
    private String msg;

    public IllegalTriangleException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
