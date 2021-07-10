package oop.example.multiThreading;

//what needs to be created.
//a program that is running infinite loop

class My extends Thread{

    @Override
    public void run() {
        int i = 0;
        while(i < 1000)
        {
            System.out.println(i +" world");
            i++;
        }
    }

}



public class ExtendThread {

    public static void main(String[] args) {

            My m = new My();
            m.start();


            int i = 0;
            while(i < 1000)
            {
                System.out.println(i +" Hello ");
                i++;
            }



    }

}
