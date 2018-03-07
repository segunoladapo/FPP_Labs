package fpp.lab4.lab4_4.employeeinfo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("A. See a report of all account? (y/n) ");
        System.out.print("B. Make a deposity ");
        System.out.print("C. See a report of all account? (y/n) ");
        String answer = sc.next();
        if (answer.equalsIgnoreCase("y")) {
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


}

