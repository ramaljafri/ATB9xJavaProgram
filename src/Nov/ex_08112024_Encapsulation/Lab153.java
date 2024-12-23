package Nov.ex_08112024_Encapsulation;

public class Lab153 {

    public static void main(String[] args) {
boolean isAuth;
        VMOLogin vmoLogin= new VMOLogin("admin","password123");
        System.out.println(vmoLogin.password);

        GoodVMOLogin vmoLogin1 = new GoodVMOLogin("goodadmin","Goodpassword123");
     //   System.out.println( vmoLogin1.password);

        String Pass = vmoLogin1.getPassword(true);
        System.out.println( Pass);


        vmoLogin1.setPassword("SetMyPassword", true);
     Pass = vmoLogin1.getPassword(true);
        System.out.println( Pass);
    }


}

/// Hide your data variables and give them controlled access

class VMOLogin {

public String username;
public String password;

public VMOLogin (String username, String password)

{
    this.username = username;
    this.password=password;

}
}

class GoodVMOLogin {

    private String username;
    private String password;


            // private ensure variable is available within the class
    public GoodVMOLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }


//public String GiveMePassword(Boolean isAuth) {
//        if (isAuth) {
//            return password;
//        } else {
//            return "not allowed";
//        }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(boolean isAdmin ) {

       if (isAdmin) {
           return password;
       } else {
           return "not allowed";
       }


    }

    public void setPassword(String password, boolean  isAdmin) {
        if (isAdmin) {
            this.password = password;
        } else {
            System.out.println("not allowed");
        }
    }

    }
