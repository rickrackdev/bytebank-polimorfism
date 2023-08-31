public class Employee {

    //creating the attributes of the workers object
    private String name;
    private String document;
    private double salary;
    private int type;

    //creating our constructor method
    public Employee(){

    }

    //setting up getters and setters for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getBonus(){
        //if type == 1 is a manager
        //if type == 0 is an employee
        if (this.type == 0){
            return this.salary * 0.10;
        } else if (this.type == 1) {
            return  this.salary;
        } else{
            return 0;
        }
    }
}
