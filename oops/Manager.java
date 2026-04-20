package oops;

public class Manager extends Employee{
        private double allowance;

    public Manager(int id, String name, double baseSalary, double allowance) {
        super.Employee(id, name, baseSalary);
        this.allowance = allowance;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + allowance;
    }
}
