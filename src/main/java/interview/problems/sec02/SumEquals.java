package interview.problems.sec02;

import java.util.HashMap;

public class SumEquals {
    public static void main(String[] args) {

        int[] ga = {1, 4, 3, 2, 5};
        int ntf = 9;

        /*
        1 -> 9-1 => 8, 0
        check if exists 4 in hmap, if yes, found, else add -> 9-4 => 5, 0
        3 -> 9-3 => 6, 0
        2 ->

         */

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int i =0; i < ga.length ; i++){
            System.out.println("i :"+i +" num: "+ga[i]);

            if (hmap.containsKey(ntf - ga[i])){
                System.out.println("found at i"+i + " , j "+hmap.get(ntf-ga[i]));
            } else {
                System.out.println("adding");
                hmap.put(ga[i],i);
            }

        }



    }
}
