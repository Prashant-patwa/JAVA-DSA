package oops;

public class Developer extends Employee{
    private double bonus;

    public Developer(int id, String name, double baseSalary, double bonus) {
        super.Employee(id, name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
