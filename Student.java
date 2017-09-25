import java.util.*;

public class Student
{
    // instance variables - replace the example below with your own
   String FirstName,LastName,Nationality,Residence,Course;
   Scanner scan = new Scanner(System.in);
   int Age;
    public Student(String FirstName, String LastName, int Age, String Nationality, String Residence, String Course)
    {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
        this.Nationality = Nationality;
        this.Residence = Residence;
        this.Course = Course;
    }
    public String getName(){
        return this.FirstName +" "+ this.LastName;
    }
    public void changeName(){
        this.FirstName = scan.nextLine();
    }
    
}
