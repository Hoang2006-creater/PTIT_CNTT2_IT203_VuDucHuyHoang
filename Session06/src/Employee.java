public class Employee {
    private String employeeId;
    private String employeeName;
    private double employeeSalary;

    public Employee() {
        this.employeeId = "Chua co ma";
        this.employeeName = "Chua co ten";
        this.employeeSalary = 0;
    }

    public Employee(String id, String name) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = 0;
    }

    public Employee(String id, String name, double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeSalary = salary;
    }

    public void displayInfo() {
        System.out.println("Ma NV: " + employeeId);
        System.out.println("Ten NV: " + employeeName);
        System.out.println("Luong: " + employeeSalary);
    }
}

class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("E001", "John Due");
        Employee e3 = new Employee("E002", "Smith", 5000);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();
    }
}
