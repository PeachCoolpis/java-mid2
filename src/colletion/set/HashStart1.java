package colletion.set;

import java.util.Arrays;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] intPutArray = new Integer[4];
        intPutArray[0] = 1;
        intPutArray[1] = 2;
        intPutArray[2] = 5;
        intPutArray[3] = 8;
        System.out.println("intPutArray = " + Arrays.toString(intPutArray));
        int searchValue = 8;
        //4번 value
        for (Integer value : intPutArray) {
            if (value == searchValue) {
                System.out.println(value);
            }
        }
    }
}
