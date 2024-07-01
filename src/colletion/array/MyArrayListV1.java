package colletion.array;

import java.util.Arrays;

public class MyArrayListV1 {
   
    private static final int DEFAULT_CAPACITY = 5; // 기본 수용 용량
    private Object[] elements; // 모든 오브젝트를 담을수 있는 멤버변수 선언
    private int size = 0;
    public MyArrayListV1() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    
    public MyArrayListV1(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }
    
    public int size() {
        return size;
    }
    
    public void add(Object o) {
        this.elements[size] = o;
        this.size++;
    }
    public Object get(int index) {
        return elements[index];
    }
    public Object set(int index, Object o) {
        Object oldValue = get(index);
        elements[index] = o;
        return oldValue;
    }
    public int indexOf(Object o) {
        if (o == null) {
            return -1;
        }
        for (int i = 0; i <size ; i++) {
            if (o.equals(this.elements[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public String toString() {
        String format = String.format(" size = %s , capacity = %s", size, this.elements.length);
        return Arrays.toString(Arrays.copyOf(elements, size)) + format;
    }
    
    public void clear() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    
    
}
