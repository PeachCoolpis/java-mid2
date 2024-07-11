package colletion.utils;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OfMain {
    public static void main(String[] args) {
        // 편리한 불변 컬렉션 생성
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1, "one", 2, "two", 3, "three");
        
        System.out.println("list = " + list);
        System.out.println("set = " + set);
        System.out.println("map = " + map);
        System.out.println("list class = " + list.getClass());

//        List<Integer> collect = Stream.concat(list.stream(), Stream.of(4))
//                .toList();
//        System.out.println(collect);
    
    }
}
