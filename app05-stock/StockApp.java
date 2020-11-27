import java.util.*;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Student Name
 * @version 0.1
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';
    
    public static final String QUIT = "quit";
    public static final String ADD = "add";
    public static final String PRINT_ALL = "print all";
    public static final String REMOVE = "remove";
    public static final String PRINT_LOW_STOCK = "print low stock";
    public static final String FIND_PRODUCT = "find product";
    public static final String REPLACE_NAME = "replace name";
    public static final String DELIVERY = "delivery";
    public static final String NUMBER_IN_STOCK = "number in stock";
    public static final String SHOW_DETAILS = "show details";
    public static final String SELL = "sell";
    public static final String RUN_DEMO = "run demo";
       
    // Use to get user input
    private InputReader input = new InputReader();
    
    private StockManager manager = new StockManager();
    
    private StockDemo demo = new StockDemo(manager);
   
    /**
     * 
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = input.getString().toLowerCase();
            
            if(choice.equals(QUIT))
                 finished = true;
            else
                executeMenuChoice(choice);
        }
    }
    
    private void executeMenuChoice(String choice)
    {
     if(choice.equals(ADD))
            addProduct();
     else if(choice.equals(PRINT_ALL))
        {
            manager.printAllProduct();
            String value = input.getString();
        }
    }
    
    private void addProduct()
    {
        System.out.println("Adding new product\n");
        
        System.out.println("Please enter the product ID");
        String value = input.getString();
        int id = Integer.parseInt(value);
        
        System.out.println("Please enter the product name");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
        
        System.out.println("/n Product successfully added\n");
        
    }
    
     /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print All:   Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println
            ("    Print Low Stock:       Print all products with low stock");
        System.out.println("    Find Product:       Find a product by ID number");
        System.out.println("    Replace Name:       Replace a product name");
        System.out.println("    Delivery:       Recieve a delivery of a product");
        System.out.println("    Number in Stock:       Print the stock of a product");
        System.out.println("    Show details:       Show the details of a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println
            ("    Run Demo:       Run a demonstration of delivery and sale of all products");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        //System.out.println(CLEAR_CODE);
        System.out.println("******************************");
        System.out.println(" Stock Management Application ");
        System.out.println("    App05: by Kate Gordon");
        System.out.println("******************************");
    }
}
