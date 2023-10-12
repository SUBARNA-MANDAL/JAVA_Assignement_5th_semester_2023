/*
Create a class named Complex containing data members a and b and member methods add(), sub(),
Complex (int, int), display(). Create objects of Complex class and perform the addition & subtraction and
display the result in each case.
[Hint: For addition of 2 Complex objects, use the formula: (a1 +ib1) + (a2+ib2) = (a1+a2) + i(b1+b2)]
JN.B. Assume suitable return types of methods.]
 * 
 * 
 */

 /*
class complex {
    int a,b;
    complex(int A,int B){
        a = A;
        b = B;
    }
    complex add(complex c){
        complex k = new complex(0, 0);
        k.a = this.a + c.a;
        k.b = this.b + c.b;
        return k;
    }
    complex sub(complex c){
        complex k = new complex(0, 0);
        k.a = this.a - c.a;
        k.b = this.b - c.b;
        return k;
    }
    void display(){
            System.out.println(" "+a + "+" + b+"i");
    }
    public static void main(String args[]){
        complex c1 = new complex(2,5);
        complex c2 = new complex(4,9);
        System.out.print("Initially c1 is : ");
        c1.display();
        System.out.print("And c2 is : ");
        c2.display();
        System.out.print("Addition of c1 and c2 is : ");
        complex c3 = c2.add(c1);
        c3.display();
        System.out.print("Substuction of c2 from c1 is : ");
        c3 = c2.sub(c1);
        c3.display();

    }
    
}
*/



class complex {
    int a,b;
    complex(int A,int B){
        a = A;
        b = B;
    }
    void add(int A,int B){
        a +=A;
        b +=B;
    }
    void sub(int A,int B){
        a -=A;
        b -=B;
    }
    void display(){
            System.out.println(" "+a + "+" + b+"i");
    }
    public static void main(String args[]){
        complex c1 = new complex(2,5);
        System.out.print("Initially c1 is :");
        c1.display();
        System.out.print("After of c1 :");
        c1.add(3,8);
        c1.display();
        System.out.print("After Substuction of c1 :");
        c1.sub(2,7);
        c1.display();

    }
    
}


/*

Output : 
Initially c1 is : 2+5i
After of c1 : 5+13i
After Substuction of c1 : 3+6i
 * 
 * 
 */
