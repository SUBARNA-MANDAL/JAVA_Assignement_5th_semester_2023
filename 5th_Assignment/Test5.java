/*

Create a class named Student containing S Name, Roll No, Batch, Year of Adm, Stream as data members.
Write different types of constructors for creating Student Objects such as
Student(String, int):
Student(String, int, String),
Student(String, int, String, int);
Student(String, int, String, int, String);
Assume default values for the data Use showdata( members for which values have not been passed. ) method to display the data members for all objects so created.

*/
class Student{
    String S_Name,Batch,Stream;
    int YearofAdm,Roll_No;
    Student(String SN, int Roll){
        S_Name = SN;
        Roll_No = Roll;
    }
    Student(String SN, int Roll, String B){
        S_Name = SN;
        Roll_No = Roll;  
        Batch = B;      
    }
    Student(String SN, int Roll, String B, int Yr){
        S_Name = SN;
        Batch = B;
        Roll_No = Roll;
        YearofAdm = Yr;
    }
    Student(String SN, int Roll, String B, int yr, String Str){
        S_Name = SN;
        Batch = B;
        Roll_No = Roll;
        YearofAdm = yr;
        Stream = Str;        
    }
    void show(){
        System.out.println("Student name is "+ S_Name+"\nRoll no : "+Roll_No+"\nStream : "+Stream+"\nBatch : "+Batch+"\nYear of Admission : "+YearofAdm+"\n\n");
    }
}
class Test5 {
    public static void main(String[] args) {
    Student s1 = new Student("Tapas Maity", 45);
    Student s2 = new Student("Arpan Hutait", 5,"2024-29");
    Student s3 = new Student("Sourav Sasmal", 6, "2018-22", 2001);
    Student s4 = new Student("Rahul Patra", 3, "2022-27", 2003,"Medicine.");

    s1.show();   
    s2.show();   
    s3.show();   
    s4.show();   
    }
}


/*

Student name is Tapas Maity
Roll no : 45
Stream : null
Batch : null
Year of Admission : 0


Student name is Arpan Hutait
Roll no : 5
Stream : null
Batch : 2024-29
Year of Admission : 0


Student name is Sourav Sasmal
Roll no : 6
Stream : null
Batch : 2018-22
Year of Admission : 2001


Student name is Rahul Patra
Roll no : 3
Stream : Medicine.
Batch : 2022-27
Year of Admission : 2003



 */

