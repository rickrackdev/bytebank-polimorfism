public class TestAccount {
    public static void main(String[] args) {
        CheckingsAccount cc = new CheckingsAccount(1, 1);
        SavingsAccount ca = new SavingsAccount(2,2);

        cc.deposit(2000);
        cc.transfer(1000, ca);

        System.out.println(cc.getBalance());
        System.out.println(ca.getBalance());
    }
}
