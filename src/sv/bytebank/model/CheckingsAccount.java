package sv.bytebank.model;

public class CheckingsAccount extends Account{
    public CheckingsAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void deposit(double balance) {

    }


    public void withdraw(double balance) throws InsufficientBalanceException{
        double amountToWithdraw = balance + 0.2;
        super.withdraw(amountToWithdraw);
    }
}
