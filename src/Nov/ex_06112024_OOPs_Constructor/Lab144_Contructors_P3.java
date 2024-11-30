package Nov.ex_06112024_OOPs_Constructor;
//Constructor Overlloading : Save name but different arguments

// Parameterized Constructor will help you to set values when object is created
import java.util.Scanner;

public class Lab144_Contructors_P3 {
    public static void main(String[] args) {
      //  Scanner sc = new Scanner (System.in);
        Car3 t1 = new Car3("tesla");
        System.out.println(t1.model);
        System.out.println(t1.year);

        t1.display();
        Car3 t2 = new Car3("nano",2030);
        System.out.println(t2.model);
        System.out.println(t2.year);
        t2.display();
//        System.out.println ("Enter the model name = ");
//        String model_name = sc.next();
//        System.out.println ("Enter the year = ");
//        int year_created = sc.nextInt();
//
//        Car2 t3 = new Car2 (model_name, year_created);
//        System.out.println(t3.model);
//        System.out.println(t3.year);
//        t3.display();
    }
    }



class Car3 {
    //Parameterized Constructor : in this we pass the values

    String model;
    int year;

    Car3(){
        System.out.println("DC is executed");
        model= "BMW";
        year= 2024;
    }

    //Parameterized Contructor 1
    Car3(String model_name,int year_created){
        System.out.println("PC1 is executed");
        this.model = model_name;
        this.year = year_created;
    }


    //Parameterized Contructor 2
    Car3(String model_name){
        System.out.println("PC2 is executed");
        this.model = model_name;
    }
    void display() {
        System.out.println("-------- Car3 Details " + this.model +"--->" + this.year);
    }
}