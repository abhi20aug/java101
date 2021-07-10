package oop.example.exceptions;

public class ExcAEIndexOutOfBound {

        public static void main(String[] args) {

            try {

                int A[] = {1, 0, 2, 3, 4, 5};
                int r;

                    try{
                        r = A[1] / A[1];
                        System.out.println(r);

                        try{
                            System.out.println(A[10]);
                        }
                        catch(ArrayIndexOutOfBoundsException e1){
                            System.out.println("Index not valid" +e1);
                        }
                    }
                    catch (ArithmeticException e) {
                        System.out.println("DIV by Zero" +e);
                    }
                }
            catch(Exception e2)
            {
                System.out.println(e2);
            }


            System.out.println("bye");

        }

}

