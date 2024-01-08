/* 
 Write a Java program to create a class Shape" and 3 other classes 
 named Square, Rectangle and Triangle derived from it, all containing a 
 overridden method cal_area() to calculate area of a Square or a Rectangle or a Triangle.
  Assume suitable data members( 2 int type data members only) and member 
  methods(get() and put() in all classes. Also validate the inputs.
 */
import java.util.Scanner;
abstract class shape{
    int a,b;
    void cal_area(){};
}
class square extends shape{
    void put(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the side of the square : ");
        a = sc.nextInt();
        while(a<=0){
            System.out.print("Invalid Input!!!\nEnter the side value again : ");
            a = sc.nextInt();
        }
    }
    void cal_area(){
        System.out.print("So the area of the square is : "+a*a);
    }
    void get(){
        System.out.println(" , Where entered side value of the square is : "+a+"\n");
    }
}
class Triangle extends shape{
    void put(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the base of the triangle : ");
        a = sc.nextInt();
        while(a<=0){
            System.out.print("Invalid Input!!!\nEnter the base value again : ");
            a = sc.nextInt();
        }
        System.out.print("Enter the heigt of the triangle : ");
        b = sc.nextInt();
        while(b<=0){
            System.out.print("Invalid Input!!!\nEnter the height value again : ");
            b = sc.nextInt();
        }
    }
    void cal_area(){
        System.out.print("So the area of the square is : "+0.5*a*b);
    }
    void get(){
        System.out.println(" , Where entered base is : "+a + " and the height is : "+b+"\n");
    }
}
class Rectangle extends shape{
    void put(){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        a = sc.nextInt();
        while(a<=0){
            System.out.print("Invalid Input!!!\nEnter the length value again : ");
            a = sc.nextInt();
        }
        System.out.print("Enter the weidth of the rectangle : ");
        b = sc.nextInt();
        while(b<=0){
            System.out.print("Invalid Input!!!\nEnter the weidth value again : ");
            b = sc.nextInt();
        }
    }
    void cal_area(){
        System.out.print("So the area of the rectangle is : "+a*b);
    }
    void get(){
        System.out.println(" , Where entered length is : "+a + " and the weidth is : "+b+"\n");
    }
}
public class Test1 {
    public static void main(String args[]){
        square s1 = new square();
        s1.put();
        s1.cal_area();
        s1.get();
        Triangle t1 = new Triangle();
        t1.put();
        t1.cal_area();
        t1.get();
        Rectangle r1 = new Rectangle();
        r1.put();
        r1.cal_area();
        r1.get();
    }
}
/*

Output : 

Enter the side of the square : -1
Invalid Input!!!
Enter the side value again : 2
So the area of the square is : 4 , Where entered side value of the square is : 2
Enter the base of the triangle : 0
Invalid Input!!!
Enter the base value again : 3
Enter the heirgt of the triangle : -4
Invalid Input!!!
Enter the height value again : 2
So the area of the square is : 3.0 , Where entered base is : 3 and the height is : 2
Enter the length of the rectangle : 0
Invalid Input!!!
Enter the length value again : 6
Enter the weidth of the rectangle : -8
Invalid Input!!!
Enter the weidth value again : 3
So the area of the rectangle is : 18 , Where entered length is : 6 and the weidth is : 3

 */