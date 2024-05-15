package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {
    
    private T animal;
    
    public Animal get() {
        //  return animal;
        return null;
    }
    
    public void set(T animal) {
        this.animal = animal;
    }
    
    public void checkup() {
        animal.toString();
        animal.equals(null);
        // 타입매개변수는 메서드를 정의하는 시점에는 알수없다. Object의 기능만 사용
        //  System.out.println("동물 이름 : " + animal.getName());
        // System.out.println("동물 크기 : " + animal.getSize());
        //  animal.sound();
    }
    
    public Animal bigger(Animal target) {
        // 컴파일 오류
        // return this.animal.getSize() > target.getSize() ? this.animal : target;
        return null;
    }
}
