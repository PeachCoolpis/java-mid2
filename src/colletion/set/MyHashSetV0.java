package colletion.set;

import java.util.Arrays;

public class MyHashSetV0 {
    private int[] elementData;
    private int size;
    
    public MyHashSetV0() {
        this.elementData = new int[10];
        this.size = 0;
    }
    
    public boolean add(int value) {
        if (contains(value)) {
            return false;
        }
        this.elementData[size] = value;
        size++;
        return true;
    }
    
    public boolean contains(int value) {
        return Arrays.stream(elementData).anyMatch(i -> i == value);
    }
    
    public int size() {
        return this.size;
    }
    
    @Override
    public String toString() {
        return "MyHashSetV0{" +
                "elementData=" + Arrays.toString(Arrays.copyOf(this.elementData,this.size)) +
                ", size=" + size +
                '}';
    }
}
