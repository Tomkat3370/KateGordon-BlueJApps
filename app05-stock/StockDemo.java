import java.util.*;
import java.util.Random;
import java.io.IOException;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * modified by Kate Gordon
 * dated 03/12/2020
 */
public class StockDemo
{
    public static final int FIRST_ID = 100;
    public static final int LAST_ID = 120;
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
        manager.addProduct(new Product(100, "Stradivarous Violin"));
        manager.addProduct(new Product(101, "Casio Keyboard"));
        manager.addProduct(new Product(102, "Alexander FrenchHorn"));
        manager.addProduct(new Product(103, "Music Stand"));
        manager.addProduct(new Product(104, "Violin Strings"));
        manager.addProduct(new Product(105, "Guitar Strings"));
        manager.addProduct(new Product(106, "FrenchHorn Mute"));
        manager.addProduct(new Product(107, "Violin Resin"));
        manager.addProduct(new Product(108, "Violin Stand"));
        manager.addProduct(new Product(109, "Guitar Stand"));
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
        int id = FIRST_ID;
        
        while(id <= LAST_ID)
        {
            Product product = manager.findProduct(id);
            if(product != null)
            {
                String name = product.getName().toLowerCase();
                prefix = prefix.toLowerCase();
            
                if(name.contains(prefix))
                {
                System.out.println(product);
                }

                id ++;
            }

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
