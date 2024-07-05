//Program to make a number game
import java.util.Scanner;
public class task1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double randomNumber = Math.random();
        int scaledNumber = (int) (randomNumber * 100);
        System.out.println("Welcome to the Number Game!");
        int score = 0;
        boolean repeat = true;
        while (repeat) 
        {
            int targetNumber = scaledNumber + 1;
            int NoOfAttempts = 0;
            System.out.println("Enter the maximum number of attempts");
            int maxNoOfAttempts = sc.nextInt();
            System.out.println("A number has been selected between 1 and 100. Can you guess it?");
            while (NoOfAttempts < maxNoOfAttempts) 
            {
                System.out.print("Enter the number you guess: ");
                int Guess = sc.nextInt();
                sc.nextLine();
                NoOfAttempts++;
                if (Guess == targetNumber) 
                {
                    System.out.println("Correct! You guessed the right number " + targetNumber + " in " + NoOfAttempts + " attempts.");
                    score++;
                    break;
                } 
                else if (Guess > targetNumber) 
                {
                    System.out.println("Too high! Make another attempt.");
                } 
                else 
                {
                    System.out.println("Too low! Make another attempt.");
                }
            }
            if (NoOfAttempts >= maxNoOfAttempts) 
            {
                System.out.println("Game Over, you've already run out of attempts. The correct number was " + targetNumber + ".");
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String Input = sc.nextLine();
            repeat = Input.equalsIgnoreCase("yes");
        }
        System.out.println("Game over! Your score is= " + score);
        sc.close();
    }
}
