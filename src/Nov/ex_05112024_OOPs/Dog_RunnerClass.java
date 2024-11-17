package Nov.ex_05112024_OOPs;

public class Dog_RunnerClass {
    public static void main(String[] args) {

        Dog d1= new Dog();
        d1.name = "Tommy";
        d1.breed = "German Shepherd";
        d1.age = 5;
        d1.size = 4;
        d1.color = "Black";
        System.out.println(d1.name);
        System.out.println(d1.breed);
        System.out.println(d1.age);
        System.out.println(d1.size);
        System.out.println(d1.color);

        d1.sleep();
        d1.eat();
        d1.play();
        d1.sit();

        Dog d2 =new Dog();
        d2.name = "Bella";
        d2.breed = "Poodle";

        d2.age = 3;
        d2.size = 2;
        d2.color = "White";
        System.out.println(d2.name);
        System.out.println(d2.breed);
        System.out.println(d2.age);
        System.out.println(d2.size);
        System.out.println(d2.color);
        d2.sleep();
        d2.eat();
        d2.play();
            d2.sit();

            Dog d3 = new Dog();
            d3.name = "Charlie";
        System.out.println(d3.name);
            Dog d4 = new Dog();
            d4.name = "Max";
        System.out.println(d4.name);
            Dog d5 = new Dog();
            d5.name = "Lucy";
        System.out.println(d5.name);

    }
}
