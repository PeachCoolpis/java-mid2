package colletion.iterable;

import java.util.Iterator;

public class MyArrayIterator implements Iterator<Integer> {
    
    private int currentIndex;
    private int[] targetArr;
    
    public MyArrayIterator(int[] targetArr) {
        this.currentIndex = -1;
        this.targetArr = targetArr;
    }
    
    @Override
    public boolean hasNext() {
        return currentIndex < targetArr.length - 1;
    }
    
    @Override
    public Integer next() {
        currentIndex++;
        return targetArr[currentIndex];
    }
}
