package colletion.array;

public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        String s = stringList.get(0);
        System.out.println("s = " + s);
        System.out.println("stringList = " + stringList);
        MyArrayListV4<Integer> intList = new MyArrayListV4<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.addBad("ddddd");
        System.out.println("intList = " + intList);
        // 제네릭을 사용함으로써 타입안정성을 보장
        Integer i = intList.get(3); // 메서드에서 제네릭에 맞지않는 타입을 사용하면 ClassCastException 발생
        System.out.println(i);
        
    }
}
