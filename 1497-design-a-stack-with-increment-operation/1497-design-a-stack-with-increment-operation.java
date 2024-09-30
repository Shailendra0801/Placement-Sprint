class CustomStack {
    int[] stk;
    int s, top;
    public CustomStack(int maxSize) {
        stk = new int[maxSize];
        s = maxSize;
        top = 0;
    }
    
    public void push(int x) {
        if(top != s){
            stk[top++] = x;
        }
    }
    
    public int pop() {
        if(top == 0)
            return -1;
        else{
            int val = stk[--top];
            return val;
        }
    }
    
    public void increment(int k, int val) {
        int n = Math.min(k, top);
        for(int i = 0; i < n; i++){
            stk[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */