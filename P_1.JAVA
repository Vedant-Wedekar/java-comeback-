```java
class Employee {

    int e_no;
    double e_sal;
    String e_name;

    // Default Constructor
    Employee() {
        e_no = 101;
        e_sal = 2090.50;
        e_name = "Smit John";
    }

    // Parameterized Constructor
    Employee(int empno, double empsal, String empname) {
        e_no = empno;
        e_sal = empsal;
        e_name = empname;
    }

    // Method to display employee details
    void show() {
        System.out.println("Employee ID - " + e_no);
        System.out.println("Employee Salary - " + e_sal);
        System.out.println("Employee Name - " + e_name);
    }
}

public class EmployeeRecord {

    public static void main(String[] args) {

        // Object using Default Constructor
        Employee e1 = new Employee();
        e1.show();

        // Object using Parameterized Constructor
        Employee e2 = new Employee(102, 50050, "Michel");
        e2.show();
    }
}
```
~~