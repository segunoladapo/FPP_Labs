package fpp.lab8.lab8_3;

import java.util.Comparator;

/**
 * Created by segun on 3/16/2018.
 */
public class HireDateComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getHireDate().compareTo(e2.getHireDate());
    }
}
