public class TestEmployee {

    public static void main (String[] args){
        Employee diego = new Employee();

        diego.setName("Diego");
        diego.setDocument("444556665");
        diego.setSalary(2000);

        System.out.println(diego.getSalary());
        System.out.println(diego.getBonus());

    }
}
