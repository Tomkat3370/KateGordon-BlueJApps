import java.util.*;
import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 * @modified by Kate Gordon
 * @dated 01/11/2020
 */
public class StockDemo
{
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
     * find a product from a partial name
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
    
    public void printHeading(String verb)
    {
        System.out.println();
        System.out.println("Demonstrating Product" + verb);
        System.out.println();
    }
    
}
