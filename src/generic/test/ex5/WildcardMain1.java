package generic.test.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        
        dogBox.set(new Dog("멍멍이",100));
        
        WildcardEx.printGenericV1(dogBox);
        WildcardEx.printGenericV2(dogBox);
        Dog dog = WildcardEx.printAndReturnGeneric(dogBox);
        
        WildcardEx.printWildcardV1(dogBox); // 와일드 카드
        WildcardEx.printWildV2(dogBox);
        
        
        Animal animal = WildcardEx.printAndReturnWildcard(dogBox);
        
        catBox.set(new Cat("야옹이",200));
        WildcardEx.printAndReturnGeneric(catBox);
        
        
        
    }
    
    
}
