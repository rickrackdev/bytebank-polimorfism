public class Employee {

    //creating the attributes of the workers object
    private String name;
    private String document;
    private double salary;

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

}
