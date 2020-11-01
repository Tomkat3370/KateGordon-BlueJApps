import java.util.*;
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

    /**
     * Create a StockManager and populate it with a few
     * sample products.
     */
    public StockDemo(StockManager manager)
    {
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
    public void demoDelivery()
    {
        // Show details of all of the products.
        manager.printAllProduct();
        
        manager.delivery(100, 1);
        manager.delivery(101, 3);
        manager.delivery(102, 2);
        manager.delivery(103, 5);
        manager.delivery(104, 10);
        manager.delivery(105, 5);
        manager.delivery(106, 3);
        manager.delivery(107, 12);
        manager.delivery(108, 4);
        manager.delivery(109, 4);
        
        manager.printAllProduct();
    }
    
     /**
     * Get the product with the given id from the manager.
     * An error message is printed if there is no match.
     * @param id The ID of the product.
     * @return The Product, or null if no matching one is found.
     */
    public Product getProduct(int id)
    {
        Product product = manager.findProduct(id);

        if(product == null) 
        {
            System.out.println("Product with ID: " + id +
                " is not recognised.");
        }
        return product;
    }

    /**
     * @return The stock manager.
     */
    public StockManager getManager()
    {
        return manager;
    }
}
