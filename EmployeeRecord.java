class Employee {
    int e_no;
    double e_sal;
    String e_name;

    Employee() {
        e_no = 101;
               e_sal = 99999;
        e_name = "VEDANT N WEDEKAR";
    }

    Employee(int empno, double empsal, String empname) {
        e_no = empno;
        e_sal = empsal;
        e_name = empname;
    }

    void show() {
        System.out.println("Employee ID - " + e_no);
        System.out.println("Employee Salary - " + e_sal);
        System.out.println("Employee Name - " + e_name);
    }
}

public class EmployeeRecord {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.show();

        Employee e2 = new Employee(102, 50050.0, "ANUSHKA KC");
        e2.show();
    }
}