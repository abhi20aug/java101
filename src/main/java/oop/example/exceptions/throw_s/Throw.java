package oop.example.exceptions.throw_s;

public class Throw {

    static int getArea(int a, int b) throws Exception {
        System.out.println();
        if (a < 0 || b < 0)
            throw new Exception("dimensions must be > 0");
        return a*b;
    }

    static void printArea() throws Exception {
        System.out.println(getArea(-10,5));
    }

    public static void main(String[] args) {

        try {
            printArea();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }



}
