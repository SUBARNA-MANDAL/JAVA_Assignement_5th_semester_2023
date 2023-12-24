class Time {
    private int hr;
    private int min;
    private double sec;
    Time(int HR,int MIN,double SEC){
        hr = HR;
        min = MIN;
        sec = SEC;
    }
    void add_time(int m){
        min+=m;
        if(min>=60){
            hr +=1;
            min%=60;
        }
    }
    void add_time(int h,int m){
        hr+=h;
        min+=m;
        if(min>=60){
            hr +=1;
            min%=60;
        }
    }
    void add_time(double s){
        sec+=s;
        if(s>=60){
            min +=1;
            sec%=60;
        }
    }
    Time add_time(Time k){
        Time T = new Time(0,0,0);
        T.sec = this.sec + k.sec;
        T.min = this.min +k.min;
        T.hr = this.hr + k.hr;
        if(T.sec>=60){
            T.min +=1;
            T.sec%=60;
        }
        if(T.min>=60){
            T.hr +=1;
            T.min%=60;
        }
        return T;
    }
    void showtime(){
        System.out.println("Current time is => " + hr + " : " + min + " : "+ sec);
    }
    public static void main(String[] args){
        Time t1 = new Time(12, 5, 20.06);
        Time t2 = new Time(2, 56, 45);
        System.out.println("Initially t1 object : ");
        t1.showtime();
        System.out.println("\nInitially t2 object : ");
        t2.showtime();
        System.out.println("\nAfter some operation of t1 object : ");
        t1.add_time(50);
        t1.showtime();
        t1.add_time(2,40);
        t1.showtime();
        t1.add_time(37.3);
        t1.showtime();
        Time t3 = t1.add_time(t2);
        System.out.println("\nFinally t1 , t2 and t3 object : ");
        t1.showtime();
        t2.showtime();
        t3.showtime();
    }
}


/*
 OutPut : 
------------
 D:\programming language\OOP - JAVA 2023\5th sem 2023 college\4th_Assignment>javac Time.java

D:\programming language\OOP - JAVA 2023\5th sem 2023 college\4th_Assignment>java Time
Initially t1 object : 
Current time is => 12 : 5 : 20.06

Initially t2 object :
Current time is => 2 : 56 : 45.0

After some operation of t1 object :
Current time is => 12 : 55 : 20.06
Current time is => 15 : 35 : 20.06
Current time is => 15 : 35 : 57.36

Finally t1 , t2 and t3 object :
Current time is => 15 : 35 : 57.36
Current time is => 2 : 56 : 45.0
Current time is => 18 : 32 : 42.36
 
*/

