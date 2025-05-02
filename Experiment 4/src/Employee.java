package Experiment4;

class Employee {
    private static int totalEmployees = 0; 
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    public Employee() {
        this.employeeID = 500119184;
        this.name = "Harsh ";
        this.department = "IT";
        this.salary = 80000.0;
        totalEmployees++;
    }

    public Employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public double calculateSalary() {
        return this.salary;
    }

    public double getSalary() {
        return this.salary;
    }
    
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(101, "Krrish", "HR", 50000.0);
        Employee emp3 = new Employee(102, "Yash", "IT", 70000.0);

        emp1.displayEmployeeInfo();
        System.out.println();
        emp2.displayEmployeeInfo();
        System.out.println();
        emp3.displayEmployeeInfo();

        Employee.displayTotalEmployees();
    }
}

