import java.util.ArrayList;
import java.util.*;
/**
 * StockManager class is used to manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Kate Gordon 
 * @version 01/11/2020
 */
public class StockManager
{
    // A list of the products.
    private ArrayList<Product> stock;

    /**
     * Initialise the stock manager.
     */
    public StockManager()
    {
        stock = new ArrayList<Product>();
    }

    /**
     * Add a product to the list.
     * @param item The item to be added.
     */
    public void addProduct(Product item)
    {
        if (findProduct(item.getID()) != null)
        {
            System.out.println("ID already exists, " +
                "Please enter a new ID number");
        }
        else
        {
            stock.add(item);
            System.out.println(item + " has been successfully added!");
        }
    }
    
    /**
     * Method to remove a product from
     * the stock list.
     */
    public void removeProduct(int id)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            stock.remove(product);
            System.out.println(product + " was successfully removed");
        }
        else
        {
            System.out.println("Please enter a valid id number");
        } 
    }
    
    /**
     * Method to rename a product from the StockManager
     */ 
    public void replaceName(int id, String replacementName)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.changeName(id, replacementName);
            System.out.println("Name Change Successful " 
                + product);
        }
        else
        {
            System.out.println("Invalid ID!");
        }
    }

    /**
     * Receive a delivery of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void deliverProduct(int id, int amount)
    {
        Product product = findProduct(id);
        if(product != null)
        {
            product.increaseQuantity(amount);
            System.out.println("Product Delivered : " + product);
        }
        else 
        {
            System.out.println("Product ID " + id + "NOT FOUND!!!");
        }
    }
    
    public void restockProduct()
    {
        System.out.println("Restock all products to minimum level - 10");
        for (Product product : stock)
        {
            if (product.getQuantity() <= 9)
            {
                product.setQuantity(10);
            }
        }
    }

    /**
     * Try to find a product in the stock with the given id.
     * @return The identified product, or null if there is none
     *         with a matching ID.
     */
    public Product findProduct(int id)
    {
        for(Product product : stock)
        {
            if(product.getID() == id)
            {
                return product;
            }
        }
        return null;
    }

    /**
     * Locate a product with the given ID, and return how
     * many of this item are in stock. If the ID does not
     * match any product, return zero.
     * @param id The ID of the product.
     * @return The quantity of the given product in stock.
     */
    public int numberInStock(int id)
    {
        Product product = findProduct(id);
        
        if(product == null)
        {
            return 0;
        }
        return product.getQuantity();
    }

    /**
     * Show details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void showDetails(int id)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }

    /**
     * Sell one of the given item.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int id, int amount)
    {
        Product product = findProduct(id);

        if(product != null) 
        {
            showDetails(id);
            product.sell(amount);
            showDetails(id);
        }
    }
    
    /**
     * Print details and stock levels of all the products.
     */
    public void printAllProduct()
    {
        for(Product product : stock)
        {
            System.out.println(product);
        }
    }
        
    /**
     * Print products with low stock levels.
     */
    public void printLowStock()
    {
        for(Product product : stock)
        {
            int id = 100;
             if(product.getQuantity() < 2)
            {
                System.out.println("WARNING! Low Stock");
                System.out.println(product);
            }
            id++;
        }
    }
    
     /**
     * Method to find a product from a partial name
     */
    public void search(String prefix)
    {
        int id = 100;
        
        Product product = findProduct(id);
        while(id <= 109)
        {
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
     * Print a heading.
     */
    public void printHeading()
    {
        System.out.println("\n#############");
        System.out.println("Kate's Stock List");
        System.out.println("#############\n");
    } 
}
