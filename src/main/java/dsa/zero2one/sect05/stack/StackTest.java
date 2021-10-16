package dsa.zero2one.sect05.stack;

public class StackTest {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {

        Stack stack = new Stack();

        stack.push("d01");
        stack.push("d02");
        stack.push("d03");
        stack.push("d04");
        System.out.println(stack.toString());
        System.out.println(stack.getSize());

        System.out.println(stack.pop());
        System.out.println(stack.toString());
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
    }
}
