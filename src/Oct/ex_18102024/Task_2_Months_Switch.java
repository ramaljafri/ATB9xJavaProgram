package Oct.ex_18102024;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task_2_Months_Switch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number from 1-12 to find out the month =");
        int month= sc.nextInt();

        switch (month)
        {
            case 1 :

                System.out.println("Output = January");
                break;

            case 2 :

                System.out.println("Output = February");
                break;

            case 3 :

                System.out.println("Output = March");
                break;
            case 4 :

                System.out.println("Output = April");
                break;
            case 5 :

                System.out.println("Output = May");
                break;

                case 6 :

                System.out.println("Output = June");
                break;

                case 7 :

                System.out.println("Output = July");
                break;
            case 8 :

                System.out.println("Output = August");
                break;

                case 9 :

                System.out.println("Output = September");
                break;

            case 10 :

                System.out.println("Output = October");
                break;

            case 11 :

                System.out.println("Output = November");
                break;
            case 12 :

                System.out.println("Output = December");
                break;

            default:

                System.out.println("Invalid Input");
                 break;

        }

            sc.close();



    }
}
