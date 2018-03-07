package fpp.lab3;

import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    // instance fields
    private String name;
    private String nickName;
    private double salary;
    private Date hireDay;
    private LocalDate hireDate;
    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;

    // constructor
    Employee(String name, String aNickName, double aSalary, int aYear,
             int aMonth, int aDay) {
        this.name = name;
        nickName = aNickName;
        salary = aSalary;
        /*
        GregorianCalendar cal = new GregorianCalendar(aYear, aMonth - 1, aDay);
        hireDay = cal.getTime();
        */
        hireDate = LocalDate.of(aYear, aMonth, aDay);


    }

    // instance methods
    public String getName() {
        return name;
    }
    public String getNickName() {
        return nickName;
    }
    public void setNickName(String aNickName) {
        nickName = aNickName;
    }
    public double getSalary() {
        return salary;
    }
    // needs to be improved
    public Date getHireDay() {
        return (Date)hireDay.clone();
    }
    public void raiseSalary(double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public void createNewChecking(double startAmount) {
        // implement
        checkingAcct = new Account( this, AccountType.CHECKING, startAmount);

    }

    public void createNewSavings(double startAmount) {
        // implement
        checkingAcct = new Account( this, AccountType.SAVINGS, startAmount);

    }

    public void createNewRetirement(double startAmount) {
        // implement

        checkingAcct = new Account( this, AccountType.RETIREMENT, startAmount);
    }


    public void deposit(String acctType, double amt){
        // implement
    }
    public boolean withdraw(String acctType, double amt){
        // implement
        return false;
    }


    private String format = "name = %s, salary = %.2f, hireDay = %s";

    public String toString() {
        return String.format(format, name, salary, Util.dateAsString(hireDay));
    }
}
