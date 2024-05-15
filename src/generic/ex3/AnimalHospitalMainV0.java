package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);
        
        dogHospital.setAnimal(dog);
        dogHospital.checkup();
        
        catHospital.setAnimal(cat);
        catHospital.checkup();
        
        dogHospital.checkup();
        
        // 문제1 : 개 병원에 고양이 전달
        // dogHospital.setAnimal(cat); // 다른 타입입력 : 컴파일오류
        
        // 문제2 : 개타입반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
        
    }
}
