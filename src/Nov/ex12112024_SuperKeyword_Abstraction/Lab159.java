package Nov.ex12112024_SuperKeyword_Abstraction;

public class Lab159 {

    public static void main(String[] args) {

        WagonR r = new WagonR();

        r. drive();
Tesla t = new Tesla();
t.drive();
// so engine is the same but we can have a own strating and stopping implementation

      //  Engine e = new Engine(); // object cannot be created for abstract class


    }

//Abstraction can also be implemented by using Interfaces


}



class Tesla extends Engine{

    void drive() {
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Starting the Electric Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping the Electric Engine");
    }
}

class WagonR extends Engine {

void drive() {
    startEngine();
    stopEngine();


}


    @Override
    void startEngine() {
        System.out.println("Starting Carrrrr");
    }

    @Override
    void stopEngine() {
        System.out.println("Stopping Carrrrr");
    }
}
// abstract class cannot be final in nature . Final classes cannot be inherited

abstract class Engine {

    abstract void startEngine();
    abstract void stopEngine();


}