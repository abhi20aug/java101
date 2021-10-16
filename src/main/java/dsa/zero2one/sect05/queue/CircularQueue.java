package dsa.zero2one.sect05.queue;

import java.lang.reflect.Array;

public class CircularQueue<T> {

    private static final int SPECIAL_EMPTY_VALUE = -1;
    private static int MAX_SIZE = 40;
    private T[] elements;

    private int headIndex = SPECIAL_EMPTY_VALUE;
    private int tailIndex = SPECIAL_EMPTY_VALUE;

    public CircularQueue(Class<T> clazz){
        elements = (T[]) Array.newInstance(clazz, MAX_SIZE);
    }

}
