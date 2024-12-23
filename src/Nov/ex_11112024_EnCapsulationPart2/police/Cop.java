package Nov.ex_11112024_EnCapsulationPart2.police;

public class Cop {
  private int gun;
   public String iCard;

    //Parameterized Constructor
    public Cop(int gun)
        {
        this.gun = gun;
    }

  protected void canIShoot()
    {
        System.out.println("Yes! you can!");
    }
}
