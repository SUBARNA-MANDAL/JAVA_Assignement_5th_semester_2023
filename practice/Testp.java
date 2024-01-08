package practice;
abstract class Human{
    int a;
    abstract void add();
}
class student extends Human{
    void add(){
        System.out.println("I am student");
    }
}
class Testp{
    public static void main(String[] args) {
        Human obj = new student();
        obj.add();
    }
}