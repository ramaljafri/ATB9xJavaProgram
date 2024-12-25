package Nov.ex12112024_SuperKeyword_Abstraction;

public class Lab161_Interface_P2 {
    public static void main(String[] args) {

        R r= new R();
r.f1();
r.f2();
r.f3();

//I1 i1= new I1();  object cannot be created as Interface /abstract class


    }


}


class R implements I1 {


    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }
}



interface I1 {

    void f1();
    void f2();
    void f3();



        }