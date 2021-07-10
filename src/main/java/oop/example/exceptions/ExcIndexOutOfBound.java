package oop.example.exceptions;

//multiple catch

public class ExcIndexOutOfBound {

    public static void main(String[] args) {

        try {

            int A[] = {1, 0, 2, 3, 4, 5};
            int r;

            r = A[0] / A[1];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }

    }

}
