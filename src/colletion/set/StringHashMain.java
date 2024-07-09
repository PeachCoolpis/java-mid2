package colletion.set;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringHashMain {
    static int CAPACITY = 10;
    
    public static void main(String[] args) {
        //char
        char charA = 'A';
        char charB = 'B';
        System.out.println(charA + " = " + (int)charA);
        System.out.println(charB + " = " + (int)charB);
        //hashCode
        System.out.println("hashCode(A) = " + hashCode("A"));
        System.out.println("hashCode(B) = " + hashCode("B"));
        System.out.println("hashCode(AB) = " + hashCode("AB"));
        //hashIndex
        System.out.println("hashIndex(A) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(B) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(AB) = " + hashIndex(hashCode("AB")));
        
    }
    static int hashCode(String str) {
        return str.chars().sum();
    }
    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
