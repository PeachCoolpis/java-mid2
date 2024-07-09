package colletion.set.test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        Set<Integer> collect = Arrays.stream(inputArr)
                .collect(Collectors.toCollection(TreeSet::new));
        for (Integer i : collect) {
            System.out.println(i);
        }
    }
}
