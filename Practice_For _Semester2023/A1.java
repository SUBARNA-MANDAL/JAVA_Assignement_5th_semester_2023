/*
Write a Java program to create a class Discount containing SalesAmount as data member.
SalesAmount should be given as input using appropriate input() method/ constructor defined in the
In tne class, define 2 methods viz. compute1( ) and compute2( ), those will compute the discount to be given uslng if-else construct and ternary operator respectively following the below mentioned conditions:

o If SalesAmount is less than INR.10000/-, no discount given,   
o If SalesAmount is greater than INR.10000/- and less than INR.20000/-,3% discount will be given,
Object Oriented Programming Lab
o If SalesAmount is greater than INR.20000/- and less than INR.40000/-, 5% discount will be given,
o If SalesAmount is greater than INR.40000/-, 10% discount will be given. 
o Add display() method to display the calculated discount.
 */
import java.util.Scanner;
 public class A1{
    double SalesAmount;
    double discount;
    void put(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your total item puchased value : ");
        SalesAmount = sc.nextDouble();
        
    }
    //Using if-else Block ------------
    void compute1(){
        if(SalesAmount<10000)   discount = (SalesAmount*0);
        else if(SalesAmount>=10000 && SalesAmount<20000)    discount = (SalesAmount*0.03);
        else if(SalesAmount>=20000 && SalesAmount<40000)    discount = (SalesAmount*0.05);
        else  discount = (SalesAmount*0.1);
    }
    //Using Ternary operator ------------
    void compute2(){
            discount = (SalesAmount<10000) ? SalesAmount :
                        (SalesAmount>=10000 && SalesAmount<2000) ? SalesAmount*0.02 :
                        (SalesAmount>=20000 && SalesAmount<30000) ? SalesAmount*0.05 :
                                                                    SalesAmount*0.1 ;
    }
    void display(){
        System.out.println("So you have to pay : "+(SalesAmount-discount)+"/- , discount - "+discount + "/- OFF");
    }
    public static void main(String[] args) {
        A1 a = new A1();
        a.put();
        a.compute1();
        a.display();


        A1 b = new A1();
        b.put();
        b.compute2();
        b.display();
    }
 }