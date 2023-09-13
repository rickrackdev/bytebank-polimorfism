public class InternalSystem {

    private int password = 12345;
    public void authenticate(Auth manager){
        boolean canLogIn = manager.logIn(this.password);
        if (canLogIn){
            System.out.println("successful log in");
        } else {
            System.out.println("can't log in");
        }
    }
}
