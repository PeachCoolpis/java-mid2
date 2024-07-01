package colletion.array;

import java.util.Arrays;

public class ArrayMain2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));
        
        // 배열의 첫번째 위치에 추가
        // 기본배열의 데이터를 한칸씩 뒤로 밀고 배열의 첫번째 위치에 추가
        
        int newValue = 3;
        addFirst(arr, newValue);
        System.out.println(Arrays.toString(arr));
        //index 위치에 추가
        int index = 2;
        int value = 4;
        addIndex(arr, index, value);
        addIndex(arr, 3, 4);
        
        System.out.println(Arrays.toString(arr));
        // 배열의 마지막 위치에 5를 추가
        
        addLast(arr, 5);
        System.out.println(Arrays.toString(arr));
        // 배열의 한계
        // 배열의 크기를 생성하는 시점에 정해야함
        
    }
    
    private static void addLast(int[] arr, int value) {
        arr[arr.length - 1] = value;
        
    }
    
    private static void addIndex(int[] arr, int index, int value) {
        for (int i = arr.length - 1; i < index; i++) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
    }
    
    private static void addFirst(int[] arr, int newValue) {
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = newValue;
    }
}
