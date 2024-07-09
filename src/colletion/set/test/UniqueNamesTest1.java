package colletion.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        
        HashSet<Integer> collect = Arrays.stream(inputArr)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(collect);
        Set<Integer> set = new HashSet<>();
        for (Integer value : inputArr) {
            set.add(value);
        }
        System.out.println(set);
        for (Integer i : collect) {
            System.out.println(i);
        }
    }
}
