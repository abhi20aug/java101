package com.java101.sec25.collection.part1;


//how data will be kept in memory.
//arranging data in memory.
//basic: array.


import java.util.*;

public class Example239_1 {
    public static void main(String[] args) {

        Students students[]= new Students[10];

        Iterable iterable = new Iterable() {
            @Override
            public Iterator iterator() {
                return null;
            }
        };

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

        List list = new List() {
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
            public boolean addAll(int i, Collection collection) {
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

            @Override
            public Object get(int i) {
                return null;
            }

            @Override
            public Object set(int i, Object o) {
                return null;
            }

            @Override
            public void add(int i, Object o) {

            }

            @Override
            public Object remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator listIterator() {
                return null;
            }

            @Override
            public ListIterator listIterator(int i) {
                return null;
            }

            @Override
            public List subList(int i, int i1) {
                return null;
            }
        };

        //legacy class

        //1.2
        ArrayList arrayList = new ArrayList();
        LinkedList linkedList = new LinkedList();

        //1.0, 1.1
        Vector vector = new Vector();
        Stack stack = new Stack();

        //Set will not have duplicates

        Set set = new Set() {
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
            public boolean retainAll(Collection collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        //non ordered and unique
        SortedSet sortedset = new SortedSet() {
            @Override
            public Comparator comparator() {
                return null;
            }

            @Override
            public SortedSet subSet(Object o, Object e1) {
                return null;
            }

            @Override
            public SortedSet headSet(Object o) {
                return null;
            }

            @Override
            public SortedSet tailSet(Object o) {
                return null;
            }

            @Override
            public Object first() {
                return null;
            }

            @Override
            public Object last() {
                return null;
            }

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
            public boolean retainAll(Collection collection) {
                return false;
            }

            @Override
            public boolean removeAll(Collection collection) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

        //used for searches
        HashSet hashset = new HashSet();
        LinkedHashSet linkedHashSet = new LinkedHashSet();

        TreeSet treeset = new TreeSet();

        Queue queue = new Queue() {
            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

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


        PriorityQueue pq = new PriorityQueue();

        Deque dq = new Deque() {
            @Override
            public void addFirst(Object o) {

            }

            @Override
            public void addLast(Object o) {

            }

            @Override
            public boolean offerFirst(Object o) {
                return false;
            }

            @Override
            public boolean offerLast(Object o) {
                return false;
            }

            @Override
            public Object removeFirst() {
                return null;
            }

            @Override
            public Object removeLast() {
                return null;
            }

            @Override
            public Object pollFirst() {
                return null;
            }

            @Override
            public Object pollLast() {
                return null;
            }

            @Override
            public Object getFirst() {
                return null;
            }

            @Override
            public Object getLast() {
                return null;
            }

            @Override
            public Object peekFirst() {
                return null;
            }

            @Override
            public Object peekLast() {
                return null;
            }

            @Override
            public boolean removeFirstOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean removeLastOccurrence(Object o) {
                return false;
            }

            @Override
            public boolean add(Object o) {
                return false;
            }

            @Override
            public boolean offer(Object o) {
                return false;
            }

            @Override
            public Object remove() {
                return null;
            }

            @Override
            public Object poll() {
                return null;
            }

            @Override
            public Object element() {
                return null;
            }

            @Override
            public Object peek() {
                return null;
            }

            @Override
            public void push(Object o) {

            }

            @Override
            public Object pop() {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Iterator iterator() {
                return null;
            }

            @Override
            public Iterator descendingIterator() {
                return null;
            }

            @Override
            public boolean isEmpty() {
                return false;
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

        ArrayDeque adq = new ArrayDeque();

        //Map
        //key value pairs

        Map map = new Map() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean containsKey(Object o) {
                return false;
            }

            @Override
            public boolean containsValue(Object o) {
                return false;
            }

            @Override
            public Object get(Object o) {
                return null;
            }

            @Override
            public Object put(Object o, Object o2) {
                return null;
            }

            @Override
            public Object remove(Object o) {
                return null;
            }

            @Override
            public void putAll(Map map) {

            }

            @Override
            public void clear() {

            }

            @Override
            public Set keySet() {
                return null;
            }

            @Override
            public Collection values() {
                return null;
            }

            @Override
            public Set<Entry> entrySet() {
                return null;
            }
        };

//        SortedMap
        TreeMap  treeMap = new TreeMap();

//key-value
        HashMap hashMap = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Hashtable hashtable = new Hashtable();

    }

}
