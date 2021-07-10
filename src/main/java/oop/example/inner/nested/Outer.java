package oop.example.inner.nested;

//class is becoming big
//repeated code
class Outer{
    int x=10;

    class Inner{
        int y =20;

        void displayInner(){
            System.out.println("Inner Display y: "+y);
            System.out.println("Inner Display x: "+x);
        }
    }

    void outerDisplay(){
        System.out.println("Outer Display x: "+x);
        //access inner class
        Inner i = new Inner();
        i.displayInner();
        System.out.println("i.y :+"+i.y);
    }
}

