/*

Create a class ComputerProfessional containing EName, DutyHour and Prospect(Domain of values are
"Excellent", "Good" and "Fair") as data members. Create 3 different child classes namely Developer,
NetworkAdmin and DataOperator using ComputerProfessional as the super class. Include StudyHour as data
member in Developer Class, PracticeHours as data member in NetworkAdmin Class, TypingSpeed as data
member in DataOperator Class.
Create two more sub-classes of Developer Class namely JavaProfessional and PythonProfessional having
ProficiencyLevel(Domain of values are "Beginner", "Intermediate" and "Pro") as specialized feature.
Use constructors to create the objects for all classes. Develop the appropriate display() methods in all of the
classes to show the appropriate data members.

 */

class Developer extends ComputerProfessional{
        private float studyhour;
        Developer(String name,String DHour,String pros,float SH){
            super(name,DHour,pros);
            studyhour = SH;
       }
       public void display(){
        super.display();
        System.out.println("StudyHour is "+studyhour);
       }
}
class Network extends ComputerProfessional{
    private float practicehour;
    Network(String name,String DHour,String pros,float pH){
        super(name,DHour,pros);
        practicehour = pH;
    }
    public void display(){
        super.display();
        System.out.println("Practice Hour is : "+practicehour);
        System.out.println("\n");
    }
}
class DataOperator extends ComputerProfessional{
    private float TypingSpeed;
    DataOperator(String name,String DHour,String pros,float TS){
        super(name,DHour,pros);
        TypingSpeed = TS;
    }
    public void display(){
        super.display();
        System.out.println("Typing Speed is : "+TypingSpeed);
        System.out.println("\n");
    }

}
class Javaprofession extends Developer{
    private String proficiency;
    Javaprofession(String name,String DHour,String pros,float SH,String profi){
        super(name,DHour,pros,SH);
        proficiency = profi;
    }
    public void display(){
        super.display();
        System.out.println("Proficiency level is : "+proficiency);
        System.out.println("\n");
    }
}
class Pythonprofession extends Developer{
    private String proficiency;
    Pythonprofession(String name,String DHour,String pros,float SH,String profi){
        super(name,DHour,pros,SH);
        proficiency = profi;
    }
    public void display(){
        super.display();
        System.out.println("Proficiency level is : "+proficiency);
        System.out.println("\n");
    }
}
class ComputerProfessional{
    private String Ename,DutyHour,prospect;
    ComputerProfessional(String name,String DHour,String pros){
        Ename = name;
        DutyHour = DHour;
        prospect= pros;
    }
    public void display(){
        System.out.println("The information of the employee is : ");
        System.out.println("Name : "+Ename);
        System.out.println("Duty hour : "+DutyHour);
        System.out.println("Prospective : "+prospect);
    }
    public static void main(String[] args){
    
        Network A1 = new Network("Arpan Hutait", "10", "fair", 3);
        A1.display();

        DataOperator A2 = new DataOperator("Sourav Das", "16", "Excellent", 40);
        A2.display();

        Javaprofession A3 = new Javaprofession("Partha Maity", "9", "Fair", 4, "Intermidiate");
        A3.display();

        Pythonprofession A4 = new Pythonprofession("Jagadish Sau", "15", "Excellent", 6, "Pro");
        A4.display();
        
    }
}
