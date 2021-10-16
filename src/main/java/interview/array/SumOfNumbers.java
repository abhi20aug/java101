package interview.array;


import java.util.HashMap;

public class SumOfNumbers {

    public static void main(String[] args) {

        int number2Find = 11;
        int[] inputArray = {1,2,4,2,6,45,5,6,2,8,9};

        int[] found = new int[2];
        found = number2Find(inputArray, number2Find);
        System.out.println(found[0]+ " "+found[1]);
        System.out.println(inputArray[found[0]]+ " "+inputArray[found[1]]);
    }

    private static int[] number2Find(int[] inputArray, int number2Find) {

        int[] ret = new int[2];
        for (int x=0; x < inputArray.length; x++) {
            System.out.println("x:" +x +" y:"+inputArray[x]);
            int pos = x;
            for( int z= x+1; z< inputArray.length; z++ ){
                if ( number2Find - (inputArray[z]+inputArray[x]) ==0 ) {
                    pos = z;
                    System.out.println("found match positions>  1st: " +x+ ", 2nd "+ pos);
                    System.out.println("found match values>  1st: " +inputArray[x]+ ", 2nd "+ inputArray[pos]);
                    ret[0]=x;
                    ret[1]=pos;
                    return ret;
                }
                System.out.println("z- pos"+pos);

            }
        }
        return null;
    }

}
