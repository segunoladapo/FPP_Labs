package fpp.lab4.lab4_4.employeeinfo;

public class RetirementAccount extends Account {

    public RetirementAccount(Employee emp, double balance) {
        super(emp, balance);
    }

    @Override
    public AccountType getAcctType() {
        return AccountType.RETIREMENT;
    }

}
