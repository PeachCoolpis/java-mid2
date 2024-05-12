package generic.test.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        
        AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        AnimalHospitalV1 catHospital = new AnimalHospitalV1();
        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("야옹이1", 300);
        
        dogHospital.set(dog);
        dogHospital.checkup();
        
        catHospital.set(cat);
        catHospital.checkup();
        
        dogHospital.checkup();
        
        // 문제1 : 개 병원에 고양이 전달
         dogHospital.set(cat); // 매개변수 체크 실패 컴파일 오류가 발생하지않음
        
        // 문제2 : 개타입반환
        dogHospital.set(dog);
        Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200)); // 캐스팅 해야함
        
        System.out.println("biggerDog = " + biggerDog);
        
    }
}
