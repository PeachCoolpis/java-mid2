package generic.ex3;

import generic.animal.Animal;

/**
 * Animal 이나 Animal의 상속 받은 자식클래스로 타입 제한
 *
 * @param <T> Animal
 */
public class AnimalHospitalV3<T extends Animal> {
    
    private T animal;
    
    public Animal get() {
        return animal;
    }
    
    public void set(T animal) {
        this.animal = animal;
    }
    
    public void checkup() {
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }
    
    public T bigger(T target) {
        return this.animal.getSize() > target.getSize() ? this.animal : target;
    }
}
