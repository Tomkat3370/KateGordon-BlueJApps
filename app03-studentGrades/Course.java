/**
 * Course represents the chosen courses in an educational institution.
 *
 * @author Derek Peacock
 * @version 0.1
 * edited by Kate Gordon
 * dated 03/10/2020
 */
public class Course
{
    private String title;
    
    private String code;
    
    private Module module1;
    
    private Module module2;
    
    private Module module3;
    
    private Module module4;
    
    private int finalMark;
    
    private String finalGrade;
    
    private boolean 

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseCode)
    {
      title = courseName;
      code = courseCode;
      
      this.finalMark = 0;
      this.finalGrade = null;
      
      createModules();
      
      passed = false;
      completed = false;
    }
    
    public void awardMark(int mark)
    {
        this.mark = mark;
    }
    
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * 
     */
    public void createModules()
    {
        module1 = new Module("CO452 ", " Programming Concepts")
        module2 = new Module("CO452 ", " Programming Concepts")
        module3 = new Module("CO452 ", " Programming Concepts")
        module4 = new Module("CO452 ", " Programming Concepts")
    }
        
    /**
     * Add module
     */
    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
            module = module1;
        }
    }
    
    /**
     * 
     */
    public void setMark(int mark, String codeNo)
    {
        if (module1.getCodeNo() == codeNo)
        {
            module1.awardMark(mark);
        }
    }
    
    public void calculateFinalMark()
    {
       int totalMark = module1.getMark() + module2.getMark() + 
            module3.getMark() + module4.getMark();
            
       finalMark = totalMark / 4;
       print();
    }
    //create course mark

    /**
     * Print the course title and code to the output terminal.
     */
    public void print()
    {
        System.out.println("courseName" + title);
        System.out.println ("courseCode" + code);
        //print individual module marks
        System.out.println("Final Mark = " + finalMark);
    }
}