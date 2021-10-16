package dsa.zero2one.sect05.stack;

public class Stack<T> {

    private Element<T> top;
    private static int MAX_SIZE =10;
    private int size=0;

    public int getSize() {
        return size;
    }

    //push
    public void push(T data) throws StackOverflowException {
        if(size == MAX_SIZE){
            throw new StackOverflowException("size is at max");
        }
        Element<T> element = new Element<>(data, top);
        top = element;
        size++;
    }

    //pop
    public T pop() throws StackUnderflowException {
        if(size == 0){
            throw new StackUnderflowException("No item to pop");
        } else {
            T ret = (T)top.getData();
            top = top.getNext();
            size--;
            return ret;
        }
    }

    //peek
    public T peek() throws StackUnderflowException {
        if(size==0){
            throw new StackUnderflowException("No item to peek");
        }
            T ret = (T)top.getData();
            return ret;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                ", size=" + size +
                '}';
    }
}
