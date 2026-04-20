package oops;

public class UserAccount {
    private String username;
    private String password;
    private double balance;

    public UserAccount(String username, String password, double balance) {
        this.username = username;
        this.password = password;
        this.balance = balance;
    }

    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= 6) {
            password = newPassword;
        } 
        else {
            System.out.println("Password must be atleast 6 characters");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            logActivity("Deposited amount = " + (amount));
        }
    }

    // default access
    void logActivity(String message) {
        System.out.println(" [LOG] - " + message);
    }
}