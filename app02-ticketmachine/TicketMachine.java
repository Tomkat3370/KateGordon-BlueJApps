import java.util.*;
import java.text.SimpleDateFormat;
/**
 * TicketMachine models a ticket machine that issues
 * flat-fare tickets.
 *  * The price of a ticket is specified via the TicketMachine.
 * Instances will check to ensure that a user only enters
 * sensible amounts of money, and will only print a ticket
 * if enough money has been input.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 * 
 * Modified by Kate Gordon
 * Dated 09/10/2020
 */
public class TicketMachine
{
    public static final Ticket AYLESBURY_TICKET = new Ticket("Aylesbury", 220);
    
    public static final Ticket AMERSHAM_TICKET = new Ticket("Amersham", 300);
    
    public static final Ticket HIGHWYCOMBE_TICKET = new Ticket("High Wycombe", 330);
         
    // The price of a ticket from this machine.
    private int price;
    
    // The amount of money entered by a customer (minus ticket charges).
    private int balance;
    
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket selectTicket;
    
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyy");
    
    private ArrayList<Ticket> ticketList;
    
    private ArrayList<Coin> coinList;


    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        price = 0;
        balance = 0;
        total = 0;
        
        selectTicket = null;
        
        ticketList = new ArrayList<Ticket>();
        coinList = new ArrayList<Coin>();
    }
        
    /**
     * Add a coin to this ticket machine.
     * So the machine can recognise the coin value when inserted by a customer
     */
    public void addCoin(Coin newCoin)
    {
        {
            coinList.add(newCoin);
        }
    }
    
     /**
     * @Return The price of a ticket.
     */
    public int getPrice()
    {
        return price;
    }

    /**
     * Return The amount of money already inserted for the
     * next ticket.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Receive an amount of money from a customer.
     * Check that the amount is sensible.
     */
    public void insertMoney(int amount)
    {
        if(amount > 0) 
        {
            balance = balance + amount;
        }
        else 
        {
            System.out.println("Use a positive amount rather than: " +
                               amount);
        }
    }
    
    /**
     * Recieve an amount of money in coins from a customer.
     * Check the amount is sensible.
     */
    public void insertCoin(int value)
    {
       {
            balance = balance + value;
       }        
    }
    
    /**
     * Purchase a ticket to a destination for a specific price
     */
    public void purchaseTicket(String destination)
    {
        if (selectTicket == AYLESBURY_TICKET)
        {
            System.out.println(" Please pay " + price + " cents");
        }
        else
        {
            System.out.println(" Please select ticket " + ticketList);
        }
        if (selectTicket == AMERSHAM_TICKET)
        {
          System.out.println(" Please pay " + price + " cents");
        }
        else
        {
            System.out.println(" Please select ticket " + ticketList);
        }            
        if (selectTicket == HIGHWYCOMBE_TICKET)
        {
            System.out.println(" Please pay " + price + " cents");
        }
        else
        {
            System.out.println(" Please select ticket " + ticketList);
        } 
    }
    
    /**
     * Print a ticket if enough money has been inserted, and
     * reduce the current balance by the ticket price. Print
     * an error message if more money is required.
     */
    public void printTicket()
    {
        if(balance >= price) 
        {
            // Simulate the printing of a ticket.
            System.out.println("##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            System.out.println();

            // Update the total collected with the price.
            total = total + price;
            // Reduce the balance by the price.
            balance = balance - price;
        }
        else 
        {
            System.out.println("You must insert at least: " +
                               (price - balance) + " more cents.");
                    
        }
    }

    /**
     * Return the money in the balance.
     * The balance is cleared.
     */
    public int refundBalance()
    {
        int amountToRefund;
        amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
