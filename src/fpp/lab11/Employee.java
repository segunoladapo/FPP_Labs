package fpp.lab11;


import java.util.HashMap;
import java.util.Iterator;


public class Employee {
    private String firstName;
    private String lastName;
    private HashMap salaryRecord;
    private MyHashtable table = new MyHashtable();

    public void addEntry(String date, double salary) {
        //implement
        table.put(date, salary);
    }

    public void printPaymentAmount(String date) {
        //implement
        System.out.println(table.get(date));

    }

    public void printAveragePaycheck() {
        //implement
        int average = 0;
        double salary = 0;
        Iterator it = table.iterator();
        while (it.hasNext()) {
            String date = (String) it.next();
            salary += ((Double)table.get(date)).doubleValue();
            average++;
        }
        System.out.println(salary/average);
    }

    public static void main(String[] args) {
        Employee e = new Employee();
        e.setFirstName("Jim");
        e.setLastName("Jones");
        for (int i = 1; i <= 12; ++i) {
            e.addEntry(i + "/15/2011", 3070 + 5 * i);
        }
        e.printPaymentAmount("3/15/2011");
        e.printPaymentAmount("5/15/2010");
        e.printAveragePaycheck();

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

}
