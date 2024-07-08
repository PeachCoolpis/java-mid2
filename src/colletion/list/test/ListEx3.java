package colletion.list.test;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        List<Integer> list = new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            int i = sc.nextInt();
            if (i == 0) {
                break;
            }
            list.add(i);
        }
        int sum = list.stream().mapToInt(i -> i).sum();
        double avg = list.stream().mapToDouble(i -> i).average().getAsDouble();
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);
        
    }
}
