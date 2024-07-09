package colletion.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class MyHashSetV1 {
    private final static int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Integer>[] buckets;
    
    private int size;
    private int capacity;
    
    public MyHashSetV1() {
        this.capacity = DEFAULT_INITIAL_CAPACITY;
        initBuket(capacity);
    }
    
    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuket(capacity);
    }
    
    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if (bucket.contains(value) == true) {
            return false;
        }
        bucket.add(value);
        this.size++;
        return true;
    }
    
    public boolean contains(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(value);
    }
    
    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(hashIndex));
        if (result) {
            this.size--;
            return true;
        } else {
            return false;
        }
    }
    
    public int size() {
        return this.size;
    }
    
    private int hashIndex(int value) {
        return value % capacity;
    }
    
    
    private void initBuket(int capacity) {
        this.buckets = new LinkedList[capacity];
        IntStream.range(0, capacity)
                .forEach(i -> buckets[i] = new LinkedList<>());
    }
    
    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
