//Program to make a Student Grade Calculator
import java.util.Scanner;
public class task2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) 
        {
            System.out.println("Enter the marks obtained by student in subject " + i + ": ");
            int marks = sc.nextInt();
            sum += marks;
        }
        double avgper = ((double) sum / (n * 100)) * 100;
        String grade;
        if (avgper >= 90) 
        {
            grade = "A+";
        } 
        else if (avgper >= 80) 
        {
            grade = "A";
        } 
        else if (avgper >= 70) 
        {
            grade = "B";
        } 
        else if (avgper >= 60) 
        {
            grade = "C";
        } 
        else if (avgper >= 50) 
        {
            grade = "D";
        } 
        else if (avgper >= 40) 
        {
            grade = "E";
        } 
        else 
        {
            grade = "F";
        }
        System.out.println("Total Marks= " + sum);
        System.out.println("Average Percentage= " + avgper + "%");
        System.out.println("Grade= " + grade);
        sc.close();
    }
}
