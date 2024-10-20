package Oct.ex_17102024;

import java.util.Scanner;

public class Task_1_if_else {
    public static void main(String[] args) {
        //  Grade Calculator:
        //
        //// Write a program that calculates and displays the letter grade
        //// for a given numerical score (e.g., A, B, C, D, or F)
        //// based on the following grading scale:
        ////
        ////A: 90-100
        ////B: 80-89
        ////C: 70-79
        ////D: 60-69
        ////F: 0-59
Scanner scanner= new Scanner(System.in) ;

        System.out.print("Enter the Score = ");

        float score= scanner.nextFloat();

        if (score>89 && score <=100)
        {
            System.out.println("Grade is A");
        }

        else if (score>79 && score <=89)
        {
            System.out.println("Grade is B");

        }

        else if (score>69 && score <=79)
        {
            System.out.println("Grade is C");

        }

        else if (score>59 && score <=69)

        {
            System.out.println("Grade is D");

        }

        else if (score>100 || score <0)

        {
            System.out.println("Invalid Input");

        }

        else
        {
            System.out.println("Grade is F");

        }

        scanner.close();
    }
}
