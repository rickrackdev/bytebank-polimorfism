package sv.bytebank.test;

import sv.bytebank.model.CheckingsAccount;
import sv.bytebank.model.InsufficientBalanceException;
import sv.bytebank.model.SavingsAccount;

public class TestAccount {
    public static void main(String[] args) throws InsufficientBalanceException {
        CheckingsAccount cc = new CheckingsAccount(1, 1);
        SavingsAccount ca = new SavingsAccount(2,2);

        cc.deposit(100);
        ca.deposit(200);
        cc.transfer(110, ca);

        System.out.println("CC: " + cc.getBalance());
        System.out.println("CA: " + ca.getBalance());
    }
}
