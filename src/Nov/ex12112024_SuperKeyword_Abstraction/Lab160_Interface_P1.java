package Nov.ex12112024_SuperKeyword_Abstraction;

public class Lab160_Interface_P1 {
}


abstract class ABC {
    abstract void m1();

    void m2() {
        System.out.println("I am in m2--- Complete Method 2 ");

    }

    ABC() {

    }

}

interface I {
    // Interface cannot have complete function
    void m1();

    void m2();

    void m3();

    default void m4() {
        System.out.println("I am in m4--- Complete function in the inmterface using default (Default Method)");

    }
    default void m5() {
        System.out.println("I am in m5--- Complete function in the inmterface using default (Default Method) ");

    }



    static void m6 () {
        System.out.println("I am in m6--- Complete function in the inmterface using Static (Static Method)");

    }

}