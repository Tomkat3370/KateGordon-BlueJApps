import java.util.*;
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
    
    private String codeNo;
    
    private Module module1;
    
    private Module module2;
    
    private Module module3;
    
    private Module module4;
    
    private int mark;
    
    private int moduleMark;
    
    private char grade;
    
    private char moduleGrade;
    
    private int finalMark;
    
    private String finalGrade;
    


    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseCode)
    {
      title = courseName;
      codeNo = courseCode;
      
      this.finalMark = 0;
      this.finalGrade = null;
      
      createModules();

    }
    
    /**
     * Method for awarding marks
     */
    public void awardMark(int mark)
    {
        this.finalMark = mark;
    }
    
    /**
     * get code number
     */
    public String getCodeNo()
    {
        return codeNo;
    }
    
    /**
     * Create modules
     */
    public void createModules()
    {
        module1 = new Module("CO452 ", " Programming Concepts");
        module2 = new Module("CO450 ", " Computer Architectures");
        module3 = new Module("CO404 ", " Cyber Threat and Risk Management");
        module4 = new Module("CO456 ", " Web Development");
    }
        
    /**
     * Add module
     */
    public void addModule(Module module, int moduleNo)
    {
        if(moduleNo == 1)
        {
            this.module1 = module;
        }
        else if(moduleNo == 2)
        {
            this.module2 = module;
        }
        else if(moduleNo == 3)
        {
            this.module3 = module;
        }
        else if(moduleNo == 4)
        {
            this.module4 = module;
        }
        else
        {
            System.out.println(" Please select module ");
        }
    }
    
    /**
     * Award a mark to a module
     */
    public void setMark(int mark, String codeNo)
    {
        if(module1.getCodeNo() == codeNo)
        {
            module1.awardMark(mark);
        }
        else if(module2.getCodeNo() == codeNo)
        {
            module2.awardMark(mark);
        }
        else if(module3.getCodeNo() == codeNo)
        {
            module3.awardMark(mark);
        }
        else if(module4.getCodeNo() == codeNo)
        {
            module4.awardMark(mark);
        }
        else
        {
            System.out.println("Please Select a Module to Award a Mark");
        }
    }
    
    /**
     * Calculate the Final Mark for the Course
     */
    public void calculateFinalMark()
    {
       int totalMark = module1.getMark() + module2.getMark() + 
            module3.getMark() + module4.getMark();
            
       finalMark = totalMark / 4;
       print();
    }
    
    /**
     * Convert marks into grades
     */
    public char grade()
    {
        if(mark == 0 - 39)
        {
            grade = 'F';
        }
        else if(mark == 40 - 49)
        {
            grade = 'D';
        }
        else if(mark == 50 - 59)
        {
            grade = 'C';
        }
        else if(mark == 60 - 69)
        {
            grade = 'B';
        }
        else if(mark == 70 - 100)
        {
            grade = 'A';
        }
        else
        {
            System.out.print("No mark awarded");
        }
    }
        

    /**
     * Print the course title and code to the output terminal.
     */
    public void print()
    {
        System.out.println("courseName " + title);
        System.out.println("courseCode " + codeNo);
        //print individual module marks
        System.out.println("Module 1 " + module1.getMark() + module1.getGrade());
        System.out.println("Module 2 " + module2.getMark() + module2.getGrade());
        System.out.println("Module 3 " + module3.getMark() + module3.getGrade());
        System.out.println("Module 4 " + module4.getMark() + module4.getGrade());
        System.out.println("Final Mark = " + finalMark);
        System.out.println("Final Grade = " + finalGrade);
    }
}