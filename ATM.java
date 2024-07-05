import java.util.Scanner;
public class ATM 
{
    private BankAccount bankAccount;
    public ATM(BankAccount bankAccount) 
    {
        this.bankAccount = bankAccount;
    }
    public void displayMenu() 
    {
        System.out.println("\nWelcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Withdraw Funds");
        System.out.println("4. Exit");
    }
    public int getUserChoice(Scanner sc) 
    {
        System.out.print("Select an option: ");
        while (!sc.hasNextInt()) 
        {
            System.out.println("Error: Invalid input. Please enter a number.");
            sc.next(); 
            System.out.print("Select an option: ");
        }
        return sc.nextInt();
    }
    public double getAmount(Scanner sc, String prompt) 
    {
        System.out.print(prompt);
        while (true) 
        {
            if (sc.hasNextDouble()) 
            {
                double amount = sc.nextDouble();
                if (amount > 0) 
                {
                    return amount;
                } 
                else 
                {
                    System.out.println("Error: Invalid amount. Please enter a positive value.");
                    System.out.print(prompt);
                }
            } 
            else 
            {
                System.out.println("Error: Invalid input. Please enter a valid amount.");
                sc.next(); 
                System.out.print(prompt);
            }
        }
    }
    public void executeTransaction(int choice, Scanner sc) 
    {
        switch (choice) 
        {
            case 1:
                System.out.printf("Current Balance: $%.2f%n", bankAccount.getBalance());
                break;
            case 2:
                double dA = getAmount(sc, "Enter deposit amount: $");
                bankAccount.deposit(dA);
                break;
            case 3:
                double wA = getAmount(sc, "Enter withdrawal amount: $");
                bankAccount.withdraw(wA);
                break;
            case 4:
                System.out.println("Exiting ATM. Thank you!");
                sc.close();
                System.exit(0);
            default:
                System.out.println("Error: Invalid choice. Please select a valid option.");
        }
    }
}




