package interview.problems.sec05;

public class TypedOutStringTwoPointer {

    public static void main(String[] args) {

//        String s = "ab##";
//        String t = "c#d#";
//        String s = "a#c";
//        String t = "b";

        String s = "xywrrmp";
        String t = "xywrrmu#p";

//        String s = "abc#der###";
//        String t = "abx#der###";
        System.out.println(backspace(s, t));
    }

    private static boolean backspace(String s, String t) {
        int p1 = s.length() - 1;
        int p2 = t.length() - 1;
        int p1Need2MoveSteps = 0;
        int p2Need2MoveSteps = 0;

        while (p1 >= 0 && p2 >= 0) {
            System.out.println("***A P1: " + p1 + " P2: " + p2 + " p1Need2MoveSteps: " + p1Need2MoveSteps + " p2Need2MoveSteps: " + p2Need2MoveSteps);
            if (p1Need2MoveSteps > 0) {
                p1Need2MoveSteps--;
                p1 = p1 - 1;
            }

            if (p2Need2MoveSteps > 0) {
                p2Need2MoveSteps--;
                p2 = p2 - 1;
            }

            if(p1==-1 && p2==-1){
                return true;
            }

            if (s.charAt(p1) == t.charAt(p2) && p1Need2MoveSteps == 0 && p2Need2MoveSteps == 0 && s.charAt(p1) !='#' && t.charAt(p2)!='#') {
                System.out.println("char at p1: " + p1 + " , p2:" + p2 + " are equal");

                if (p1 == 0 || p2 == 0) {
                    System.out.println("returning");
                    return true;
                }

                p1--;
                p2--;

            }
            if (p1 >= 0 && s.charAt(p1) == '#') {
                p1Need2MoveSteps = p1Need2MoveSteps + 2;
            }

            if (p2 >= 0 && t.charAt(p2) == '#') {
                p2Need2MoveSteps = p2Need2MoveSteps + 2;
            }

            if(s.charAt(p1) !='#' && t.charAt(p2) !='#' && p1Need2MoveSteps == 0 && p2Need2MoveSteps == 0){
                return false;
            }

        }
        return false;
    }
}
