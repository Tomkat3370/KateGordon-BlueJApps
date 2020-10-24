
/**
 * Write a description of class Module here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Module
{
    //Attributes
    private String title;
    
    private String codeNo;
    
    private int mark;
    
    private int credit;
    
    /**
     * Constructor for objects of class Module
     */
    public Module(String title, String codeNo)
    {
        this.title = title;
        this.codeNo = codeNo;
        mark = -1;
        credit = 15;
    }
    
    /**
     * Award a mark to the module
     */
    public void awardMark(int mark)
    {
        this.mark = mark;
    }
    
    /**
     * 
     */
    public int getMark()
    {
        return mark;
    }
    
    /**
     * 
     */
    public void print()
    {
        System.out.print("Module: " + title + " " + codeNo + " " + mark);
    }
}
