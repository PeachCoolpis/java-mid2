package colletion.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    
    private Map<Product, Integer> map;
    
    public Cart() {
        this.map = new HashMap<>();
    }
    
    public void add(Product product, int quantity) {
        Integer value = this.map.getOrDefault(product, 0);
        this.map.put(product, value + quantity);
    }
    
    
    public void minus(Product product, int quantity) {
        if (this.map.containsKey(product)) {
            Integer value = this.map.get(product);
            if (quantity > value) {
                System.out.println("삭제하실 수량이 더 많습니다.");
            } else {
                if (0 >= value - quantity) {
                    this.map.remove(product);
                } else {
                    this.map.put(product, value - quantity);
                }
            }
        }
        
    }
    
    public void printAll() {
        System.out.println("==모든 상품 출력==");
        for (Map.Entry<Product, Integer> productIntegerEntry : map.entrySet()) {
            System.out.println("상품: " + productIntegerEntry.getKey() + "수량: " + productIntegerEntry.getValue());
        }
    }
    
}
