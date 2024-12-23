package Nov.ex_11112024_EnCapsulationPart2;


import Nov.ex_11112024_EnCapsulationPart2.Real.BaseClass;
import Nov.ex_11112024_EnCapsulationPart2.Real.TestCase1;

public class Lab154_Ecap_AM {

    // public , private , protected

    public static void main(String[] args) {

TestCase1 tc1 = new TestCase1();  // Dynamic Dispatch - Father reference and Son Object
tc1.setBrowser("chrome" , true);
tc1.getBrowser() ;
tc1.startTestCase();


    }


}
