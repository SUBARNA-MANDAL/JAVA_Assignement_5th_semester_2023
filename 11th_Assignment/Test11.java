/*

Create a class Student containing Name & Roll No as data members. Create a sub-class Test_marks containing Marksl, Marks2 as data members. Create an Interface CCA_Score containing CCA_credit data member and show cca cred) method.
Create a sub-class Sem Result that inherits from Test marks and implements CCA_ Score interface. Define switable get data() and put data() methods in different classes.
Create objects of Sem Result class to display all details of2 students.


 */

class Student{
    String Name;
    double rollno;
    void put_all(String na,double roll){
        Name = na;
        rollno = roll;
    }
    void get_all(){
        System.out.println("The Student name is : "+Name);
        System.out.println("Roll no : "+rollno);
    }
}
class Test_Marks extends Student{
    float marks1,marks2;
    void put_all(String na,double roll,float m1,float m2){
        super.put_all(na, roll);
        marks1 = m1;
        marks2 = m2;
    }
    void get_all(){
        super.get_all();
        System.out.println("Marks1 = "+marks1);
        System.out.println("Marks2 ="+marks2);
    }
}
interface CCA_Score{
    static int CCA_credit = 5;
    void show_CCA_cred();
}
class sem_result extends Test_Marks implements CCA_Score{
    void put_all(String na,double roll,float m1,float m2){
        super.put_all(na, roll, m1, m2);
    }
    void get_all(){
        super.get_all();
        show_CCA_cred();
    }
    public void show_CCA_cred(){
        System.out.println("CCA_credit is : "+CCA_credit);
    }
}
public class Test11 {
    public static void main(String[] args) {
        sem_result s1 = new sem_result();
        sem_result s2 = new sem_result();

        s1.put_all("Jagadish Sau", 55, 100,99);
        s1.get_all();

        s2.put_all("Soumyajit Nath", 54, 95, 102);
        s2.get_all();

    }
}


/*
The Student name is : Jagadish Sau
Roll no : 55.0
Marks1 = 100.0
Marks2 =99.0
CCA_credit is : 5
The Student name is : Soumyajit Nath
Roll no : 54.0
Marks1 = 95.0
Marks2 =102.0
CCA_credit is : 5


 */
