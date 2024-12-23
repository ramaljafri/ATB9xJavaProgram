package Nov.ex_08112024_Encapsulation;

public class Lab1533 {

    public static void main(String[] args) {

        Person p = new Person();

        p.setName("Rahul");
        p.setPhonenumber("1234567890");
        System.out.println(p.getName());
        System.out.println(p.getPhonenumber());



    }




}


class Person {

   private String name;
   private String phonenumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}