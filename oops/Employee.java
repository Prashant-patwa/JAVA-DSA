// Design a system for a company where different types of employees exist.

// Every employee:
// has an id and name
// gets a base salary

// But:
// A Developer gets a bonus
// A Manager gets an allowance

// All employees should:
// calculate salary
// display details

// Use inheritance so we avoid code duplication and model a real IS-A relationship.

package oops;

public class Employee {
    protected int id;
    protected String name;
    protected double baseSalary; 

    public void Employee(int id, String name, double baseSalary) {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // final bcz salary formula shouldn't change
    public final double getBaseSalary() {
        return baseSalary;
    }

    public double calculateSalary() {
        return baseSalary;
    }

    public void display() {
        System.out.println("ID - " + (id));
        System.out.println("Name - " + (name));
        System.out.println("Salary - " + calculateSalary());
    }
}

