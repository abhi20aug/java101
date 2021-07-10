package oop.example.lambdaExpression;

@FunctionalInterface
interface LambdaParamI{
    void display(String str);
}

@FunctionalInterface
interface LambdaParam2I{
    void add(int x, int y);
}

@FunctionalInterface
interface LambdaParam3I{
    int add(int x, int y);
}

@FunctionalInterface
interface LambdaParam4I{
    int add(int x, int y);
}


public class LambdaParamEx {
    public static void main(String[] args) {

        LambdaParamI l = (s)->{
            System.out.println(s);
        };

        l.display("hello");

        LambdaParam2I l2 = (i, j)->{
            System.out.println(i+j);
        };
        l2.add(1,3);

        //2 parameters passed with return
        LambdaParam3I l3 = (i, j)->{
            return (i+j);
        };
        System.out.println(l3.add(5,6));

        //without return statement
        LambdaParam4I l4 = (i, j)->(i+j);
        int r = l4.add(5,7);
        System.out.println(r);

    }

}
