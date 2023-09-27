package sv.bytebank.test;

import sv.bytebank.model.*;

public class TestBonusControl {

    public static void main(String[] args){
        Employee diego = new Manager();
        diego.setSalary(2000);

        Manager jimena = new Manager();
        jimena.setSalary(10000);
        Accountant alexi = new Accountant();
        alexi.setSalary(5000);

        VideoEditor ev = new VideoEditor();
        ev.setSalary(2500.0);

        Designer d = new Designer();
        d.setSalary(2000.0);


        BonusControl bonusControl = new BonusControl();

        //bonusControl.recordSalary(diego);
        bonusControl.recordSalary(jimena);
        //bonusControl.recordSalary(alexi);
        bonusControl.recordSalary(ev);
        bonusControl.recordSalary(d);

        System.out.println(bonusControl.getSum());

    }
}
