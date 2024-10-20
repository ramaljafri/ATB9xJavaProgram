package Oct.ex_22102024;

import java.util.Scanner;

public class Task_1_Reverse_Number {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to Reverse = ");
        int num = sc.nextInt();
        int rev=0;
        int rem=0;


        for (int i= num; num >=1 ;  )
        {

           rem = num % 10 ;

          rev = rev*10 + rem;

            num = num/10 ;
        }
        System.out.println("Reversed Output =" + rev);

        sc.close();
}}
