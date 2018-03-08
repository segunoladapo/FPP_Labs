package fpp.lab4.lab4_4.employeeinfo;

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
            for (Employee employee : emps) {
                System.out.println("ACCOUNT INFO FOR " + employee.toString());
                String info = employee.getFormattedAcctInfo();
                System.out.println(info);
            }
            //display info to console
        } else {
            //do nothing..the application ends here
        }
    }

    public static void displayMenu(){
        System.out.print("A. See a report of all account? (y/n) ");
        System.out.print("B. Make a deposit ");
        System.out.print("C. See a report of all account? (y/n) ");
        System.out.print("Make a selection (A/B/C)");
    }

    public static void displayOPtionToSeeReport(Employee[] employees){
        int index = 0;
        for(Employee employee : employees){
            System.out.println(index++ + ". " + employee.toString());
        }

    }


}

