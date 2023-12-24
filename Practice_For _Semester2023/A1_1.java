/*
Create a class named Complex containing data members a and b and member methods add(), sub(),
Complex (int, int), display(). Create objects of Complex class and perform the addition & subtraction and
display the result in each case.
[Hint: For addition of 2 Complex objects, use the formula: (al +ibl) + (a2+ib2) = (alta2) + i(bl+b2)]
 */
public class A1_1 {
    int a,b;
    A1_1(int A,int B){
        a = A;
        b = B;
    }
    void add(A1_1 k){
        this.a += k.a;
        this.b +=k.b;
    }
    void add(int A,int B){
        this.a+=A;
        this.b+=B;
    }
    void sub(int A,int B){
        this.a-=A;
        this.b-=B;
    }
    void display(){
        System.out.println("Complex number : "+a+" + "+b+"i");
    }
    public static void main(String[] args) {
        A1_1 c1 = new A1_1(2, 3);
        A1_1 c2 = new A1_1(4, 5);
        c2.add(c1);
        c1.display();
        c2.display();
    }
}
