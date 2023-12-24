import java.util.Scanner;

class sorting{
    int n;
    int a[] = new int[10];
    Scanner sc = new Scanner(System.in);

    void put_all(){
        System.out.print("\nEnter the number of elements : ");
        n = sc.nextInt();
        System.out.print("Enter "+n+ " elements : " );
        for(int i = 0;i<n;i++)  a[i] = sc.nextInt();
    }
    void get_all(){
        System.out.print("Current elements are : ");
        for(int i=0;i<n;i++)    System.out.print(a[i]+" ");
    }

    void Bubble_sort(){
        for(int i = 0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int t = a[j];
                    a[j]= a[j+1];
                    a[j+1] = t;
                }
            }
        }
    }

    void Insertion_sort(){
        for(int i = 1;i<n;i++){
            int t = a[i];
            int j = i-1;
            while(j>=0 && a[j]>t){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = t;
        }
    }
    
}
public class Test8 {
    public static void main(String[] args) {
        sorting s1 = new sorting();
        s1.put_all();
        s1.Bubble_sort();
        System.out.println("Using bubble sort -- ");
        s1.get_all();
        
        sorting s2 = new sorting();
        s2.put_all();
        s2.Insertion_sort();
        System.out.println("Using insertion sort -- ");
        s2.get_all();

    }
}


/*

Enter the number of elements : 5
Enter 5 elements : 15 12 18 11 20
Using bubble sort -- 
Current elements are : 11 12 15 18 20 
Enter the number of elements : 5
Enter 5 elements : 25 28 23 29 20
Using insertion sort -- 
Current elements are : 20 23 25 28 29 

 */