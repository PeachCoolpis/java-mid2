package colletion.set.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> collect = Arrays.stream(inputArr).collect(Collectors.toCollection(LinkedHashSet::new));
        for (Integer i : collect) {
            System.out.println(i);
        }
        
    }
}
