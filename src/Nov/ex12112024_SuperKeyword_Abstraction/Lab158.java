package Nov.ex12112024_SuperKeyword_Abstraction;

public class Lab158 {

    public static void main(String[] args) {
        Child c = new Child();
        c.loan50k();  // looks like child is given all the loans of father without the world knowing that it is father's loan that child paid
        c.Loan25k();


    }




}


class Child extends Father {

    @Override
    void loan50k() {
        System.out.println("50k loan was taken by Father but paid by Child");
    }
}

abstract class Father {
    abstract void loan50k();

    void Loan25k () {
        System.out.println("25k loan already paid by Father");
    }

}