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
    
    public static final Ticket HIGHWYCOMBE_TICKET = new Ticket("HighWycombe", 330);
    
    // The price of the ticket requested by a customer
    private int price;
    
    // The amount of money entered by a customer (minus ticket charges).
    private int balance;
    
    // The total amount of money collected by this machine.
    private int total;
    
    private Ticket selectTicket;
    
    private SimpleDateFormat formatter = new SimpleDateFormat("dd/MMM/yyyy");
    
    private ArrayList<Ticket> ticketList;
    
    private ArrayList<Coin> coinList;
    
    /**
     * Create a machine that issues tickets of the given price.
     */
    public TicketMachine()
    {
        balance = 0;
        total = 0;
        
        selectTicket = null;
        
        ticketList = new ArrayList<Ticket>();
        coinList = new ArrayList<Coin>();
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
     * Select a ticket to a destination for a specific price
     */
    public void selectTicket(String destination)
    {
        if(selectTicket == AYLESBURY_TICKET)
        {
            AYLESBURY_TICKET.print();
        }
        else if (selectTicket == AMERSHAM_TICKET)
        {
            AMERSHAM_TICKET.print();
        }
        else if (selectTicket == HIGHWYCOMBE_TICKET)
        {
            HIGHWYCOMBE_TICKET.print();
        }
        else
        {
            System.out.println(" please select a destination");
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
            System.out.println("# Ticket " + selectTicket.getDestination());
            System.out.println("# " + selectTicket.getPrice() + " cents.");
            System.out.println("# " + selectTicket.getDate());
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
    
    /**
     * Print all available tickets to the user
     */
    
    public void printAllTickets()
    {
       System.out.println(" The following three destinations are available ");
       System.out.println(); 
       AYLESBURY_TICKET.print();
       System.out.println();
       AMERSHAM_TICKET.print();
       System.out.println();
       HIGHWYCOMBE_TICKET.print();
       System.out.println();
       System.out.println(" Please select your ticket destination ");
    }
    
    /**
     * Add 20 cent coin
     */
    public void insert20centCoin()
    {
        balance = balance + 20;
    }
    
    /**
     * Add 10 cent coin
     */
    public void insert10centCoin()
    {
        balance = balance + 10;
    }
    
    /**
     * Add 100 cent coin
     */
    public void insert100centCoin()
    {
        balance = balance + 100;
    }
    
    /**
     * Add 200 cent coin
     */
    public void insert200centCoin()
    {
        balance = balance + 200;
    }
}
