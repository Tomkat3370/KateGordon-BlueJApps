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

    public static final String ADD = "ADD";
    public static final String REMOVE = "REMOVE";
    public static final String PRINT_ALL = "PRINT ALL";
    public static final String DELIVER = "DELIVER";
    public static final String SELL = "SELL";
    public static final String LOW_STOCK = "LOW STOCK";
    public static final String SEARCH = "SEARCH";
    public static final String RE_STOCK = "RESTOCK";
    public static final String QUIT = "QUIT";

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
            String choice = input.getString().toUpperCase();
                        
            if(choice.equals(QUIT))
                finished = true;
            else
                executeMenuChoice(choice);
        }
    }

    /**
     * Method call for menu choices
     */
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
        else if(choice.equals(LOW_STOCK))
        {
            manager.printLowStock();
        }
        else if(choice.equals(SEARCH))
        {
            searchProduct();
        }
        else if(choice.equals(RE_STOCK))
        {
            manager.restockProduct();
        }
        else
        {
            System.out.println("Invalid choice! Please choose from the menu");
        }
    }

    /**
     * Method to add a product using the user interface
     */
    private void addProduct()
    {
        System.out.println("Adding new product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        System.out.println("Please enter the product name");
        String name = input.getString();
        
        if (id != 0 && !name.isBlank())
        {
            Product product = new Product(id, name);
            manager.addProduct(product);
        }
        else
        {
            System.out.println("Error! Please ensure all " +
                "fields are filled in.");
        }
    }

    /**
     * Method to remove a product using the user interface
     */
    private void removeProduct()
    {
        System.out.println("Remove a product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();

        manager.removeProduct(id);        
    }

    /**
     * Method to deliver a set amount of a product using the user 
     * interface
     */
    private void deliverProduct()
    {
        System.out.println("Delivery of a product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();
        System.out.println("Please enter amount");
        int amount = scanner.nextInt();

        manager.deliverProduct(id, amount);         
    }

    /**
     * Method to sell a set amount of a product using the user interface
     */
    private void sellProduct()
    {
        System.out.println("Sell a product\n");

        System.out.println("Please enter the product ID");
        int id = scanner.nextInt();
        System.out.println("Please enter amount");
        int amount = scanner.nextInt();

        manager.sellProduct(id, amount);         
    }

    /**
     * Method to search for a product by a partial name using the 
     * user interface
     */
    private void searchProduct()
    {
        System.out.println("Search for an exsisting product\n");

        System.out.println("Please enter full or partial product name\n");
        String prefix = input.getString();

        demo.search(prefix);
    }

    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("                Main Menu\n");
        System.out.println("     " + ADD + "            Add a new product");
        System.out.println("     " + REMOVE + "         Remove an old product");
        System.out.println("     " + PRINT_ALL + "      Print all products");
        System.out.println("     " + DELIVER + 
            "        Recieve a delivery of a product");
        System.out.println("     " + SELL + "           Sell a product");
        System.out.println("     " + LOW_STOCK +
            "       Print all products with low stock");
        System.out.println("     " + SEARCH +
            "         Search for a product using a prefix");
        System.out.println("     " + RE_STOCK + "        Restock products");
        System.out.println("     " + QUIT + "           Quit the program");
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
