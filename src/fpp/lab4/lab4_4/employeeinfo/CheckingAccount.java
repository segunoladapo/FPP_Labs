package fpp.lab4.lab4_4.employeeinfo;

public class CheckingAccount extends Account {

    public CheckingAccount(Employee emp, double balance) {
        super(emp, balance);
    }

    @Override
    public AccountType getAcctType(){
        return AccountType.CHECKING;
    }
}
