class MyCircularDeque {
    Deque<Integer> deque;
    int capacity;
    public MyCircularDeque(int k) {
        deque = new ArrayDeque<>();
        capacity = k;
    }
    
    public boolean insertFront(int value) {
        if(deque.size() < capacity)
            return deque.offerFirst(value);
        else
            return false;
    }
    
    public boolean insertLast(int value) {
        if(deque.size() < capacity)
            return deque.offerLast(value);
        else
            return false;
    }
    
    public boolean deleteFront() {
        if(!deque.isEmpty()){
            deque.pollFirst();
            return true;
        }
        else
            return false;
    }
    
    public boolean deleteLast() {
        if(!deque.isEmpty()){
            deque.pollLast();
            return true;
        }
        else
            return false;
    }
    
    public int getFront() {
        if(!deque.isEmpty())
            return deque.peekFirst();
        else
            return -1;
    }
    
    public int getRear() {
        if(!deque.isEmpty())
            return deque.peekLast();
        else return -1;
    }
    
    public boolean isEmpty() {
        return deque.isEmpty();
    }
    
    public boolean isFull() {
        return (deque.size() == capacity);
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */