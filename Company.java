
public class Company {
    public static void main(String[] args) {
        Manager mgr = new Manager("Rahul Sharma", 85000.0, "IT");
        mgr.displayDetails();
        mgr.manageTeam();
    }
}

class Employee {
    protected String name;
    protected double salary;
    
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private String department;
    
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    
    public void manageTeam() {
        System.out.println(name + " is managing " + department + " team.");
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}


