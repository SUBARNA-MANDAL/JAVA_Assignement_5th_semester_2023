package Student;

public class Student {
    String Name;
    double rollno;
    public void put_all(String na,double roll){
        Name = na;
        rollno = roll;
    }
    public void get_all(){
        System.out.println("The Student name is : "+Name);
        System.out.println("Roll no : "+rollno);
    }
}
