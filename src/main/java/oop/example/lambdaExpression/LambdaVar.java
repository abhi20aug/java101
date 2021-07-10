package oop.example.lambdaExpression;

@FunctionalInterface
interface LambdaI{
    void display();
}

class MyLambda{

    int x = 100;

    void method1(){
        int y = 200;

        LamdbaI li = ()->{
            int a =10;
            System.out.println("Var inside LambdaI a: "+a);
            a++;
            System.out.println("Var inside LambdaI b:"+a);

            System.out.println("Member Var LambdaI x:"+x);
            x++;
            System.out.println("Member var LambdaI x++:"+x);

            System.out.println("Member Var LambdaI y:"+y);
//            y++;
            //effectively final var only
            System.out.println("Member var LambdaI y++:"+y);
        };

        li.display();
    }


}

public class LambdaVar {
    public static void main(String[] args) {

        MyLambda ml = new MyLambda();
        ml.method1();

    }

}
