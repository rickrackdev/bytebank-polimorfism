public class Administrator extends Employee implements Auth  {

    @Override
    public double getBonus() {
        return 0;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public boolean logIn(String password) {
        return false;
    }
}
