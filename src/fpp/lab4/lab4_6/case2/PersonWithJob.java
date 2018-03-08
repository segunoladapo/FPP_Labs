package fpp.lab4.lab4_6.case2;

import java.util.GregorianCalendar;

/**
 * Created by segun on 3/4/2018.
 */
public final class PersonWithJob extends Person {
    private double salary;

    PersonWithJob(String n, GregorianCalendar dob, double s) {
        super(n, dob);
        this.salary = s;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof PersonWithJob)) {
            return false;
        }
        PersonWithJob secondPerson = (PersonWithJob) obj;
        if (this.getName().equals(secondPerson.getName()) && secondPerson.getDateOfBirth().equals(this.getDateOfBirth())
                && this.getSalary() == secondPerson.getSalary()) {
            return true;
        }
        return false;
    }
}