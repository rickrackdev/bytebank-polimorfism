package sv.bytebank.test;

import sv.bytebank.model.Account;
import sv.bytebank.model.InsufficientBalanceException;
import sv.bytebank.model.SavingsAccount;

public class TestAccountExceptionBalance {
    public static void main(String[] args) {
        Account account = new SavingsAccount(123, 456) ;
        account.deposit(200);
        try {
            account.withdraw(210);
        } catch (InsufficientBalanceException e) {
            e.printStackTrace();
        }

    }
}
