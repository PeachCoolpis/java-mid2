package colletion.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] s = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String string : s) {
            map.put(string, map.getOrDefault(string, 0) + 1);
        }
        System.out.println(map);
        
        Map<String, Integer> collect = Arrays.stream(s)
                .collect(Collectors.toMap(
                        key -> key,
                        value -> 1,
                        Integer::sum
                ));
        System.out.println(collect);
    }
}
