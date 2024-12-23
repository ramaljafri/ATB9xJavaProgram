package Nov.ex_08112024_Polymorphism.MethodOverRiding;

public class Lab150 {

    public static void main(String[] args) {
Hound h = new Hound();
h.bark();

    }
}


class Dog {

    void bark() {
        System.out.println("Dog Barks");
    }

    int age = 10;
}


class Hound extends Dog {

    @Override
    void bark() {
        System.out.println("Hound Barks");
    }

    int age = 20;
}