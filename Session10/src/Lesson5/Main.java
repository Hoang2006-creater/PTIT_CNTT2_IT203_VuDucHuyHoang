package Lesson5;

public class Main {
    public static void main(String[] args) {

        Employee staff = new OfficeStaff("Nguyen Van A", 8000000);
        Employee manager = new Manager("Tran Thi B", 15000000, 5000000);


        System.out.println("Nhan vien van phong:");
        staff.displayInfo();
        System.out.println("Tong luong: " + staff.calculateSalary());

        System.out.println("Quan ly:");
        manager.displayInfo();
        System.out.println("Tong luong: " + manager.calculateSalary());
    }
}