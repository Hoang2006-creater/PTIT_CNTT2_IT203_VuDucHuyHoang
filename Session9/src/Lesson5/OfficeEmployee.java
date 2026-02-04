package Lesson5;

public class OfficeEmployee extends Employee {
    private double fixedSalary;

    public OfficeEmployee(String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}
