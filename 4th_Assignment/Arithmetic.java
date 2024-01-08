class Arithmetic{
    private int a;
    private float b;
    private char c;
    private double d;
    Arithmetic(int A,float B,char C,double D){
        a = A;
        b = B;
        c = C;
        d = D;
    }
    void add(int i,double k){
        a+=i;
        d+=k;
    }
    void add(int i,float j, double k){
        a+=i;
        b+=j;
        d+=k;
    }
    void add(float j, int i, double k){
        a+=i;
        b+=j;
        d+=k;
    }
    Arithmetic add(Arithmetic p){
        Arithmetic Q = new Arithmetic(0, 0, 'a', 0);
        Q.a = this.a + p.a;
        Q.b = this.b + p.b;
        Q.c = this.c;
        Q.d = this.d + p.d;
        return Q;
        
    }
    void display(){
        System.out.println("Interger : " + a + " , float : " + b + " , character : " + c + " and double " + d);
    }
    public static void main(String[] args){
        Arithmetic A = new Arithmetic(2, 5.5f, 's', 123.45);
        Arithmetic B = new Arithmetic(5, 3.9f, 'n', 321.54);
        System.out.println("Initially object A ==> ");
        A.display();
        System.out.println("\nInitial object B ==> ");
        B.display();
        System.out.println("\nfter some operation on object A ==> ");
        A.add(2,36.56);
        A.display();
        A.add(3,2.6f,2445.364);
        A.display();
        A.add(2.36f,8,236.75);
        A.display();
        Arithmetic C = A.add(B);
        System.out.println("\nFinally object A , B and C ==> ");
        A.display();
        B.display();
        C.display();   
    }
}