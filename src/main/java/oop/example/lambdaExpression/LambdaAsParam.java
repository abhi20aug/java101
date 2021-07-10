package oop.example.lambdaExpression;

//when functional interface is passed as parameter, we can pass lambda expression as parameter.

@FunctionalInterface
interface validate{
    void doValidation();
}

class useLambda{
    void callLambda(validate val){
        val.doValidation();
    }
}

class Demo{
    void method1(){

        useLambda ul = new useLambda();
        ul.callLambda(()->{
                System.out.println("validations starts");
                System.out.println("processing ...");
                System.out.println("validations ends");
            }
        );
    }

}


public class LambdaAsParam {

    public static void main(String[] args) {
        Demo d = new Demo();
        d.method1();
    }
}
