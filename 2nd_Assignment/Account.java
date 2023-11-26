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
        this.ROI = roi;
        this.Acc_Balance = ABalance;
    }
    public void compute(){
        System.out.println("Savings account details : ");
        System.out.println("Account Balance : "+Acc_Balance);
        Acc_Balance = Acc_Balance + (Acc_Balance*ROI)/100;
    }
    public void showdata(){
        Showdata();
        System.out.println("ROI : "+ROI);
        System.out.println("Updated Account Balance is : "+Acc_Balance);
    }
}
class Current_Ac extends Account{
    private float Acc_Balance,Min_Balance;
    Current_Ac(String ANo,String Cname,String Cno,float ABalance,float minbal){
        super(ANo,Cname,Cno);
        this.Acc_Balance = ABalance;
        this.Min_Balance = minbal;
    }
    public void showdata(){
        System.out.println("Current Account details : ");
        Showdata();
        System.out.println("Account Balance : "+Acc_Balance);
        System.out.println("Min balance to have : "+Min_Balance);
        if(Acc_Balance<Min_Balance) System.out.println("InSufficient balance in the account.");
        else    System.out.println("sufficient balance in the account.");
    }
}
class TD_Ac extends Account{
    private float Principal,Term,Time,ROI,Maturity_Balance;
    TD_Ac(String ANo,String Cname,String Cno,float prin,float trm,float time,float roi){
        super(ANo,Cname,Cno);
        this.Principal = prin;
        this.Term = trm;
        this.Time = time;
        this.ROI = roi;
    }
    public void compute(){
        System.out.println("TD_Account drtails : ");
       // Maturity_Balance = Principal * float(Math.pow(1+ROI/100,Time));    // Incorrect...........................
       
    }
    public void showdata(){
        Showdata();
        System.out.println("Principal amount is : "+Principal);
        System.out.println("Total term is : "+Term);
        System.out.println("Rate of interests is : "+ROI);
        System.out.println("Maturity amount is : "+Maturity_Balance);
    }
}
class Account{
    String  Acc_No,C_Name,Contact_No;
    Account(String an,String cname,String cno){
        this.Acc_No = an;
        this.C_Name = cname;
        this.Contact_No = cno;
    }
    void Showdata(){
        System.out.println("Account No : "+Acc_No);
        System.out.println("Customer name : "+C_Name);
        System.out.println("Contact No : "+Contact_No);
    }
    public static void main(String[] args){
        Savings_Ac S1 = new Savings_Ac("89979797979799779","Ram Das","4545135946",5,10000);
        S1.compute();
        S1.showdata();

        Current_Ac c1 = new Current_Ac("465656464699415852","Sam verma","959856685595",11000,10000);
        c1.showdata();


        TD_Ac t1 = new TD_Ac("6568984479794","Raj Shaw","65366464664",20000,2,1,10);
        t1.compute();
        t1.showdata();
    }
}