package colletion.set;

import java.util.Arrays;

public class HashStart2 {
    public static void main(String[] args) {
        //입력 1,2,5,8
        
        Integer[] intPutArray = new Integer[10];
        intPutArray[1] = 1;
        intPutArray[2] = 2;
        intPutArray[5] = 5;
        intPutArray[8] = 8;
        System.out.println("intPutArray = " + Arrays.toString(intPutArray));
        int searchValue = 8;
        //4번 value
        
        Integer result = intPutArray[searchValue];
        System.out.println("result = " + result);
    }
}
