package interview.problems.sec03;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] water = {1, 8, 6, 2, 9, 4};

        // start with ends.
        int area = 0;
        int i = 0;
        int j = water.length -1;
        while(i < water.length && j > i){
            System.out.println("i: "+i +" j:"+j);
            if (Math.min(water[i], water[j])*(Math.abs(j-i)) > area) {
                area = Math.min(water[i], water[j]) * (Math.abs(j - i));
                System.out.println(water[i] + "," + water[j] + ": " + area);
            }
            if (water[i] < water[j]){
                i++;
            } else {
                j--;
            }
        }
        System.out.println("area" +area);
    }
}
