import java.util.*;
import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * modified by Kate Gordon
 * dated 01/11/2020
 */
public class StockDemo
{
    //Initial Stock List
    public static final String Product_FIRST = "Stradivarous Violin";
    public static final String Product_SECOND = "Casio Keyboard";
    public static final String Product_THIRD = "Alexander FrenchHorn";
    public static final String Product_FOURTH = "Music Stand";
    public static final String Product_FIFTH = "Violin Strings";
    public static final String Product_SIXTH = "Guitar Strings";
    public static final String Product_SEVENTH = "FrenchHorn Mute";
    public static final String Product_EIGHTH = "Violin Resin";
    public static final String Product_NINTH = "Violin Stand";
    public static final String Product_TENTH = "Guitar Stand";
    // The stock manager.
    private StockManager manager;

    private Random generator;
    
    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
        generator = new Random();
        this.manager = manager;

        //choose products with full name for easy searching and create 10

    }

    /**
    * Provide a very simple demonstration of how a StockManager
    * might be used. Details of one product are shown, the
    * product is restocked, and then the details are shown again.
    */
    public void runDemo()
    {
       // Show details of all of the products.
       manager.printAllProduct();

       demoDelivery();
       demoSell();
    }

    /**
     * Provide a simple demonstration of how a delivery
     * increases the stock of all products.
     */
    private void demoDelivery()
    {
        printHeading("Delivery");

        int amount = 0;

        for(int id = 100; id <= 109; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.deliverProduct(id, amount);
            amount++;
        }
    
    }
   
    /**
     * Provide a simple demonstration of how selling
     * products decreases the stock.
     */
    private void demoSell()
    {
        printHeading("Sell");
        
        int amount = 0;
    
        for(int id = 100; id <= 109; id++)
        {
            amount = generator.nextInt(7) + 1;
            manager.sellProduct(id, amount);
            amount++;
        }
    }
    
    /**
     * Method to find a product from a partial name
     */
    public void search(String prefix)
    {
        int id = 100;
        
        while(id <= 109)
        {
            Product product = manager.findProduct(id);
            String name = product.getName();
            name = name.toLowerCase();
            prefix = prefix.toLowerCase();
            
            if(name.contains(prefix))
            {
                System.out.println(product);
            }
            id ++;
        }
        
    }
    
    /**
     * Print a heading to make it easier to
     * differentiate the demonstrations in
     * demo mode.
     */
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demonstrating Product" + verb);
        System.out.println();
    }
    
}
