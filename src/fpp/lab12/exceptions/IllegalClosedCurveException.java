package fpp.lab12.exceptions;

public class IllegalClosedCurveException extends Exception {
    private String msg;

    public IllegalClosedCurveException(String msg) {
        super(msg);
        this.msg = msg;
    }

}
