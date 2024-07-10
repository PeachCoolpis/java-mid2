package colletion.deque.test;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    private Deque<String> history;
    private String currentPage;
    
    public BrowserHistory() {
        this.history = new ArrayDeque<>();
    }
    
    public void visitPage(String value) {
        if (currentPage != null) {
            history.push(currentPage);
        }
        currentPage = value;
        System.out.println("방문: " + value);
    }
    
    public String goBack() {
        if (!this.history.isEmpty()) {
            this.currentPage = this.history.pop();
            System.out.println("뒤로 가기: " + this.currentPage);
            return currentPage;
        }
        return null;
    }
}
