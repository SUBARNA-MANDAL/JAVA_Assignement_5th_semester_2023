/*
Write a Java program to create 20 threads and print their Ids. [Hint: Inherit Thread Class] 

*/

class MyThread extends Thread {
    public void run() {
        System.out.println("Thread ID is : " + Thread.currentThread().getId());
    }
}
class Main {
    public static void main(String[] args) {
        for(int i=1; i<=10; ++i) {
            Thread thread = new MyThread();
            thread.start();
        }
    }
}