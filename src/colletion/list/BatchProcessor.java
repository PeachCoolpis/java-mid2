package colletion.list;

public class BatchProcessor {
    
    private final MyList<Integer> list;
    
    public BatchProcessor(MyList<Integer> list) { // 의존성을 주입받아서 코드 수정을 최소화
        this.list = list;
    }
    
    public void login(int size) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <size ; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        String format = String.format("크기 = %s, 계산시간 = %sms", size, (endTime - startTime));
        System.out.println(format);
    }
}
