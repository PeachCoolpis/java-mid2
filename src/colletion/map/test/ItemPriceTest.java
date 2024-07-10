package colletion.map.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        // 코드 작성
        List<String> list = new ArrayList<>();
        map
                .entrySet()
                .stream()
                .filter(m -> m.getValue() > 500)
                .forEach(m -> list.add(m.getKey()));
        System.out.println(list);
    }
}
