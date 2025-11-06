import java.util.ArrayList;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee[name=" + name + ", id=" + id + ", salary=" + calculateSalary() + "]";
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}

class PayrollSystem{
    private ArrayList<Employee> employeelist;

    public PayrollSystem(){
        employeelist = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeelist.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for(Employee employee : employeelist){
            if(employee.getId()==id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove != null){
            employeelist.remove(employeeToRemove);
        }
    }
    public void displayEmployees(){
        for(Employee employee : employeelist){
            System.out.println(employee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee f1 = new FullTimeEmployee("Atul", 101, 30000);
        PartTimeEmployee p1 = new PartTimeEmployee("Ravi", 102, 40, 500);

        System.out.println(f1);
        System.out.println(p1);
        PayrollSystem payrollSystem = new PayrollSystem();
        payrollSystem.addEmployee(f1);
        payrollSystem.addEmployee(p1);
        System.out.println("Initial employee details: ");
        payrollSystem.displayEmployees();
        System.out.println("Removing employees: ");
        payrollSystem.removeEmployee(102);
        payrollSystem.displayEmployees();
    }
}
