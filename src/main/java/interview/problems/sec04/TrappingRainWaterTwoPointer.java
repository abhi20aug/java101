package interview.problems.sec04;

public class TrappingRainWaterTwoPointer {
    public static void main(String[] args) {

        int[] water = {0,1,0,2,1,0,3,1,0,1,2};

        int p_start = 0;
        int p_end = water.length -1;
        int p_current =0;
        int water_holding = 0;

        while(p_start < p_end){
            System.out.println("p_start: "+p_start +" height: "+water[p_start] + " p_end: "+p_end +" height: "+water[p_end]);


            //below code does the min part of level part
            if (water[p_start] < water[p_end]){
                if (p_start == 0){
                    water_holding = water_holding +0;
                }
                p_current = p_start;
                p_start ++;

            } else {
                p_current = p_end;
                p_end --;
            }

            System.out.println("  p_current : "+p_current);

            if (Math.min(water[p_start], water[p_end]) - water[p_current] > 0){
                water_holding = water_holding + Math.min(water[p_start], water[p_end]) - water[p_current];
                System.out.print("  water_holding : "+water_holding);
            }
        }
        System.out.println("water: "+water_holding);

    }
}
