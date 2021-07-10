package oop.example.lambdaExpression;

@FunctionalInterface
interface LamdbaI{
    void display();
}

//class My implements LamdbaI{
//    @Override
//    public void display() {
//        System.out.println("test from My");
//    }
//}

public class LamdbaEx {

    public static void main(String[] args) {
        //        LamdbaI m = new My();


        //        LamdbaI m = new LamdbaI() {
        //            @Override
        //            public void display() {
        //                System.out.println("test from My");
        //            }
        //        };

        LamdbaI m = () -> {
                System.out.println("test from My");
            };

        m.display();
    }

}
