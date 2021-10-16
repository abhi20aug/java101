package interview.array;

public class ComplexOne {
    public static void main(String[] args) {

        System.out.println("Find 3 Numbers such that I Square+ J Square Equals K Square");

        int[] trgArr = { 5, 2, 3 , 4, 7, 6, 1};

        for(int i =0; i < trgArr.length; i++){

            for (int j = i+1; j< trgArr.length; j++ ){

                for (int k =0; k < trgArr.length ; k++){

                    if (trgArr[i]*trgArr[i]+trgArr[j]*trgArr[j] == trgArr[k]*trgArr[k]){
                        System.out.println("i: "+i+ " "+trgArr[i]);
                        System.out.println("j: "+j+ " "+trgArr[j]);
                        System.out.println("k: "+k+ " "+trgArr[k]);
                    }
                }

            }


        }

    }
}
