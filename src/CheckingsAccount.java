public class CheckingsAccount extends Account{
    public CheckingsAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void deposit(double balance) {

    }


    public void withdraw(double balance) {
        double commission = 0.2;
        super.withdraw(balance + commission);
    }
}
