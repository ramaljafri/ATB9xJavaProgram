package Nov.ex12112024_SuperKeyword_Abstraction;

public class Lab157 {
}



class Ramal extends Loan {

    // abstraction is used to force something to the children - bachon pae rules lagane k liye

    @Override
    void loan50k() {

    }

    @Override
    void loan30k() {

    }
}


// abstract class has incomplete methods

abstract class Loan {
    abstract void loan50k();     // there is onlyy  declaration and no definition
    abstract void loan30k();
    void loan1L() {
        System.out.println("1L Loan is there");


    }
}





// If a class does not have Abstract class than it is called concrete class
class Person {}
class Student1 {}
class Student2 {}
class Student3 {}