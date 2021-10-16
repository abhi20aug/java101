package dsa.example.array;

public class Ex01 {

    public static void main(String[] args) {

        int[] a ={};
        int c[] ={1,2,3};
        int b[] ={1,2,3};


        for (int x:b){
            System.out.println(x);
            System.out.println(b.hashCode());
       }

    }

}
