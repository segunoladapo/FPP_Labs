package fpp.lab4.lab4_6.case2;

import java.util.GregorianCalendar;

/**
 * Created by segun on 3/4/2018.
 */
public class Person {
    private String name;
    private GregorianCalendar dateOfBirth;

    Person(String name, GregorianCalendar dob) {
        this.name = name;
        dateOfBirth = dob;
    }

    public String getName() {
        return name;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Person)) {
            return false;
        }
        Person secondPerson = (Person) obj;
        if (this.name.equals(secondPerson.getName()) && this.dateOfBirth.equals(secondPerson.getDateOfBirth())) {
            return true;
        }
        return false;
    }

}
