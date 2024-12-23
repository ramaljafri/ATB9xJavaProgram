package Nov.ex_11112024_EnCapsulationPart2.Real;

public class BaseClass {
    // Everything that is common will be added to baseclass


    private String browser;

    BaseClass() {

        System.out.println("DC- BaseClass-- Parent Constructor");

    }

    BaseClass(String b) {
        System.out.println("PC - BaseClass");

    }


    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAuth) {
        if (isAuth) {
            this.browser = browser;

        } else {

            System.out.println("Not Allowed");

        }

    }



    void opentheBrowser() {
        System.out.println("Open the Browser");

    }

    void opentheBrowser(String browserName) {
        System.out.println("Open the Browser" + browserName);

    }

void closeTheBrowser() {
    System.out.println("Close the Browser");

}


}