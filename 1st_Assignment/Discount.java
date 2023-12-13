/*
Write a java program to create a class Discount containing SalesAmount as a data member.
* SalesAmount should be given as input using approptiate input() method/Constructor defined 
in the class.

*** In the class,defined 2 method viz. compute1() and compute2(),
those will compute the discount to be given using if-else 
constructor and ternary operator repectively following the bellow 
mentioned conditions :

*1 if SalesAmount is less than INR. 10000/-, 
                                        no discount given
*2 if SalesAmount is greater equal 10000/- and less than INR 20000/-
                                        , 3% discount will be given.
*3 if SalesAmount is greater euual INR 20000/- and less than INR 30000/- , 
                                        5% discount will be given.
*4 if the SalesAmount is greater equal INR 40000/-,
                                         10% discount will be given.

* And display() function to display the calculated discount.

*/

class Discount{
    float salesamount;
    float discount;
    Discount(float sa){
        this.salesamount = sa;
    }
    public void compute1(){
        if(salesamount<10000)   discount = 0;
        else if(salesamount>=10000 && salesamount<20000)    discount = (salesamount*3)/100;
        else if(salesamount>=20000 && salesamount<40000)    discount = (salesamount*5)/100;
        else if(salesamount>=40000) discount = (salesamount*10)/100;
    }
    public void compute2(){
        discount = (salesamount<10000)  ? 0 :
                    (
                        (salesamount>=10000 && salesamount<20000)    ? (salesamount*3)/100 :
                        (
                            (salesamount>=20000 && salesamount<40000)    ? 
                                (salesamount*5)/100 :  (salesamount*10)/100
                        )
                    );
    }
    public void display(){
        System.out.println("The discount for pursuing "+salesamount+" is : "+discount);
        System.out.println("You have to pay : "+(salesamount-discount));
    }
    public static void main(String[] args){
        System.out.println("Welcome to Hello shop!!!");
        Discount d1 = new Discount(20000);
        d1.compute1();
        d1.display();

        Discount d2 = new Discount(40000);
        d2.compute2();
        d2.display();
    }
}