package colletion.iterable;

import java.util.*;

public class JavaIterableMain {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        printAll(list.iterator());
        foreach(list);
        
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(set.iterator());
        foreach(set);
    }
    
    private static void foreach(Iterable<Integer> list) {
        System.out.println("list.getClass() = " + list.getClass());
        for (Integer i : list) {
            System.out.println(i);
        }
    }
    
    private static void printAll(Iterator<Integer> iterator) {
        System.out.println(iterator.getClass());
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
