package Nov.ex_07112024_OOPs_Inheritence.Single_Inheritance;

public class Lab145_SI {
    public static void main(String[] args) {

        //Single Inheritance
        //Son will get the attributes from father
        //1 Son and 1 father

        Son s1 =new Son();
        System.out.println(s1.gold_f);
        s1.bhk2();
        s1.bhk3();

        Father f1 =new Father();

        //f1.bhk3(); //Father can't access Son's attributes
        System.out.println(f1.gold_f);

    }
}
