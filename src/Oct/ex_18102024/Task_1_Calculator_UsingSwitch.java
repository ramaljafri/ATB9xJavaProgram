package Oct.ex_18102024;

import java.util.Scanner;

public class Task_1_Calculator_UsingSwitch {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the First Number : ");
        double num1= sc.nextDouble();
        System.out.println("Enter the Second Number : ");
        double num2= sc.nextDouble();

        System.out.println("Enter the following digits for desired Operation");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Modulus");
double result = 0 ;

        int operator = sc.nextInt();

        switch (operator)

        {
            case 1 :

                result= num1+ num2 ;
                System.out.println ("Result : " + result);
                break;

            case 2 :

                result= num1- num2 ;
                System.out.println ("Result : " + result);
                break;

            case 3 :

                result= num1 * num2 ;
                System.out.println ("Result : " + result);
                break;

            case 4 :

                result= num1/num2 ;
                System.out.println ("Result : " + result);
                break;


            case 5 : {
                if (num2 != 0)
                {
                    result = num1 % num2;
                    System.out.println("Result : " + result);
                    break;
                }

            else
                {
                    System.out.println("Error : Division by zero");
                    break;
                }
            }
            default :
                    System.out.println("User has Entered Invalid input");
                break;

        }
sc.close();




    }
}
