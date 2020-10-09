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

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseCode)
    {
      title = courseName;
      code = courseCode;  
    }

    /**
     * Print the course title and code to the output terminal.
     */
    public void print()
    {
        System.out.println("courseName" + title);
        System.out.println ("courseCode" + code); 
    }
}