package Nov.ex_06112024_OOPs_Constructor;
// Default Constructors are used to set default values
public class Lab142_Constructors {
    public static void main(String[] args) {
        Car tesla = new Car();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Car nano = new Car();
        nano.name = "Tata";
        System.out.println(nano.name);

    }
}
