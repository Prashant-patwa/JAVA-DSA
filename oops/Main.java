package oops;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== OOPS MENU =====");
            System.out.println("1 - Constructors");
            System.out.println("2 - Encapsulation");
            System.out.println("3 - Inheritance");
            System.out.println("0 - Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    getConstructors();
                    break;

                case 2:
                    getEncapsulation();
                    break;

                case 3:
                    getInheritance();
                    break;

                case 0:
                    System.out.println("------ Program ends ------");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void getConstructors() {

        System.out.println("\n--- Default Constructor ---");
        BankAccount acc1 = new BankAccount();
        acc1.display();

        System.out.println("\n--- Parameterized Constructor ---");
        BankAccount acc2 = new BankAccount(456, 5000.0);
        acc2.display();

        System.out.println("\n--- Copy Constructor ---");
        BankAccount acc3 = new BankAccount(acc2);
        acc3.display();

        System.out.println("\n--- Transactions on acc2 ---");
        acc2.deposit(1000);
        acc2.withdrawl(2000);
        acc2.display();
    }

    private static void getEncapsulation() {
        UserAccount user = new UserAccount("Prashant", "123456", 2000.00);
        System.out.println("Username - " + user.getUsername());
        System.out.println("Balance - " + user.getBalance());
        user.deposit(78.61);
        user.setPassword("123456");
    }

    private static void getInheritance() {
        Employee dev = new Developer(123, "Prashant", 40000.00, 3000.00);
        Employee mgr = new Manager(456, "Sahil", 50000.00, 2000.00);

        System.out.println("Developer Details: ");
        dev.display();

        System.out.println("Manager Details: ");
        mgr.display();
    }
}
