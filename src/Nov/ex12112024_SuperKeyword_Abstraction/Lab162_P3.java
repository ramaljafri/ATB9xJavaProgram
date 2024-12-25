package Nov.ex12112024_SuperKeyword_Abstraction;

public class Lab162_P3 {
}


class Child1 extends Father1, Mother1 { // multiple Inheritance using inheritance-- Solved

    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void same() {
        System.out.println("Only 1 same mthod");
    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }
}


interface Father1 {

    void f1();
    void f2();
void same();
}


interface Mother1 {

    void f3();
    void f4();
    void same();


}
