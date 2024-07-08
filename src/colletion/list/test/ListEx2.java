package colletion.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr = new ArrayList<>();
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true) {
            int i = sc.nextInt();
            if (i == 0) {
                break;
            }
            arr.add(i);
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <arr.size() ; i++) {
            stringBuilder.append(arr.get(i));
            if (i < arr.size() - 1) {
                stringBuilder.append(", ");
            }
        }
        System.out.println(stringBuilder.toString());
    }
    
    
}
