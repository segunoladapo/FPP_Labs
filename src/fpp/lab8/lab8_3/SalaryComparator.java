package fpp.lab8.lab8_3;

import java.util.Comparator;

/**
 * Created by segun on 3/16/2018.
 */
public class SalaryComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if(e1.getSalary() > e2.getSalary())
            return 1;
        else if(e1.getSalary() < e2.getSalary())
            return -1;
        return 0;
    }
}
