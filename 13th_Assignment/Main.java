import cca.CCA_Score;
class Test_Marks extends Student{
    float marks1,marks2;
    public void put_all(String na,double roll,float m1,float m2){
        super.put_all(na, roll);
        marks1 = m1;
        marks2 = m2;
    }
    public void get_all(){
        super.get_all();
        System.out.println("Marks1 = "+marks1);
        System.out.println("Marks2 ="+marks2);
    }
}

class sem_result extends Test_Marks implements CCA_Score{
    public void put_all(String na,double roll,float m1,float m2){
        super.put_all(na, roll, m1, m2);
    }
    public void get_all(){
        super.get_all();
        show_CCA_cred();
    }
    public void show_CCA_cred(){
        System.out.println("CCA_credit is : "+CCA_credit);
    }
}
    
public class Main {
    public static void main(String[] args) {
        sem_result s1 = new sem_result();
        sem_result s2 = new sem_result();

        s1.put_all("Subarna Mandal", 42, 94,99);
        s1.get_all();

        s2.put_all("Soumyajit Nath", 54, 95, 102);
        s2.get_all();

    }
}

