package Oct.ex_16102024;

import java.util.Scanner;

public class Task_1_Take_Input {
    public static void main(String[] args) {
        //4- Take a user input - Name, Age and Salary and print them in the end.
 Scanner scanner =new Scanner(System.in);

        System.out.print("Enter Name =");
        String name = scanner.nextLine();

        System.out.print("Enter Age=");
        int age= scanner.nextInt();

        System.out.print("Enter Salary=");
        double salary= scanner.nextFloat();

        System.out.println("**************");
        System.out.println("Name is "+name);
        System.out.println("Age is "+age);
        System.out.println("Salary is "+salary);
scanner.close();


    }
}
