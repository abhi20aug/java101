package dsa.example.recursion;

// 0, 1, 1, 2, 3, 5, 8
// 0, 1, 2, 3, 4, 5, 6

//for n=0, return
//t0 =0
//t1 =1
//s= t0+t1
//for n>=2
    // s= t0+t1
    // increment n
    // t0= t1
    // t1 = s



//fib(n) = fib(n-2)+fib(n-1)



public class Febonacci {

    public static void main(String[] args) {
        System.out.println("fib> "+ fib(20));

    }

    static int fib(int n){
        System.out.println("");

        int t0=0, t1=1, s=1;
        s = t0+t1;

        for (int i = 2; i <= n ; i++) {
                s = t0 + t1;
                t0 = t1;
                t1 = s;
                System.out.println("s: " + s);
                System.out.println("t0: " + t0);
                System.out.println("t1: " + t1);
        }
//        s= t0+t1;
        return s;
    }

}

