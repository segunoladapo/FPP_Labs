package fpp.lab4.lab4_6.case1;

import java.util.GregorianCalendar;

/**
 * Created by segun on 3/4/2018.
 */
public class PersonWithJob extends Person {
    private double salary;

    PersonWithJob(String n, GregorianCalendar dob, double s) {
        super(n, dob);
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }

}