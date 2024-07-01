package colletion.array;

import java.util.Arrays;

public class MyArrayListV3 {
    
    private static final int DEFAULT_CAPACITY = 5; // 기본 수용 용량
    private Object[] elements; // 모든 오브젝트를 담을수 있는 멤버변수 선언
    private int size = 0;
    
    public MyArrayListV3() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    
    public MyArrayListV3(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }
    
    public int size() {
        return size;
    }
    
    public void add(Object o) {
        //코드 추가
        if (size == elements.length) {
            grow();
        }
        this.elements[size] = o;
        this.size++;
    }
    
    public void add( int index,Object o) {
        if (size == elements.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        this.elements[index] = o;
        this.size++;
    }
    
    //코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
    }
    
    //코드 추가
    public Object remove(int index) {
        Object oldValue = get(index);
        //데이터 이동
        shiftLeftFrom(index);
        this.size--;
        this.elements[this.size] = null;
        return oldValue;
    }
    
    private void shiftLeftFrom(int index) {
        for (int i = index; i < size - 1; i++) {
            this.elements[i] = elements[i + 1];
        }
    }
    
    //코드 추가
    private void grow() {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고 , 기존 배열을 새로운 배열에 복사
        this.elements = Arrays.copyOf(elements, newCapacity);
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
        for (int i = 0; i < size; i++) {
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
