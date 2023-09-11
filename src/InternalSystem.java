public class InternalSystem {

    private String password = "rickrack";
    public boolean authenticate(Auth manager){
        boolean canLogIn = manager.logIn(password);
        if (canLogIn){
            System.out.println("successful log in");
            return  true;
        } else {
            System.out.println("can't log in");
            return false;
        }
    }
}
