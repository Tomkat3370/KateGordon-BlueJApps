import java.util.*;
/**
 * Enumeration class CoinValues stores the value of the coins
 * to be recognised by the TicketMachine
 * 
 *
 * @author Kate Gordon
 * @version 09/10/2020
 */

public enum CoinValues
{
    P10 (10),
    P20 (20),
    P100 (100),
    P200 (200);
    
    private final int coinValue;
    
    private ArrayList<Coin> coinList; 
    
    private CoinValues(int coinValue)
    
    {
        this.coinValue = coinValue;
        
        coinList = new ArrayList<Coin>();
    }
    
    public int getValue()
    {
        return coinValue;
    }
    
    public void print()
    {
        System.out.println(coinValue + "CoinValues");
    }   
}
