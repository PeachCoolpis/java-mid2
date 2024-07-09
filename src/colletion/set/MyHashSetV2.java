package colletion.set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.IntStream;

public class MyHashSetV2 {
    private final static int DEFAULT_INITIAL_CAPACITY = 16;
    private LinkedList<Object>[] buckets;
    
    private int size;
    private int capacity;
    
    public MyHashSetV2() {
        this.capacity = DEFAULT_INITIAL_CAPACITY;
        initBuket(capacity);
    }
    
    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuket(capacity);
    }
    
    public boolean add(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        if (bucket.contains(value) == true) {
            return false;
        }
        bucket.add(value);
        this.size++;
        return true;
    }
    
    public boolean contains(Object value) {
        int hashIndex = hashIndex(value); // 0(1)
        LinkedList<Object> bucket = buckets[hashIndex]; // 0(1)
        return bucket.contains(value); // O(n) -> 0(1)
    }
    
    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object> bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);
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
    
    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }
    
    
    private void initBuket(int capacity) {
        this.buckets = new LinkedList[capacity];
        IntStream.range(0, capacity)
                .forEach(i -> buckets[i] = new LinkedList<>());
    }
    
    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
