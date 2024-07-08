package colletion.list.test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    
    public ShoppingCart() {
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        this.items.add(item);
    }
    
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        this.items.forEach(item -> System.out.println(String.format("상품명:%s, 합계:%d", item.getName(),item.getTotalPrice())));
        int sum = items.stream().mapToInt(Item::getTotalPrice).sum();
        System.out.println("전체 가격 합:" + sum);
    }
}
