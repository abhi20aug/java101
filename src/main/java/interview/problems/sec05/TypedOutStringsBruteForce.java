package interview.problems.sec05;

import java.util.Stack;

public class TypedOutStringsBruteForce {
    public static void main(String[] args) {

        //true case
        String s = "ab##"; //"abc#d#e#r";

        String t = "c#d#";//"abx#d#e#r";

        if(buildString(s).equals(buildString(t))){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }

    private static Stack<Character> buildString(String s) {
        Stack<Character> sa2 = new Stack<>();
        for(int i =0; i < s.length(); i++){
            if ( s.charAt(i) != '#'){
                sa2.push(s.charAt(i));
            } else {
                sa2.pop();
            }
        }
        return sa2;
    }
}
