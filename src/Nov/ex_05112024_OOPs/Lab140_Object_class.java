package Nov.ex_05112024_OOPs;

public class Lab140_Object_class {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.name = "Hershey";
        c1.sleep();
        System.out.println(c1.name);
    }
}

class Cat {
    String name;


    void eat(){
        System.out.println("Cat is eating");
    }

    void sleep(){
        System.out.println("Cat is sleeping");
    }

    void play(){
        System.out.println("Cat is playing");
    }

    void walk(){
        System.out.println("Cat is walking");
    }


    }

