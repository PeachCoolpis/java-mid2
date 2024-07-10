package colletion.deque.test;

import java.util.ArrayDeque;
import java.util.Queue;

public class TaskScheduler {
    private Queue<Task> tasks = new ArrayDeque<>();
    
    public void addTask(Task task) {
        this.tasks.offer(task);
    }
    
    public int getRemainingTasks() {
        return this.tasks.size();
    }
    
    public void processNextTask() {
        Task task = tasks.poll();
        if (task != null) {
            task.execute();
        }
    }
}
