package generic.ex1;

import generic.ex1.IntegerBox;
import generic.ex1.StringBox;

public class BoxMain1 {
    
    public static void main(String[] args) {
        IntegerBox integerBox = new IntegerBox();
        integerBox.setValue(10); // 오토박싱
        Integer value = integerBox.getValue();
        System.out.println("value = " + value);
        
        StringBox stringBox = new StringBox();
        stringBox.set("hello");
        String str = stringBox.get();
        System.out.println("str = " + str);
        
    }
}
