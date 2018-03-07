package fpp.lab4.lab4_4.employeeinfo;


import fpp.lab4.lab4_4.employeeinfo.AccountList;

import java.time.LocalDate;

public class Employee {

    private Account savingsAcct;
    private Account checkingAcct;
    private Account retirementAcct;
    private String name;
    private LocalDate hireDate;

    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
/* update, using LocalDate
		GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
        hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

    }


    public void createNewChecking(double startAmount) {
        checkingAcct = new CheckingAccount(this, startAmount);
        AccountList.accountList.add(checkingAcct);
    }

    public void createNewSavings(double startAmount) {
        savingsAcct = new SavingsAccount(this, startAmount);
        AccountList.accountList.add(savingsAcct);
    }

    public void createNewRetirement(double startAmount) {
        retirementAcct = new RetirementAccount(this, startAmount);
        AccountList.accountList.add(retirementAcct);
    }

    public String getFormattedAcctInfo() {
        // implement
        StringBuilder accountInfoMsg = new StringBuilder();
        accountInfoMsg.append(checkingAcct.toString());
        accountInfoMsg.append('\n');
        accountInfoMsg.append(savingsAcct.toString());
        accountInfoMsg.append('\n');
        accountInfoMsg.append(retirementAcct.toString());
        return accountInfoMsg.toString();
    }


    public String toString() {
        return name;
    }

    public void deposit(int acctIndex, double amt) {
        Account selected = acc.get(acctIndex);
        selected.makeDeposit(amt);
    }

}
