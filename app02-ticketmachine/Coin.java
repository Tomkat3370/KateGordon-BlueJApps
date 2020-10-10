
/**
 * Write a description of class Coin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Coin
{
    // the width of the coin in milimeters(mm)
    private int width;
    
    // the weight of the coin in miligrams (mg)
    private int weight;
    
    // the value of the coin based on available coin values
    private  CoinValues coinValue;
  
      
    /**
     * Constructor for objects of class Coin
     */
    public Coin(CoinValues coinValue)
    {
       this.coinValue = coinValue;
    }
    
    /**
     * Constructor for objects of class Coin
     */
    public Coin(CoinValues coinValue, int width, int weight)
    {
        this.width = width;
        this. weight = weight;
    }
}
