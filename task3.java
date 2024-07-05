//Program to make interface of an ATM
import java.util.Scanner;
public class task3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double initialBalance = getInitialBalance(sc);
        BankAccount bankAccount = new BankAccount(initialBalance);
        ATM atm = new ATM(bankAccount);
        while (true) 
        {
            atm.displayMenu();
            int choice = atm.getUserChoice(sc);
            atm.executeTransaction(choice, sc);
            System.out.println(); 
        }
    }
    public static double getInitialBalance(Scanner sc) 
    {
        System.out.print("Enter initial account balance: $");
        while (true) 
        {
            if (sc.hasNextDouble()) 
            {
                double initialBalance = sc.nextDouble();
                if (initialBalance >= 0) 
                {
                    return initialBalance;
                } 
                else 
                {
                    System.out.println("Error: Initial balance cannot be negative. Please enter a valid amount.");
                    System.out.print("Enter initial account balance: $");
                }
            } 
            else 
            {
                System.out.println("Error: Invalid input. Please enter a valid initial balance.");
                sc.next(); 
                System.out.print("Enter initial account balance: $");
            }
        }
    }
}
