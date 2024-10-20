package Oct.ex_17102024;


import java.util.Scanner;

public class Task_3_Classify_Triangle {
    public static void main(String[] args) {

        //classifies a triangle based on its side lengths
        // Given three input values representing the lengths of the sides
        // determine if the triangle is equilateral (all sides are equal)
        // isosceles (exactly two sides are equal)
        // or scalene (no sides are equal)
        // Use an if-else statement to classify the triangle.

           Scanner scanner = new Scanner (System.in);

        System.out.print("Enter Side # 1 = ");
        float s1 = scanner.nextFloat();

        System.out.print("Enter Side # 2 = ");
        float s2 = scanner.nextFloat();

        System.out.print("Enter Side # 3 = ");
        float s3 = scanner.nextFloat();

        if (s1<0 || s2<0 || s3<0)

        {

            System.out.println("Side cannot be negative ; please provide valid input");

        }

        else if (s1==s2 && s1== s3)
        {
            System.out.println("Triangle is Equilateral Triangle");

        }

        else if (s1==s2 || s1== s3 || s2==s3 )
        {
            System.out.println("Triangle is Isosceles Triangle");

        }

        else
        {
            System.out.println("Triangle is Scalene Traiangle");

        }
        scanner.close();
    }
}
