// Online Java Compiler
// Use this editor to write, compile and run your Java code online

/*
Create an abstract class 'Bird' containing the following members:
Name(String),Colour(String)
Bird(String,String) 
Fly(); 
Create a derived class named 'FlyingBird'containing no new data members except the over-ridden Fly() method .Also create another derived class named 'NonFlying Bird' containing no new data member except the over-ridden Fly() method .Implement using a suitable java function.


 */

class FlyingBird extends Bird{
    FlyingBird(String Na,String co){
        super(Na, co);
    }
    void Fly(){
        System.out.println("Hello I am "+Name+" a flying bird of colour "+colour);
    }
}
class NonFlyingBird extends Bird{
    NonFlyingBird(String Na,String co){
        super(Na, co);
    }
    void Fly(){
        System.out.println("Hello I am "+Name+" a Non flying bird of colour "+colour+"");
    }
}
abstract class Bird {
    String Name,colour;
    Bird(String N,String c){
        Name = N;
        colour = c;
    }
    void Fly(){};
    public static void main(String args[]){
        FlyingBird f1 = new FlyingBird("Parrot", "green");
        f1.Fly();
        NonFlyingBird f2 = new NonFlyingBird("Hean", "White");
        f2.Fly();
    }
}