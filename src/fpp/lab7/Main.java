package fpp.lab7;

public class Main {

    public static void main(String[] args) {
        System.out.println("Answer: " + (new Main()).power(2, 5));
    }

    double power(double x, int n) {
        System.out.println("Iteration of n: " + n + " x: " + x);
        if (n == 0) {
            return 1;
        }
        return power(x, n - 1) * x;
    }
}
