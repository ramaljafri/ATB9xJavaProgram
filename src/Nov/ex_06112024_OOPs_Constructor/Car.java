package Nov.ex_06112024_OOPs_Constructor;
// Constructors are used to set default values
public class Car {

    String model;
    int year;
    String name;

    //default Contructor - No Arguments No return type
    Car() {
        model = "Toyota";
        year = 2023;
        name = "Camry";
        System.out.println("DC is executed");
    }
}
