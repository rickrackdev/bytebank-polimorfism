public class Manager extends Employee implements Auth{

    public double getBonus(){
        return super.getSalary() + this.getSalary() * 0.5;
    }

    @Override
    public void setPassword(String password) {

    }

    @Override
    public boolean logIn(String password) {
        return false;
    }
}
