package Lesson5;

public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new OfficeEmployee("Nguyễn Văn A", 10000000);
        employees[1] = new ProductionEmployee("Trần Văn B", 120, 50000);
        employees[2] = new OfficeEmployee("Lê Thị C", 12000000);

        double totalSalary = 0;

        for (int i = 0; i < employees.length; i++) {
            double salary = employees[i].calculateSalary(); // đa hình
            totalSalary += salary;
            System.out.println("Lương nhân viên " + (i + 1) + ": " + salary);
        }

        System.out.println("Tổng lương phải trả: " + totalSalary);
    }
}
