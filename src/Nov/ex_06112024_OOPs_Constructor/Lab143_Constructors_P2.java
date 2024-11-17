package Nov.ex_06112024_OOPs_Constructor;

import java.util.Scanner;

public class Lab143_Constructors_P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
      Car2 t1 = new Car2("tesla",2015);
        System.out.println(t1.model);
        System.out.println(t1.year);
        Car2 t2 = new Car2("nano",2030);
        System.out.println(t2.model);
        System.out.println(t2.year);

        System.out.println ("Enter the model name = ");
String model_name = sc.next();
        System.out.println ("Enter the year = ");
        int year_created = sc.nextInt();

        Car2 t3 = new Car2 (model_name, year_created);
        System.out.println(t3.model);
        System.out.println(t3.year);
    }
}

class Car2 {
    //Parameterized Constructor : in this we pass the values

    String model;
    int year;

    Car2(String model_name,int year_created){

        System.out.println("PC is executed");
        this.model = model_name;
        this.year = year_created;
    }

}