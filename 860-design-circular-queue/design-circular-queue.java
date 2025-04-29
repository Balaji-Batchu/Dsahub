class MyCircularQueue {
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        capacity = k;
        buffer = new int[k];
        head = 0;
        tail = 0;
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if(size == capacity) return false;
        
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
        size ++;

        return true;
    }
    
    public boolean deQueue() {
        if(size == 0) return false;

        head = (head + 1) % capacity;
        size --;

        return true;
    }
    
    public int Front() {
        if(size == 0) return -1;
        
        return buffer[head];
    }
    
    public int Rear() {
        if(size == 0) return -1;
        
        return buffer[(tail - 1 + capacity) % capacity];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */