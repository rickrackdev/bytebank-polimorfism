package sv.bytebank.model;

public abstract class Account {
    protected double balance;
    private int agency;
    private int number;
    private Client owner;
    private static int total = 0;

    public Account(int agency, int number){
        if (agency <= 0){
            System.out.println("Agency number can't be 0");
            this.agency = 1;
        } else {
            this.agency = agency;
        }
        total++;
        System.out.println("created an account " + total);
    }

    public static int getTotal() {
        return Account.total;
    }

    //deposit does not return a value this is established by the type of method
    public abstract void deposit(double balance);

    //withdraw does return a value

    //implementing an exception
    //everytime we handle an exception it's done before the method
    //as every error handling needs to happen before any method implementation
    public void withdraw(double balance) throws InsufficientBalanceException {
        if(this.balance < balance){
            throw new InsufficientBalanceException("Balance: " + this.balance + ", Amount: " + balance);
        }
            this.balance -= balance;
        }

    public void transfer(double balance, Account account) throws InsufficientBalanceException{
        this.withdraw(balance);
        account.deposit(balance);
    }
    public double getBalance(){
        return balance;
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public void setAgency(int agency){
        if (agency > 0) {
            this.agency = agency;
        }
    }
    public void setNumber(int number){
        this.number = number;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public Client getOwner() {
        return owner;
    }
}