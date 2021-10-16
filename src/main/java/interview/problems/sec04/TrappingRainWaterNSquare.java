package interview.problems.sec04;

public class TrappingRainWaterNSquare {
    public static void main(String[] args) {

        //water2Hold = min(max_of_all_lefts, max_of_all_right) - height_self

        int[] water = {0,1,0,2,1,0,3,1,0,1,2};
        int water_at_i =0;

        for(int i=1; i < water.length; i++ ){

            int water_current = 0;

            System.out.println("i "+i +", [i]"+water[i]);

            //starting from i =1
            int max_left=0;
            for(int j=i-1; j >= 0; j--){
                if(water[j] > max_left)
                max_left = water[j];
            }
            System.out.println("max_left"+max_left);

            int max_right=0;
            for(int j=i+1; j < water.length; j++){
                if(water[j] > max_right)
                    max_right = water[j];
            }
            System.out.println("max_right"+max_right);

            if (Math.min(max_left, max_right) - water[i] <= 0){
                water_current =0;
            } else {
                water_current= Math.min(max_left, max_right) - water[i];
            }


            water_at_i = water_at_i+ water_current;
            System.out.println("**water_at_i: "+water_at_i);

        }

        System.out.println("*****water_at_i: "+water_at_i);
    }
}
