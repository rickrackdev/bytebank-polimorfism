package sv.bytebank.model;

public class BonusControl {
    private double sum;

    public double getSum() {
        return this.sum;
    }

    public void recordSalary(Employee employee){
        this.sum += employee.getBonus();
    }

}
