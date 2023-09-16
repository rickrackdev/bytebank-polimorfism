public class TestAccountExceptionBalance {
    public static void main(String[] args) {
        Account account = new SavingsAccount(123, 456) ;
        account.deposit(200);
        account.withdraw(210);

    }
}
