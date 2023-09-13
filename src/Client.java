public class Client implements Auth{
    private String name;
    private String idNumber;
    private String occupation;
    private AuthUtil util;
    public Client(){
        this.util = new AuthUtil();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
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
