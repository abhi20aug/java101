package oop.example.staticFinal.staticMembers;

public class HondaCity {

    static long price=1500000;

    static long getPrice(){
        System.out.println("Price of car is "+price);
        return price;
    }

    static double onRoadPrice(String state){

        switch(state) {
            case "delhi":
                return price+(price*0.1);
            case "jaipur":
                return price+(price*0.095);
            case "mumbai":
                return price+(price*0.09);
        }

        return -1;
    }
}
