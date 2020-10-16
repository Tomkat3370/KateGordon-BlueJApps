import java.util.*;

/**
* Coin class stores the weight of the coins for the TicketMachine
* to recognise the coinValue from the weight of the coin inserted.
*
* @author Kate Gordon
* @version 15/10/2020
*/
public class Coin
{
    // the weight of the coin in miligrams (mg)
    private int weight;
    
    // the value of the coin based on available coin values
    private  CoinValues coinValue;
             
    /**
     * Constructor for objects of class Coin
     */
    public Coin()
    {
       this.coinValue = coinValue;
       
       if (coinValue == CoinValues.P10)
       {
           weight = 100;
       }
       else if (coinValue == CoinValues.P20)
       {
           weight = 200;
        }
       else if (coinValue == CoinValues.P100)
       {
           weight = 1000;
        }
       else //CoinValues.P200
       {
           weight = 2000;
        }
    }
    
    /**
     * Get coinValue from the coins weight
     */
    public int getCoinValue()
    {
        return coinValue.getValue();
    }
     
    /**
     * Print the coinValue
     */
    public void print()
    {
        System.out.println(coinValue + "inserted");
    }
}
