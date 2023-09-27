package sv.bytebank.model;

public class AuthEmployee extends Employee {
    private int password;

    public void setPassword(int password){
        this.password = password;
    }

    public boolean logIn(int password){
        if(this.password == password){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public double getBonus() {
        return 0;
    }
}
