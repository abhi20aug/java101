package com.java101.sec25.collection.part1;

//interfaces
import java.util.Iterator;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.Queue;


//


public class Example240_1 {

    public static void main(String[] args) {

        Collection collection = new Collection() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public Object[] toArray(Object[] objects) {
                return new Object[0];
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection collection) {
                return false;
            }

            @Override
            public boolean addAll(Collection collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection collection) {
                return false;
            }

            @Override
            public boolean retainAll(Collection collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

//        collection.add();
//        collection.addAll();
//        collection.remove(object);
//        collection.removeAll(C2);
//        collection.retainAll(C2);
//        collection.clear();
//        collection.isEmpty();
//        collection.contains(obj);
//        collection.containsAll(c2);
//        collection.equals(obj);
//        collection.size();
//        collection.iterator();
////        like in for loop
//        //i is iterartor
//        // similarly iterartor is counter in collection.
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//        }
//
//        //        interface is available for interator


    }


}
