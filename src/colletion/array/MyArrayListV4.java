package colletion.array;

import java.util.Arrays;

public class MyArrayListV4<E> {
    
    private static final int DEFAULT_CAPACITY = 5; // 기본 수용 용량
    private Object[] elements; // 모든 오브젝트를 담을수 있는 멤버변수 선언
    private int size = 0;
    
    public MyArrayListV4() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }
    
    public MyArrayListV4(int initialCapacity) {
        // 타입 이레이저 때문에 다음과 같은 코드는 불가능합니다:
        // this.elements = new E[initialCapacity];
        // 제네릭 타입 정보는 컴파일 타임에만 존재하고 런타임에는 제거되기 때문에
        // new E[]를 사용하여 배열을 생성할 수 없습니다. 대신 Object[]를 사용합니다.
        this.elements = new Object[initialCapacity];
    }
    
    public int size() {
        return size;
    }
    
    public void add(E o) {
        //코드 추가
        if (size == elements.length) {
            grow();
        }
        this.elements[size] = o;
        this.size++;
    }
    
    public void add( int index,E o) {
        if (size == elements.length) {
            grow();
        }
        // 데이터 이동
        shiftRightFrom(index);
        this.elements[index] = o;
        this.size++;
    }
    // 이상한 메서드를 추가한경우
    public void addBad(String o) {
        if (size == elements.length) {
            grow();
        }
        // 데이터 이동
        this.elements[size] = o;
        this.size++;
    }
    
    //코드 추가, 요소의 마지막부터 index까지 오른쪽으로 밀기
    private void shiftRightFrom(int index) {
        for (int i = size; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
    }
    
    //코드 추가
    public E remove(int index) {
        E oldValue = get(index);
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
    @SuppressWarnings("unchecked") // 어노테이션 주석 , 경고를 없애줌
    public E get(int index) {
        return (E) elements[index];
    }
    
    public E set(int index, E o) {
        E oldValue = get(index);
        elements[index] = o;
        return oldValue;
    }
    
    public int indexOf(E o) {
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
