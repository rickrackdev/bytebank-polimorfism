public class Manager extends Employee implements Auth{

    private int password;

    public double getBonus(){
        return super.getSalary() + this.getSalary() * 0.5;
    }

    public int getPassword() {
        return password;
    }

    @Override
    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public boolean logIn(int password) {
        if(this.password == password){
            return true;
        }else {
            return false;
        }
    }
}
