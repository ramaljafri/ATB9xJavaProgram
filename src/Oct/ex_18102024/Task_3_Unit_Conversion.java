package Oct.ex_18102024;

import java.util.Scanner;

public class Task_3_Unit_Conversion {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.println("Welcome to Unit Converter");

        System.out.println("Input below for Unit Conversion");
        System.out.println("Press 1 -- Convert from Km to miles");
        System.out.println("Press 2 -- Convert from Fahrenheit  to Celsius");

        int unit = sc.nextInt();

        switch (unit)
        {
            case 1:
                System.out.println("**** Km to miles Unit Converter ***** ");
                System.out.println("Enter km as input = ");

                float km = sc.nextFloat();
                double m= km * 0.621371 ;

                System.out.println(km+" km "+"is equivalent to "+m+" miles ");
break;

            case 2:
                System.out.println("***** F to C Unit Converter ***** ");
                System.out.println("Enter F as input = ");


                float F = sc.nextFloat();
                float C= (F-32) *((float) 5 /9) ;

                System.out.println(F+" Fahrenheit"+" is equivalent to "+ C+" Celsius");
                break;
            default:
                System.out.println("Invalid Input");

                break;



        }

    }
}
