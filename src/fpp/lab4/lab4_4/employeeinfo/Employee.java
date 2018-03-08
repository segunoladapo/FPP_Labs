package fpp.lab4.lab4_4.employeeinfo;

import fpp.lab3.StringList;
import fpp.lab4.lab4_4.*;

import java.time.LocalDate;

public class Employee {

    private String name;
    private LocalDate hireDate;
    private AccountList accountList = new AccountList();

    public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
        this.name = name;
/* update, using LocalDate
        GregorianCalendar cal = new GregorianCalendar(yearOfHire,monthOfHire-1,dayOfHire);
		hireDate = cal.getTime();
*/
        hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

    }


    public void createNewChecking(double startAmount) {
        Account checkingAcct = new CheckingAccount(this, startAmount);
        accountList.add(checkingAcct);
    }

    public void createNewSavings(double startAmount) {
        Account savingsAcct = new SavingsAccount(this, startAmount);
        accountList.add(savingsAcct);
    }

    public void createNewRetirement(double startAmount) {
        Account retirementAcct = new RetirementAccount(this, startAmount);
        accountList.add(retirementAcct);
    }

    public String getFormattedAcctInfo() {
        StringBuilder accountInfoMsg = new StringBuilder();
        for (int i = 0; i < accountList.size(); i++) {
            accountInfoMsg.append(i + ". " + accountList.get(i).getAcctType());
            accountInfoMsg.append('\n');
        }
        return accountInfoMsg.toString();
    }

    public StringList getNamesOfAccounts() {
        StringList namesOfAccount = new StringList();
        for (int i = 0; i < accountList.size(); i++) {
            namesOfAccount.add(accountList.get(i).getAcctType().name());
        }
        return namesOfAccount;
    }

    public AccountList getAccountList(){
        return accountList;
    }


    public String toString() {
        return name;
    }

    public void deposit(int acctIndex, double amt) {
        Account selected = accountList.get(acctIndex);
        selected.makeDeposit(amt);
    }

    public void makeWithdrawal(int acctIndex, double amount){
        Account selected = accountList.get(acctIndex);
        selected.makeWithdrawal(amount);
    }

}
