package oop.example.exceptions.finalEx;
//try
//finally to print final msg or clenaup actvity

public class FinalEx {

    public static void main(String[] args) throws Exception {

        meth1();

    }

    static void meth1() throws Exception {

        try {
            //System.out.println(1 / 0);
            throw new Exception("exception");
        }
        finally {
            System.out.println("final message");
        }
    }


}
