package Nov.ex_08112024_Polymorphism.MethodOverloading;

public class Lab149 {

    public static void main(String[] args) {

        Mathoperations mo = new Mathoperations();

        //int result = mo.sum(2, 3);
       // float result = mo.sum(2.5f, 3.5f);
double result = mo.sum(2.5, 3.5, 4.5);
        System.out.println(result);



    }
}


class Mathoperations {

    // Method Overloading
    // Same name but different parameters
    // at compile time the JVM knows which method to load


    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    void sum(int a, int b, int c) {
        System.out.println("Hello");
    }

    double sum (double a, double b) {
        return a + b;
    }

double sum (double a, double b, double c ) {
        return a + b+ c;
}}