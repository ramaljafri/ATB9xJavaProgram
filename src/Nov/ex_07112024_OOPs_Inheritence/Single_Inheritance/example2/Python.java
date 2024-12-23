package Nov.ex_07112024_OOPs_Inheritence.Single_Inheritance.example2;

public class Python extends Programming {

    //Extends - is A
    // Python is a Programming language
    void print() {

        System.out.println(author);
        System.out.println(version);}

        Python(){
            System.out.println("DC - CHILD PHYTHON");
        }



    public static void main(String[] args) {

        Python p1 = new Python();
        System.out.println(p1.author);

        // Contructor Chaining = Son's DEfault Constructor will also called Father's DEfault Constructor
    }



}

