package interview.problems.sec05;

public class TypedOutStringTwoPointer2 {

    public static void main(String[] args) {

//        String s = "ab##";
//        String t = "c#d#";
//        String s = "a#c";
//        String t = "b";
//        String s = "xywrrmp";
//        String t = "xywrrmu#p";

//        String s = "abc#der###";
//        String t = "abx#der###";
        String s = "bxj##tw";
        String t = "bxj###tw";
        System.out.println(backspace(s, t));
    }

    private static boolean backspace(String s, String t) {
        int p1 = s.length() - 1;
        int p2 = t.length() - 1;

        while (p1 >= 0 && p2 >= 0) {
            //System.out.println("p1: "+p1 +" ,p2:"+p2);
            if (s.charAt(p1) == '#' || t.charAt(p2) == '#') {
                //System.out.println("cp1: "+s.charAt(p1) +" ,cp2:"+t.charAt(p2));
                if (s.charAt(p1) == '#') {
                    int backCount = 2;
                    while (backCount > 0) {
                        p1--;
                        backCount--;
                        if (p1 >= 0) {
                            if (s.charAt(p1) == '#') {
                                backCount = backCount + 2;
                            }
                        }
                    }
                }

                if (t.charAt(p2) == '#') {
                    int backCount = 2;
                    while (backCount > 0) {
                        p2--;
                        backCount--;
                        if (p2 >= 0) {
                            if (t.charAt(p2) == '#') {
                                backCount = backCount + 2;
                            }
                        }
                    }
                }
            } else {
                if (p1 >= 0 && p2 >= 0) {
                    if (s.charAt(p1) != t.charAt(p2)) {
                        //System.out.println("cp1: " + s.charAt(p1) + " ,cp2:" + t.charAt(p2));
                        return false;
                    } else {
                        p1--;
                        p2--;
                        if (p1 == 0 && p2 == 0) {
                            return true;
                        }
                    }
                } else {
                    if (p1 == -1 && p2 == -1) {
                        return true;
                    } else {
                        return false;
                    }
                }

            }
        }
        System.out.println("p1" + p1 + " p2" + p2);
        if (p1 == p2) {
            return true;
        } else {
            return false;
        }
    }


    }
