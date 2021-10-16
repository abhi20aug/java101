package dsa.zero2one.sect05.stack.problem;

import java.util.*;

public class MatchParenthesis {

    //open and closed
    // x*y*{(a+b*t-z)}
    //(ABC){DEF}[XYZ(LMN)]
    //(ABC{DEF}[XYZ(LMN)]
    //(ABC){DEF}[XYZ(LMN)]}
    // No mirror image found.
    // last bracket that pushed to stack, needs to be closed first.

    private static final Map<Character, Character> matchingParenMap = new HashMap<>();
    private static final Set<Character> openingParenSet = new HashSet<>();

    static {
        matchingParenMap.put('{','}');
        matchingParenMap.put('(',')');
        matchingParenMap.put('[',']');
        openingParenSet.addAll(matchingParenMap.values());
    }

    public static void main(String[] args) {
        System.out.println(matchingParenMap.values());
        System.out.println(matchingParenMap.keySet());
        System.out.println(openingParenSet);

        String src = "(ABC{DEF}[XYZ(LMN)])}";
        Stack<Character> stack = new Stack<>();

        for(int i= 0; i < src.length(); i++){
            if(matchingParenMap.containsKey(src.charAt(i))){
                System.out.println("i :"+i +", "+src.charAt(i));
                System.out.println("get "+ matchingParenMap.get(src.charAt(i)));
                stack.push(matchingParenMap.get(src.charAt(i)));
                System.out.println("peek: "+ stack.peek());
            }
            System.out.println(stack.toString());
            if(stack.peek() == src.charAt(i)){
                stack.pop();
            }

        }

        System.out.println(stack.toString());


    }


}
