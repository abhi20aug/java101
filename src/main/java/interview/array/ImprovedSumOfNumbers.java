package interview.array;

import java.util.HashMap;

public class ImprovedSumOfNumbers {

    public static void main(String[] args) {

        int number2Find = 11;
        int[] inputArray = {5,1,2,8,9};
        HashMap<Integer, Integer> lookforMap = new HashMap<>();

        // 5 -> {6:0}   map( Look for partner, position of number who needed this partner)
        // 1 -> Look for 1 in HashMap, is 1 a partner to previous number?, If yes, exit, we got it, if not, then insert 1's required partner.

        for (int i =0; i < inputArray.length; i++){

            System.out.println("at Position "+i );
            System.out.println("number to find: "+ (number2Find - inputArray[i])+ " for current value: "+inputArray[i]);

            //check if value inputArray[i] exists in hashmap
            System.out.println("check if value "+inputArray[i]+ " exists in hashmap: "+lookforMap);

            if(lookforMap.containsKey(inputArray[i])){
                System.out.println("found partner value at position "+lookforMap.get(inputArray[i]) +" current position "+i);
            } else{
                lookforMap.put(number2Find-inputArray[i],i);
                System.out.println("hashmap"+lookforMap);
            };
        }
    }



}
