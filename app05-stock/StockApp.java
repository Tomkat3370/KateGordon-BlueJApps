import java.util.Scanner;
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Kate Gorodn
 * @version 02/12/2020
 */
public class StockApp
{
    public static final char CLEAR_CODE = '\u000c';

    public static final String ADD = "add";
    public static final String REMOVE = "remove";
    public static final String PRINT_ALL = "print all";
    public static final String DELIVER = "deliver";
    public static final String SELL = "sell";
    public static final String PRINT_LOW_STOCK = "print low stock";
    public static final String FIND_PRODUCT = "find product by ID";
    public static final String SEARCH = "search for a product";
    public static final String REPLACE_NAME = "replace name";
    public static final String NUMBER_IN_STOCK = "number in stock";
    public static final String SHOW_DETAILS = "show details";
    public static final String RE_STOCK = "re-stock";
    public static final String RUN_DEMO = "run demo";
    public static final String QUIT = "quit";

    Scanner scanner = new Scanner(System.in);

    // Use to get user input
    private InputReader input = new InputReader();;

    private StockManager manager = new StockManager();

    private StockDemo demo = new StockDemo(manager);

    /**
     * Method to run the program and display the menu.
     */
    public void run()
    {
        boolean finished = false;

        while(!finished)
        {
            printHeading();
            printMenuChoices();

            System.out.println("Please enter your choice > ");
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
        {
            addProduct();
        }
        else if(choice.equals(REMOVE))
        {
            removeProduct();
        }
        else if(choice.equals(PRINT_ALL))
        {
            manager.printAllProduct();
        }
        else if(choice.equals(DELIVER))
        {
            deliverProduct();
        }
        else if(choice.equals(SELL))
        {
            sellProduct(); 
        }
        else if(choice.equals(PRINT_LOW_STOCK))
        {
            manager.printLowStock();
        }
        else if(choice.equals(FIND_PRODUCT))
        {
            findProduct();
        }
        else if(choice.equals(SEARCH))
        {
            search();
        }
        else if(choice.equals(REPLACE_NAME))
        {
            replaceName();
        }
        else if(choice.equals(NUMBER_IN_STOCK))
        {
            numberInStock();
        }
        else if(choice.equals(SHOW_DETAILS))
        {
            showDetails();
        }
        else if(choice.equals(RE_STOCK))
        {
            manager.restockProduct();
        }
        else if(choice.equals(RUN_DEMO))
        {
            demo.runDemo();
        }
        else
        {
            System.out.println("Invalid choice! Please choose from the menu");
        }
    }

    private void addProduct()
    {
        System.out.println("Adding new product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        System.out.println("Please enter the product name");
        String name = input.getString();
        
        Product product = new Product(id, name);
        manager.addProduct(product);
    }

    private void removeProduct()
    {
        System.out.println("Removing a product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        manager.removeProduct(id);        
    }

    private void deliverProduct()
    {
        System.out.println("Delivery of a product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();
        System.out.println("Please enter amount");
        int amount = scanner.nextInt();

        manager.deliverProduct(id, amount);         
    }

    private void sellProduct()
    {
        System.out.println("Sell a product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();
        System.out.println("Please enter amount");
        int amount = scanner.nextInt();

        manager.sellProduct(id, amount);         
    }

    private void findProduct()
    {
        System.out.println("Find a product by ID number\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        manager.findProduct(id);         
    }

    private void search()
    {
        System.out.println("Search for an exsisting product\n");

        System.out.println("Please enter full or partial product name\n");
        String prefix = input.getString();

        demo.search(prefix);
    }

    private void replaceName()
    {
        System.out.println("Replace a product name\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        System.out.println("Please enter the new name for this product");
        String changeName = input.getString();

        manager.replaceName(id, changeName);         
    }

    private void numberInStock()
    {
        System.out.println("View amount of stock for a product");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        manager.numberInStock(id);        
    }

    private void showDetails()
    {
        System.out.println("Show the details of a product");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        manager.showDetails(id);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    If you haven't used this system before, ");
        System.out.println("    run the demonstration to see how it works\n");
        System.out.println("    Run Demo:           " + 
            "Run a demonstration of delivery");
        System.out.println("                        " +
            "and sale of all products\n");
        System.out.println("                Main Menu");
        System.out.println("    Add:                Add a new product");
        System.out.println("    Remove:             Remove an old product");
        System.out.println("    Print All:          Print all products");
        System.out.println("    Deliver:            " +
            "Recieve a delivery of a product");
        System.out.println("    Sell:               Sell a product");
        System.out.println("    Print Low Stock:    " + 
            "Print all products with low stock");
        System.out.println("    Find Product:       " +
            "Find a product by ID number");    
        System.out.println("    Replace Name:       " +
            "Replace a product name");
        System.out.println("    Number in Stock:    " +
            "Print the stock of a product");
        System.out.println("    Show details:       " + 
            "Show the details of a product");    
        System.out.println("    Quit:               Quit the program");
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
