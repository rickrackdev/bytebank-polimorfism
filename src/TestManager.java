public class TestManager {

    public static void main(String[] args){
        Manager rick = new Manager();
        rick.setName("rick");
        rick.setDocument("210492204");
        rick.setSalary(5000);
        rick.setPassword(1234);

        System.out.println(rick.getSalary());
        System.out.println(rick.logIn(1234));

    }
}
