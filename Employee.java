class Employee {
    int empId;
    String name;
    double salary;

    // Default constructor
    Employee() {
        this.empId = 0;
        this.name = "Not Available";
        this.salary = 0.0;
    }

    // Parameterized constructor
    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee ID : " + this.empId);
        System.out.println("Employee Name : " + this.name);
        System.out.println("Employee Salary : " + this.salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee(101, "Vedant N Wedekar", 99999999.99);

        System.out.println("Employee 1 Details:");
        e1.display();

        System.out.println("\nEmployee 2 Details:");
        e2.display();
    }
}