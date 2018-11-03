
public class DiceController {
	
	private static DiceController obj = new DiceController();
	  public static DiceController getInstance1()
	  {
	    if (obj == null)
	    {
	      obj = new DiceController();
	    }
	    return obj;
	  }
	  
	  public void showDistribution(int dice1_sides, int dice2_sides)
	  {
	    for(int i=0; i<36; i++)
	    {
	      int total = roll(dice1_sides) + roll(dice2_sides);;
	      System.out.printf("\nroll %d --> %s",+(i+1),repeat("#", total));
	    } 
	  }
	  
	  private static String repeat(String str, int times) 
	  {
	        return new String(new char[times]).replace("\0", str);
	  }
	  
	  private int roll(int sides)
	  {
	    return ((int)(Math.random()*sides)+1);
	  }
}
