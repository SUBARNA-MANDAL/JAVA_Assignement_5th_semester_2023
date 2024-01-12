/*

Write a Java program to create 10 threads and print their names implementing Runnable interface. Use sleep() method to control working of threads. Use appropriate exception handling techniques.

*/

class MyRunnable implements Runnable{
    public void run(){
        try{
            System.out.println(Thread.currentThread().getName() + " is starting.");
            Thread.sleep(500);
            System.out.println(Thread.currentThread().getName() + " is finishing.");
        }catch (InterruptedException e) {
            System.err.println("Thread execution interrupted: " + e.getMessage());
        }
    }
}
public class Main{
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            MyRunnable my = new MyRunnable();
            Thread thread = new Thread(my);
            thread.start();
        }
    }
}