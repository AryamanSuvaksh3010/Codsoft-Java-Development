public class BankAccount 
{
    private double balance;
    public BankAccount(double initialBalance) 
    {
        this.balance = initialBalance;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void deposit(double amount) 
    {
        if (amount > 0) 
        {
            balance += amount;
            System.out.printf("Deposit of $%.2f successful. Current balance: $%.2f%n", amount, balance);
        } 
        else 
        {
            System.out.println("Error: Invalid deposit amount. Please enter a positive value.");
        }
    }
    public void withdraw(double amount) 
    {
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.printf("Withdrawal of $%.2f successful. Current balance: $%.2f%n", amount, balance);
        } 
        else if (amount <= 0) 
        {
            System.out.println("Error: Invalid withdrawal amount. Please enter a positive value.");
        } 
        else 
        {
            System.out.println("Error: Insufficient balance.");
        }
    }
}

