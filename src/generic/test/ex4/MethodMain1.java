package generic.test.ex4;

import generic.animal.Dog;

public class MethodMain1 {
    
    public static void main(String[] args) {
        Integer i = 10;
        
        Integer o = (Integer) GenericMethod.objMethod(i); // 캐스팅 해야함
        
        // 타입 인자 (Type Argument) 명시적 전달
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);// 타입인자 전달
        Integer integerValue = GenericMethod.<Integer>numberMethod(i);
        Double aDouble = GenericMethod.<Double>numberMethod(20.0);
        
        GenericMethod genericMethod = new GenericMethod();
        Dog gd = genericMethod.test(new Dog("gd", 100));
        
        
        
    }
    
}
