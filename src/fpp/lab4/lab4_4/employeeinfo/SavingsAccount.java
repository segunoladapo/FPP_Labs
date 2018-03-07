package fpp.lab4.lab4_4.employeeinfo;

public class SavingsAccount extends Account {
    public SavingsAccount(Employee emp, double balance) {
        super(emp, balance);
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.SAVINGS;
    }

    public double getBalance() {
        double baseBalance = super.getBalance();
        double interest = (0.25 / 100) * baseBalance;
        return baseBalance + interest;
    }
}
