import java.util.Date;
import java.text.SimpleDateFormat;
/**
 * Ticket class will store information about a ticket
 * including the journey destination, price and the
 * date and time the ticket was purchased
 *
 * @author Kate Gordon
 * @version 09/01/2020
 */
public class Ticket
{
    // Attributes
    private String destination;
    
    // currency cents
    private int price;
    
    private Date today = new Date();
    
    private SimpleDateFormat formatter = 
            new SimpleDateFormat("dd/MMM/yyyy");
    
    /**
     * Constructor for objects of class Ticket setting
     * the destination and price. The date will
     * contain the current system date and time
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        
        this.price = price;
                     
        today = new Date();
        
    }
    
    /**
     * Get the Price for the current Ticket
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Get the destination for the current Ticket
     */
    public String getDestination()
    {
        return destination;
    }
    
    /**
     * Get the Date for the current Ticket
     */
    public String getDate()
    {
       return formatter.format(today); 
    }

    /**
    * Print the ticket to include destination, price and 
    */
    public void print()
    {
        System.out.println();
        System.out.println(" Ticket to " + destination );
        System.out.println(" " + price + " cents ");
        System.out.println( " Purchased " + today);
        System.out.println();
    }
}   