package oop.example.exceptions.throw_s;
import java.lang.Exception;


//throw new NegativeDimensionException();
//if exception is checked exception then you must handle it or your method throws it

class NegativeDimensionException extends Exception{
    @Override
    public String toString() {
        return "Dimension Must be > 0";
    }
}

public class ThrowUserException {
    static int getArea(int a, int b) throws NegativeDimensionException {
        System.out.println();
        if (a < 0 || b < 0)
            throw new NegativeDimensionException();
        return a*b;
    }

    static void printArea() throws NegativeDimensionException {
        System.out.println(getArea(-10,5));
    }

    public static void main(String[] args) {

        try {
            printArea();
        }
        catch (NegativeDimensionException e)
        {
            System.out.println(e);
        }
        catch (Exception e1)
        {
            System.out.println("e1"+e1);
        }
    }


}
