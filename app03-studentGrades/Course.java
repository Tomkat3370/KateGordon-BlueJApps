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
    
    private

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, String courseCode)
    {
      title = courseName;
      code = courseCode;  
    }
    
    /**
     * Add a student to this LabClass.
     */
    public void enrollStudent(Student newStudent)
    {
        if(students.size() == capacity) 
        {
            System.out.println("The class is full, you cannot enrol.");
        }
        else 
        {
            students.add(newStudent);
        }
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