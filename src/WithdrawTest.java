public class WithdrawTest {
    public static void main(String[] args) {
        Account account = new CheckingsAccount(123, 321);
        account.deposit(200);

        try{
            account.withdraw(210);
        }catch (InsufficientBalanceException ex){
            System.out.println("Exception: " + ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println(account.getBalance());
    }
}
