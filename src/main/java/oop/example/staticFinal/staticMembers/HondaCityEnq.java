package oop.example.staticFinal.staticMembers;

public class HondaCityEnq {
    public static void main(String[] args) {
        System.out.println("On Road price in x-showroom: " +HondaCity.getPrice());
        System.out.println("On Road price in Jaipur: "+HondaCity.onRoadPrice("jaipur"));
        System.out.println("On Road price in delhi: "+HondaCity.onRoadPrice("delhi"));
        System.out.println("On Road price in mumbai: "+HondaCity.onRoadPrice("mumbai"));
    }
}
