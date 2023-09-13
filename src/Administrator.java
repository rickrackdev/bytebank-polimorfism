public class Administrator extends Employee implements Auth  {

    private AuthUtil util;

    public Administrator(){
        this.util = new AuthUtil();
    }
    @Override
    public double getBonus() {
        return this.getSalary();
    }

    @Override
    public void setPassword(int password) {
        this.util.setPassword(password);
    }

    @Override
    public boolean logIn(int password) {
      return this.util.LogIn(password);
    }
}
