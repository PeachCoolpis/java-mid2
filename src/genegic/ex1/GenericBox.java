package genegic.ex1;

/**
 *  <> 를 사용한 클래스를 제너릭 클래스라 한다
 *  제네릭 클래스를 사용할때는 Integer , String 같은 타입을 미리 결정하지 않는다.
 *  T를 타입 매개변수라 한다. 이 타입 매개변수를 이후에 Integer , String 으로 변할수 있다.
 * @param <T>
 */
public class GenericBox<T> {
    private T value;
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T value) {
        this.value = value;
    }
}
