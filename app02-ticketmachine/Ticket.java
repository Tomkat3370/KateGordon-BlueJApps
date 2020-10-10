import java.util.Date;

/**
 * Write a description of class Ticket here.
 *
 * @author Kate Gordon
 * @version 09/01/2020
 */
public class Ticket
{
    // Attributes
    
    private String destination;
    private int price;
    private Date purchasedDateTime;
    
        /**
     * Constructor for objects of class Ticket setting
     * the destination and price. The date will
     * contain the current system date and time
     */
    public Ticket(String destination, int price)
    {
        this.destination = destination;
        this.price = price;
        
        purchasedDateTime = new Date();
    }
    
    /**
     * Print the ticket to include destination, price and 
     */
    public void print()
    {
        System.out.println(" Ticket " + destination +
            " Price " + price + " Purchased " + purchasedDateTime);
    }
}   