class BankAccount {
    private String accountNumber;
    private double balance;
    
    public String getAccountNumber() {
    return accountNumber;
    }
    
    public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    }
    
    public double getBalance() {
    return balance;
    }
    
    public void setBalance(double balance) {
    if (balance >= 0) {
    this.balance = balance;
    } else {
    System.out.println("Balance cannot be negative!");
    }
    }
    }
    
    public class encapsulation3 {
    public static void main(String[] args) {
    BankAccount acc = new BankAccount();
    acc.setAccountNumber("AC987654");
    acc.setBalance(5000.75);
    System.out.println("Account Number: " + acc.getAccountNumber());
    System.out.println("Balance: RS:" + acc.getBalance());
    }
    }
    