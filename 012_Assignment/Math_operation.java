/*
Write a Java program to import Math Class defined within java.lang system package and use the value of PI
defined there for finding the arca and perimeter of a circle by accepting radius as input through suitable methods
defined in a user defined Class named Math opcrations.
Declare object of the class Math_operations and invoke the member functions as per requirement.
*/
import java.lang.Math;
import java.util.Scanner;
public class Math_operation{
    double r;
    void put_all(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radious of the circle : ");
        r = sc.nextDouble();
        sc.close();
    }
    void get_area(){
        System.out.println("The area of the circle of radious "+r+" is "+Math.PI*r*r);
    }
    void get_perimeter(){
        System.out.println("The perimeter of the circle of radious "+r+" is "+2*Math.PI*r);
    }
    public static void main(String[] args) {
        Math_operation r1 = new Math_operation();
        r1.put_all();
        r1.get_area();
        r1.get_perimeter();
    }
}
