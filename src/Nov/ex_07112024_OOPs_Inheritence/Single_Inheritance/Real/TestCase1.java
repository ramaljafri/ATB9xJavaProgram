package Nov.ex_07112024_OOPs_Inheritence.Single_Inheritance.Real;

public class TestCase1 extends Common_BaseTest{

    public TestCase1() {
        System.out.println("DC- Child");
    }

    void testcase()
    {
        startBrowser();
        closeBrowser();
        readExcel();

    }
}
