package colletion.list;

public class BatchProcessorMain {
    public static void main(String[] args) {
        MyArrayList<Integer> list1 = new MyArrayList<>(); // 5초
        MyLinkedList<Integer> list2 = new MyLinkedList<>(); // 0.64초
        
        BatchProcessor batchProcessor1 = new BatchProcessor(list1);
        BatchProcessor batchProcessor2 = new BatchProcessor(list2);
        batchProcessor1.login(1_000_000);
        batchProcessor2.login(1_000_000);
    }
}
