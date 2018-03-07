package fpp.lab4.lab4_6.case3;

import java.util.GregorianCalendar;

/**
 * Created by segun on 3/4/2018.
 */
public class PersonWithJob {
    private double salary;
    private Person person;

    PersonWithJob(String n, GregorianCalendar dob, double s) {
        person = new Person(n, dob);
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
        if (this.getName().equals(secondPerson.getName()) && secondPerson.getDob().equals(this.getDob())
                && this.getSalary() == secondPerson.getSalary()) {
            return true;
        }
        return false;
    }

    public String getName() {
        return person.getName();
    }

    public GregorianCalendar getDob() {
        return person.getDateOfBirth();
    }

}