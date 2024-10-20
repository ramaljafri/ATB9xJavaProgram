package Oct.ex_16102024;

import java.util.Scanner;

public class Task_2_Input_Ternary {
    public static void main(String[] args) {
     // Take a user input 2 numbers from the arguments
     // calculate the maximum in between with ternary operator.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number 1 =");
        int num1 = scanner.nextInt();
        System.out.print("Enter Number 2 =");
        int num2 = scanner.nextInt();

int result = num1 >num2 ? num1 : num2 ;

        System.out.print("The maximum of " +num1+" and "+num2+" is "+result);
scanner.close();

    }
}
