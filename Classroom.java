import java.util.*;
/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom
{
    Facilitator faculty_lead = new Facilitator("Stephen");
    AC aircon = new AC();
    ArrayList<Student> attendance = new ArrayList<Student>();
    int temp = 20;
    public Classroom()
    {
        
    }
    public static void main (String [] args){
            System.out.println("Classroom Detected");
        }
    public void FillAttendance(){
        attendance.add(new Student("Abdulrahman","Diwani",19,"Tanzanian","Off-Campus","Computing"));
        attendance.add(new Student("Faith","Mbatha",19,"Kenyan","Piment","Computing"));
        attendance.add(new Student("Cyrose","Kyalo",19,"Kenyan","Paradise","Computing"));
        attendance.add(new Student("Mehdi","Oulmakki",19,"Moroccan","Off-Campus","Computing"));
    }
}
