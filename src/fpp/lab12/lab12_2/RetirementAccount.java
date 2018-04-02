package fpp.lab12.lab12_2;

import fpp.lab12.exceptions.OverDrawnAccountException;

public class RetirementAccount extends Account {
    private final double PENALTY_PERCENT = 2.0;

    RetirementAccount(Employee e, double startBalance) {
        super(e, startBalance);
    }

    RetirementAccount(Employee e) {
        super(e);
    }

    public boolean makeWithdrawal(double amount) throws OverDrawnAccountException {
        double bal = getBalance();

        double penalty = bal * (PENALTY_PERCENT / 100);
        bal = bal - amount - penalty;
        if (bal < 0) {
            throw new OverDrawnAccountException("After computing penalties, your withdrawal" +
                    " amount exceeds your balance");
        }
        setBalance(bal);
        return true;
    }

    public AccountType getAcctType() {
        return AccountType.RETIREMENT;
    }

}
