package oop.example.inheritance;

class Car{

    public void start(){
        System.out.println("Car Started");
    }

    public void changeGear(){
        System.out.println("Car Manual Gear changed");
    }

    public void accelerate(){
        System.out.println("Car Accler pressed");
    }}


class LuxuryCar extends Car{

    public void openRoof(){
        System.out.println("Open Roof");
    }

    public void changeGear(int x){
        System.out.println("Automatic Gear changed"+x);
    }


}


public class MethodOverLoad2 {
    public static void main(String[] args) {

        System.out.println("---------Car--");
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();

        System.out.println("---------LuxCar--");
        LuxuryCar lc = new LuxuryCar();
        lc.start();
        lc.changeGear();
        lc.openRoof();
        lc.accelerate();

        System.out.println("---------Car LuxCar--");
        Car lcc = new LuxuryCar();
        lcc.start();
        lcc.changeGear();
        //lcc.openRoof();
        lcc.accelerate();


    }

}

















