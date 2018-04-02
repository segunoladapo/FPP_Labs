package fpp.lab4.lab4_4.employeeinfo;

import java.util.EnumMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee[] emps = new Employee[3];
        emps[0] = new Employee("Jim Daley", 2000, 9, 4);
        emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
        emps[2] = new Employee("Susan Randolph", 1997, 2, 13);
        emps[0].createNewChecking(10500);
        emps[0].createNewSavings(1000);
        emps[0].createNewRetirement(9300);
        emps[1].createNewChecking(34000);
        emps[1].createNewSavings(27000);
        emps[1].createNewRetirement(37000);
        emps[2].createNewChecking(10038);
        emps[2].createNewSavings(12600);
        emps[2].createNewRetirement(9000);
        displayMenu();
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if (answer.equalsIgnoreCase("A")) {
            displayAllAccounts(emps);
        } else if (answer.equalsIgnoreCase("B")) {
            displayAllEmployee(emps);
            String selectedEmployeeIndex = sc.next();
            displayEmployeeAccount(emps[Integer.valueOf(selectedEmployeeIndex)]);
            System.out.println("Select an account: (type a number) ");
            String selectedAccountIndex = sc.next();
            System.out.println("Deposit amount ");
            String depositAmount = sc.next();
            makeDeposit(Integer.valueOf(selectedAccountIndex), Double.valueOf(depositAmount), emps[Integer.valueOf(selectedEmployeeIndex)]);
        } else if (answer.equalsIgnoreCase("C")) {
            displayAllEmployee(emps);
            String selectedEmployeeIndex = sc.next();
            displayEmployeeAccount(emps[Integer.valueOf(selectedEmployeeIndex)]);
            System.out.println("Select an account: (type a number) ");
            String selectedAccountIndex = sc.next();
            System.out.println("Amount to withdrawal : ");
            String withdrawalAmount = sc.next();
            makeWiithdrawal(Integer.valueOf(selectedAccountIndex), Double.valueOf(withdrawalAmount), emps[Integer.valueOf(selectedEmployeeIndex)]);
        } else {
            System.out.println("You have made an invalid selection. Please try again");
        }
    }

    public static void displayMenu() {
        System.out.println("A. See a report of all account? (y/n) ");
        System.out.println("B. Make a deposit ");
        System.out.println("C. Make a withdrawal. ");
        System.out.println("Make a selection (A/B/C)");
    }

    public static void displayAllEmployee(Employee[] employees) {
        int index = 0;
        for (Employee employee : employees) {
            System.out.println(index++ + ". " + employee.toString());
        }

    }

    public static void displayEmployeeAccount(Employee employee) {
        System.out.println(employee.getFormattedAcctInfo());
    }

    public static void displayAllAccounts(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println(employee.getFormattedAcctInfo());
        }
    }

    public static void makeDeposit(int accountIndex, double amount, Employee employee) {
        employee.deposit(accountIndex, amount);
        System.out.println(amount + " has been deposited in the " + employee.getAccountList().get(accountIndex).getAcctType()
                + " account of " + employee.toString());
    }

    public static void makeWiithdrawal(int accountIndex, double amount, Employee employee) {
        employee.makeWithdrawal(accountIndex, amount);
        System.out.println("Withdrawal made successfully");
    }
}

