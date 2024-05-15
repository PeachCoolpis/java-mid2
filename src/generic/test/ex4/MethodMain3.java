package generic.test.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);
        
        
        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog); // 제네릭 클래스는 Dog 로 바뀜
        
        Cat returnCat = hospital.printAndReturn(cat); // 제네릭 메서드는 cat으로 바뀜
        System.out.println("returnCat = " + returnCat);
        
        //제네릭 클래스 보다 제네릭 클래스가 더 큰 우선순위 를 가진다.
    }
}
