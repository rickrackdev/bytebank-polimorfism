package sv.bytebank.model;

public class AuthUtil {
    private int password;

    public boolean LogIn(int password){
        return this.password == password;
    }

    public void setPassword(int password){
        this.password = password;
    }
}
