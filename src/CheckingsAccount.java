public class CheckingsAccount extends Account{
    public CheckingsAccount(int agency, int number){
        super(agency, number);
    }

    @Override
    public void deposit(double balance) {

    }


    public boolean withdraw(double balance) {
        double commission = 0.2;
        return super.withdraw(balance + commission);
    }
}
