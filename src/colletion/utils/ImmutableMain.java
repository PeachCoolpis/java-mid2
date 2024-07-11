package colletion.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ImmutableMain {
    public static void main(String[] args) {
        // 불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);
        List<Integer> arrayList = new ArrayList<>(list);
        
        //Stream.concat(list.stream() , Stream.of(5))
        //              .collect(Collectors.toList());
        // 가변리스트
        arrayList.add(4);
        System.out.println(arrayList);
        System.out.println("mutableList = " + arrayList);
        System.out.println("mutableList class" + arrayList.getClass());
        
        //불변 리스트
        List<Integer> unmodifiableList = Collections.unmodifiableList(arrayList);
        System.out.println("unmodifiableList class" + unmodifiableList.getClass());
    }
}
