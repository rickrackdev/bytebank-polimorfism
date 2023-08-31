public class TestManager {

    public static void main(String[] args){
        Manager rick = new Manager();
        rick.setName("rick");
        rick.setDocument("210492204");
        rick.setSalary(5000);
        rick.setType(1);
        rick.setPassword("rickrack");

        System.out.println(rick.getSalary());
        System.out.println(rick.getBonus());
        System.out.println(rick.logIn("rickrack"));

    }
}
