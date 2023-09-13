public class Manager extends Employee implements Auth{

  private AuthUtil util;
  public Manager(){
      this.util = new AuthUtil();
  }

    public double getBonus(){
        return super.getSalary() + this.getSalary() * 0.5;
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
