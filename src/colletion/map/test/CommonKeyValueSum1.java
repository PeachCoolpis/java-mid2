package colletion.map.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);
        // 코드 작성
        
        Map<String, Integer> collect = map1.keySet()
                .stream()
                .filter(map2::containsKey)
                .collect(Collectors.toMap(
                        key -> key,
                        key -> map1.get(key) + map2.get(key)
                ));
        System.out.println(collect);
        
    }
}
