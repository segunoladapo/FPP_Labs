package fpp.lab12.exceptions;

public class OverDrawnAccountException extends Exception {
    private String msg;

    public OverDrawnAccountException(String msg) {
        super(msg);
        this.msg = msg;
    }
}
