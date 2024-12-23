package Nov.ex_07112024_OOPs_Inheritence.multilevel;

public class Lab147_MultiLevel {
    public static void main(String[] args) {

        Child c1 = new Child();

        c1.home();
        c1.gf();
        c1.c();
        c1.f();

        Father f1 = new Father();

        f1.f();
        f1.home();
        f1.gf();
        Grandfather g1 = new Grandfather();

        g1.home();
        g1.gf();

    }
}
