public class TestReferences {

    public static void main(String[] args){
        Employee employee = new Manager();
        employee.setName("diego");

        Manager manager = new Manager();
        manager.setName("Jimena");

        employee.setSalary(2000);
        manager.setSalary(10000);

    }
}
