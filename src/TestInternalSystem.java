public class TestInternalSystem {
    public static void main(String[] args) {
        InternalSystem system = new InternalSystem();
        Manager manager1 = new Manager();
        Administrator admin = new Administrator();

        system.authenticate(manager1);
        system.authenticate(admin);
    }
}
