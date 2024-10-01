package ss11_stack_queue.Thuc_Hanh.Queue;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean check = false;
        if (currentSize == capacity) {
            check = true;
        }
        return check;
    }

    public boolean isQueueEmpty() {
        boolean check = false;
        if (currentSize == 0) {
            check = true;
        }
        return check;
    }

}
