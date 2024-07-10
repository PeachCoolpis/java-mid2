package colletion.iterable;

import java.util.Iterator;

public class MyArrMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});
        Iterator<Integer> iterator = myArray.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
