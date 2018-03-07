package fpp.lab3.prog3_2;


import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

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
        // implement
        checkingAcct = new Account( this, AccountType.CHECKING, startAmount);

    }

    public void createNewSavings(double startAmount) {
        // implement
        savingsAcct = new Account( this, AccountType.SAVINGS, startAmount);

    }

    public void createNewRetirement(double startAmount) {
        // implement

        retirementAcct = new Account( this, AccountType.RETIREMENT, startAmount);
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
    public void deposit(String acctType, double amt){
        // implement
    }

    public String toString(){
        return name;
    }

}
