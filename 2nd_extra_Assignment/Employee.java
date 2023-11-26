/*
 
Create a base class named Employee containing data members ECode, Ename, ContactNo, BasicSal, GrossSal, Dept and methods like computeTotSalary(), calcBonus(), showdata(). Different types of employees like Manager, Engineer and Clerk may have their implementations of the methods present in base class Employee. Each type of employee may have its logic in its class, e,g, if calcBonus() is present for a specific employee type, only that method would be invoked to provide hike in salary(by addition of Bonus). Use constructors in every class for creation of objects. Implement using suitable Java Code.

|N.B. 1.Assune suitable data-types of data members and return (types of methods.
2. GrossSal = BasicSal+DA+HRA+MA where DA=75% af BasicSal, HRA=15% of BasicSal, MA-10% of BasicSal )


*/
class Engineer extends Employee{
    float BasicSal,GrossSal;
    Engineer(double ECo,String Ena,double ConNo,String Dpt,float BasSal,float Grosal){
        super(ECo, Ena, ConNo, Dpt);
        BasicSal = BasSal;
        GrossSal = Grosal;
    }
}
class Manage extends Employee{

}
class Clerk extends Employee{

}
class Employee {
    double ECode,ContactNo;
    String Ename,Dept;
    Employee(double ECo,String Ena,double ConNo,String Dpt){
        ECode = ECo;
        Ename =Ena;
        ContactNo = ConNo;
        Dept = Dpt;
    }
    void computeTotSalary(){

    }
    void calcBonus(){

    }
    void showdata(){

    }

}
