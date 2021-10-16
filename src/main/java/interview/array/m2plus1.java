package interview.array;

import java.util.HashMap;

public class m2plus1 {
    public static void main(String[] args) {

        int[] ga = {1, 4, 6, 8 , 9, 7};
        System.out.println("Given array");

        //int ntf = 2i+j => 9;

        // i = 1, ntf => j = 9 - 2*1 = 7
        // i = 4 , ntf => j = 9- 2*4 = 1
        // i = 6 , ntf => j = 9 - 12 = -3
        // i =8 , ntf=> j = 9- 16 = -7
        // i = 9 , ntf => j = 9- 18 = -9
        // i =7 , ntf => j = 9- 14 = -5

        HashMap<Integer, Integer> hmap = new HashMap<>();

        // find index of elements having 2m+1 relation.
        for (int i = 0; i < ga.length; i++){

            if(hmap.containsKey(ga[i])){
                System.out.println("found");
                System.out.println(" i: "+i +" j:"+hmap.get(ga[i]));

            } else {
                System.out.println("adding ");
                hmap.put(9- 2* ga[i],i);
            }

        }



    }

}
