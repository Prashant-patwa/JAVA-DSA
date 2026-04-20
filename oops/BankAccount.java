package oops;

    public class BankAccount {
        private int accountNumber;
        private double balance;

        // Default Constructor
        public BankAccount() {
            accountNumber = 123;
            balance = 100;
        }

        // Parameterized Constructor
        public BankAccount(int accountNumber, double balance) {
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        // Copy Constructor
        public BankAccount(BankAccount other) {
            this.accountNumber = other.accountNumber;
            this.balance = other.balance;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
            }
            else {
                System.out.println("Invalid deposit amount - Procedure failed.");
            }
        }

        public void withdrawl(double amount) {
            if (balance >= amount && amount > 0) {
                balance -= amount;
            }
            else {
                System.out.println("Invalid withdrawl amount - Procedure failed.");
            }
        }

        void display() {
            System.out.println("Account number: " + (accountNumber));
            System.out.println("Balance: " + (balance));
        }
    }
