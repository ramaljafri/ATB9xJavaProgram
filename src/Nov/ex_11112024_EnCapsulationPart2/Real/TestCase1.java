package Nov.ex_11112024_EnCapsulationPart2.Real;

public class TestCase1  extends BaseClass {


public TestCase1() {

 //   super(); // Super keyword is used to call the parent class constructor
 // this - current object

    System.out.println("DC ------- TC1");


}

public void startTestCase()
{
    opentheBrowser("chrome");
    closeTheBrowser();

}

    @Override
    public void setBrowser(String browser, boolean isAuth) {

        System.out.println("Own Logic");

        super.setBrowser(browser, isAuth);
    }

    @Override
    public String toString() {
        return "TestCase1{}";
    }
}
