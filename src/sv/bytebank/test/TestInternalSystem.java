package sv.bytebank.test;

import sv.bytebank.model.Administrator;
import sv.bytebank.model.Auth;
import sv.bytebank.model.InternalSystem;
import sv.bytebank.model.Manager;

public class TestInternalSystem {
    public static void main(String[] args) {
        InternalSystem system = new InternalSystem();
        Manager manager1 = new Manager();
        Administrator admin = new Administrator();
        Auth reference1 = new Manager();

        reference1.setPassword(1234);
        manager1.setPassword(1234);
        admin.setPassword(12345);

        system.authenticate(manager1);
        system.authenticate(admin);
        ;
    }
}
