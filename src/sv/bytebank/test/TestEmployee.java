package sv.bytebank.test;

import sv.bytebank.model.Employee;
import sv.bytebank.model.Manager;

public class TestEmployee {

    public static void main (String[] args){
        Employee diego = new Manager();

        diego.setName("Diego");
        diego.setDocument("444556665");
        diego.setSalary(2000);

        System.out.println(diego.getSalary());
        System.out.println(diego.getBonus());

    }
}
