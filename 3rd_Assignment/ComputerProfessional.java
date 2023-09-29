class Developer extends ComputerProfessional{
        private float studyhour;
        Developer(String name,String DHour,String pros,float SH){
            super(name,DHour,pros);
            this.studyhour = SH;
       }
       public void display(){
        Show();
        System.out.println("StudyHour is "+studyhour);
       }
}
class Network extends ComputerProfessional{
    private float practicehour;
    Network(String name,String DHour,String pros,float pH){
        super(name,DHour,pros);
        this.practicehour = pH;
    }
    public void Display(){
        Show();
        System.out.println("Practice Hour is : "+practicehour);
        System.out.println("\n");
    }
}
class DataOperator extends ComputerProfessional{
    private float TypingSpeed;
    DataOperator(String name,String DHour,String pros,float TS){
        super(name,DHour,pros);
        this.TypingSpeed = TS;
    }
    public void Display(){
        Show();
        System.out.println("Typing Speed is : "+TypingSpeed);
        System.out.println("\n");
    }

}
class Javaprofession extends Developer{
    private String proficiency;
    Javaprofession(String name,String DHour,String pros,float SH,String profi){
        super(name,DHour,pros,SH);
        this.proficiency = profi;
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
        this.proficiency = profi;
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
        this.Ename = name;
        this.DutyHour = DHour;
        this.prospect= pros;
    }
    public void Show(){
        System.out.println("The information of the employee is : ");
        System.out.println("Name : "+Ename);
        System.out.println("Duty hour : "+DutyHour);
        System.out.println("Prospective : "+prospect);
    }
    public static void main(String[] args){
    
        Network A1 = new Network("Arpan Hutait", "10", "fair", 3);
        A1.Display();

        DataOperator A2 = new DataOperator("Sourav Das", "16", "Excellent", 40);
        A2.Display();

        Javaprofession A3 = new Javaprofession("Partha Maity", "9", "Fair", 4, "Intermidiate");
        A3.display();

        Pythonprofession A4 = new Pythonprofession("Jagadish Sau", "15", "Excellent", 6, "Pro");
        A4.display();
        
    }
}
