/*


10. a) Create an interface named Area containing a final static variable, pi-3.14F and a method named cal arca (float diml, float dim2).
b) Create 2 classes named Circle and Rectangle to implement the Area interface (that is, define respective cal area() method).
Hint: - Use an interface object to refer to Circle object and Rectangle object to display the respective arcas)


 */



interface Area{
    static float pi = 3.14F;
    void cal_area(int dim1,int dim2);
}
class circle implements Area{
    public void cal_area(int dim1,int dim2){
        System.out.println("The area of the circle is : "+2*pi*dim1);
    }
}
class Rectangle implements Area{
    public void cal_area(int dim1,int dim2){
        System.out.println("The area of the rectangle is : "+dim1*dim2);
    }
}
public class Test10 {
    public static void main(String[] args) {
        circle c1 = new circle();
        c1.cal_area(2, 0);

        Rectangle r1 = new Rectangle();
        r1.cal_area(3, 6);
    }
}


/*
Output : 
                                                   
The area of the circle is : 12.56
The area of the rectangle is : 18
 */
