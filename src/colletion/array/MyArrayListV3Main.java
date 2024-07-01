package colletion.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();
        System.out.println(list);
       //마지막에 추가
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        //원하는 위치 에 추가
        list.add(2,"addLast");
        System.out.println(list);
        list.add(0,"addFirst");
        
        Object remove1 = list.remove(4);
        System.out.println("remove(4) = " + remove1);
        System.out.println(list);
        Object remove2 = list.remove(0);
        System.out.println("remove(0) = " + remove2);
        System.out.println(list);
        
        //지금까지 만든 자료구조는 배열리스트 라고 한다.
        // 배열리스트의 특징은
        // 마지막에 추가 O(1)
        // 앞 중간에 추가(On)
        // 데이터 삭제
        // 마지막에 삭제 O(1)
        // 앞 중간에 삭제 O(n)
        // 인덱스 조회 O(1)
        // 데이터 검색 O(n)
        
    }
}
