/*
 
Create a base class named Employee containing data members ECode, Ename,
ContactNo, BasicSal, GrossSal, Dept and methods like computeTotSalary(), 
calcBonus(), showdata(). Different types of employees like Manager, Engineer and Clerk may 
have their implementations of the methods present in base class Employee. Each type of 
employee may have its logic in its class, e,g, if calcBonus() is present for a specific 
employee type, only that method would be invoked to provide hike in salary(by addition of Bonus).
Use constructors in every class for creation of objects. Implement using suitable Java Code.
|N.B. 1.Assune suitable data-types of data members and return (types of methods.
2. GrossSal = BasicSal+DA+HRA+MA where DA=75% af BasicSal, HRA=15% of BasicSal, MA-10% of BasicSal )


*/
class Engineer extends Employee{
    double GrossSal;
    double DA,HRA,MA;
    Engineer(String ECo,String Ena,String ConNo,String Dpt,double BaSal){
        super(ECo, Ena, ConNo, Dpt,BaSal);
    }
    void colcBonus(){
        DA = BasicSal * 0.75f;
        HRA = BasicSal * 0.15f;
        MA = BasicSal * 0.1f;
    }
    void computeTotsalary(){
        GrossSal = BasicSal+DA+HRA+MA; 
    }
    void showdata(){
        super.showdata();
        System.out.println("Bonus is : " + (DA+HRA+MA));
        System.out.println("Total / Gross salary is : "+GrossSal);
    }   
}
class Manager extends Employee{
    double GrossSal;
    double DA,HRA,MA;
    Manager(String ECo,String Ena,String ConNo,String Dpt,double BaSal){
        super(ECo, Ena, ConNo, Dpt,BaSal);
    }
    void colcBonus(){
        DA = BasicSal * 0.75f;
        HRA = BasicSal * 0.15f;
        MA = BasicSal * 0.1f;
    }
    void computeTotsalary(){
        GrossSal = BasicSal+DA+HRA+MA; 
    }
    void showdata(){
        super.showdata();
        System.out.println("Bonus is : " + (DA+HRA+MA));
        System.out.println("Total / Gross salary is : "+GrossSal);
    }
}
class Clerk extends Employee{
    double GrossSal;
    double DA,HRA,MA;
    Clerk(String ECo,String Ena,String ConNo,String Dpt,double BaSal){
        super(ECo, Ena, ConNo, Dpt,BaSal);
    }
    void colcBonus(){
        DA = BasicSal * 0.75f;
        HRA = BasicSal * 0.15f;
        MA = BasicSal * 0.1f;
    }
    void computeTotsalary(){
        GrossSal = BasicSal+DA+HRA+MA; 
    }
    void showdata(){
        super.showdata();
        System.out.println("Bonus is : " + (DA+HRA+MA));
        System.out.println("Total / Gross salary is : "+GrossSal);
    }
}
class Employee {
    double BasicSal;
    String Ename,ECode,ContactNo,Dept;
    Employee(String ECo,String Ena,String ConNo,String Dpt,double BaSal){
        ECode = ECo;
        Ename =Ena;
        ContactNo = ConNo;
        Dept = Dpt;
        BasicSal = BaSal;
    }
    void showdata(){
        System.out.println("\nEmployee Ecode - " + ECode);
        System.out.println("Name : "+Ename);
        System.out.println("Contact Number : "+ContactNo);
        System.out.println("Depertment name : "+Dept);
        System.out.println("Basic salary : "+BasicSal);
    }
    public static void main(String[] args) {
        Engineer E1 = new Engineer("10000005", "Santu Mandal", "9265463092", "SDE", 95000);
        E1.colcBonus();
        E1.computeTotsalary();
        E1.showdata();

        Manager E2 = new Manager("10000009", "Joyes Pramanik", "96315893437", "Consultant",80000);
        E2.colcBonus();
        E2.computeTotsalary();
        E2.showdata();

        Clerk E3 = new Clerk("10000007","Ashok Samanta", "9613558496", "File Management", 45000);
        E3.colcBonus();
        E3.computeTotsalary();
        E3.showdata();
    }
}
