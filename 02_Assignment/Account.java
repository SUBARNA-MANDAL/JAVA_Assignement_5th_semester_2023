/*
create a class Account containing data members Acc_No,C_Name,Contact_No 
as data members and a constructor for creating Account objects and show() method
 for displaying the data members.

create the following 3 sub-classes, namely,

*Savings_Ac containing specialized features viz. ROI,Acc_Balance
*Current_Ac containing speialized features viz. Acc_Balance,Min_Balance
*TD_Ac containing specialized features viz. Principal, Term,ROI,Maturity_Balance

Define suitable constructors in all of the above classes for creating objects 
and showdata() methods for displaying the data members.Also, define compute() method 
 for different computeations in all classes such as interest calclations etc.

*/

import java.lang.Math;
class Savings_Ac extends Account{
    private float ROI,Acc_Balance;
    Savings_Ac(String ANo,String Cname,String Cno,float roi,float ABalance){
        super(ANo,Cname,Cno);
        ROI = roi;
        Acc_Balance = ABalance;
    }
    public void compute(){
        System.out.println("Savings account details : ");
        System.out.println("Account Balance : "+Acc_Balance);
        Acc_Balance = Acc_Balance + (Acc_Balance*ROI)/100;
    }
    public void showdata(){
        super.showdata();
        System.out.println("ROI : "+ROI);
        System.out.println("Updated Account Balance is : "+Acc_Balance);
    }
}
class Current_Ac extends Account{
    private float Acc_Balance,Min_Balance;
    Current_Ac(String ANo,String Cname,String Cno,float ABalance,float minbal){
        super(ANo,Cname,Cno);
        Acc_Balance = ABalance;
        Min_Balance = minbal;
    }
    public void showdata(){
        System.out.println("Current Account details : ");
        super.showdata();
        System.out.println("Account Balance : "+Acc_Balance);
        System.out.println("Min balance need : "+Min_Balance);
        if(Acc_Balance<Min_Balance) System.out.println("InSufficient balance in the account.");
        else    System.out.println("sufficient balance in the account.");
    }
}
class TD_Ac extends Account{
    private double Principal,Term,ROI,Maturity_Balance;
    TD_Ac(String ANo,String Cname,String Cno,double prin,double trm,double roi){
        super(ANo,Cname,Cno);
        Principal = prin;
        Term = trm;
        ROI = roi;
    }
    public void compute(){
        System.out.println("TD_Account drtails : ");
        Maturity_Balance = Principal * Math.pow(1 + ROI/100, Term);
    }
    public void showdata(){
        super.showdata();
        System.out.println("Principal amount is : "+Principal);
        System.out.println("Total term is : "+Term);
        System.out.println("Rate of interests is : "+ROI);
        System.out.println("Maturity amount is : "+Maturity_Balance);
    }
}
class Account{
    String  Acc_No,C_Name,Contact_No;
    Account(String an,String cname,String cno){
        Acc_No = an;
        C_Name = cname;
        Contact_No = cno;
    }
    void showdata(){
        System.out.println("Account No : "+Acc_No);
        System.out.println("Customer name : "+C_Name);
        System.out.println("Contact No : "+Contact_No);
    }
    public static void main(String[] args){
        Savings_Ac S1 = new Savings_Ac("964827631986438","MS Dhoni","+91 9623159468",5,100000);
        S1.compute();
        S1.showdata();
        System.out.println();

        Current_Ac c1 = new Current_Ac("466491305687915","Virat Kohli","+92 9647125983",11000,10000);
        c1.showdata();
        System.out.println();

        TD_Ac t1 = new TD_Ac("656898447979434","Rohit Sharma","+1 6438109826",20000,2,10);
        t1.compute();
        t1.showdata();
    }
}