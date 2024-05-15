package generic.test.ex5;

import generic.animal.Animal;

public class WildcardEx {
    
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }
    
    /**
     * Box<Dog> Box<Cat> Box<Object>
     * @param box
     */
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.get());
    }
    
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.get();
        System.out.println("t = " + t.getName());
    }
    
    static  void printWildV2(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("t = " + animal.getName());
    }
    
    
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("t = " + t);
        return t;
    }
    static  Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.get();
        System.out.println("t = " + animal.getName());
        return animal;
    }
}
