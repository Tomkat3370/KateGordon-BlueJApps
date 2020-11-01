import java.util.*;
/**
 * Module represents the modules within a students chosen Course
 *
 * @author Kate Gordon
 * @version 26/10/2020
 */
public class Module
{
    //Attributes
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    private boolean completed;
    
    private boolean passed;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        
        mark = -1;
        credit = 0; 
        
        completed = false;
        passed = false;
    }
    
    /**
     * Get module title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Get the module code number
     */
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * Award a mark to the module
     */
    public void awardMark(int mark)
    {
        this.mark = mark;
    }
    
    /**
     * Retrieve the current mark for a module
     */
    public int getMark()
    {
        return mark;
    }
    
    public boolean isComplete()
    {
        if(mark >= 0)
        {
            this.credit = credit;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isPassed()
    {
        if(mark >= 40)
        {
            credit = 15;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    /**
     * Retrieve credit
     */
    public int getCredit()
    {
        return credit;
    }
    
    /**
     * Print the module information
     */
    public void print()
    {
        System.out.print("Module: " + title + " " + codeNo + " " 
            + mark + "%");
    }
}
