package Nov.ex_08112024_Polymorphism.MethodOverRiding;

public class Lab151 {

    public static void main(String[] args) {
       Ramal r = new Ramal() ;
       r.home();
Father f = new Father();
f.home();

// Dynamic Dispatch
        Father f1= new Ramal();

f1.home();



    }
}


class Father {

    void home() {
        System.out.println("Father's home 2BHK ");
    }

}

class Ramal extends Father {

    @Override
  void home() {
        System.out.println("Ramal's home 3BHK ");
    }


}