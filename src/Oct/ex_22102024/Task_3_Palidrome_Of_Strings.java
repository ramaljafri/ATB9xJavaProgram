package Oct.ex_22102024;

import java.util.Scanner;
public class Task_3_Palidrome_Of_Strings {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string to check = ");

        String text= sc.nextLine().toLowerCase();

        String rev= "";

        for (int i= text.length()-1 ; i>=0 ; i--)

        {

            rev= rev + text.charAt(i);

        }
if (rev.equals(text))
        {

            System.out.println("String is Palidrome");

        }
else

{

    System.out.println("String is NOT Palidrome");

}

sc.close();
    }
}
