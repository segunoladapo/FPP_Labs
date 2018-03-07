package fpp.lab4.lab4_4.employeeinfo;


public class Account {
    public final static String CHECKING = "checking";
    public final static String SAVINGS = "savings";
    public final static String RETIREMENT = "retirement";
    private final static double DEFAULT_BALANCE = 0.0;
    private double balance;
    private AccountType acctType;
    private Employee employee;

    public Account(Employee emp, double balance) {
        employee = emp;
        this.balance = balance;
    }

    public String toString() {
        StringBuilder accountDetails = new StringBuilder();
        accountDetails.append("Account type: " + this.acctType);
        accountDetails.append('\n');
        accountDetails.append("Current bal: " + balance);
        return accountDetails.toString();
    }

    public void makeDeposit(double deposit) {
        // implement
        balance += deposit;
    }

    public boolean makeWithdrawal(double amount) {
        // implement
        if (amount < balance){
            balance -= amount;
            return true;
        }
        return false;
    }

    public AccountType getAcctType(){
        return acctType;
    }

    public double getBalance(){
        return this.balance;
    }
}
