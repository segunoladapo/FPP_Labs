package fpp.lab3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Segun", "Segxyhanxy", 4500.00,
                2018, 1, 23);
        Account employeeAccount = new Account(employee, AccountType.CHECKING, 300.00);
        System.out.println(employeeAccount);

    }
}
