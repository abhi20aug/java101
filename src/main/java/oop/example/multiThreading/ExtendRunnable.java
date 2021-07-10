package oop.example.multiThreading;

class MyRun implements Runnable{
    @Override
    public void run() {

        int i = 0;

        while(i < 1000){
            System.out.println(i +" World");
            i++;
        }
    }
}


public class ExtendRunnable {

    public static void main(String[] args) {

        MyRun mr = new MyRun();
        Thread t1 = new Thread(mr);
        t1.start();

        int i = 0;
        while(i < 1000){
            System.out.println(i +" Hello");
            i++;
        }


    }

}
