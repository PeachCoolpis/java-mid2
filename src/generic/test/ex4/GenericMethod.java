package generic.test.ex4;

import generic.animal.Animal;

public class GenericMethod {
    
    public static Object objMethod(Object obj) {
        System.out.println("obj = " + obj);
        return obj;
    }
    
    /**
     * public static 이후 <T> 타입매개변수 선언후 원하는 타입매개변수 선언
     * 그러면 메서드에 한해서 제네릭 메서드 사용
     * @param obj
     * @return
     * @param <T>
     */
    public static <T> T genericMethod(T t) {
        System.out.println("t = " + t);
        return t;
    }
    
    /**
     * 제네릭 메서드도 타입 제한을 할수 있다.
     * @param t
     * @return
     * @param <T>
     */
    public static <T extends Number> T numberMethod(T t) {
        System.out.println("obj = " + t);
        return t;
    }
    
    public <T extends Animal> T test(T t) {
        System.out.println("t = " + t.getName());
        return t;
    }
    
}
