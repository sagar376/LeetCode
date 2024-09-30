class CustomStack {
    int[] st;
    int front;


    public CustomStack(int maxSize) {
        st = new int[maxSize];
        front = -1;
    }
    
    public void push(int x) {
        if(front < st.length -1)
        {
            st[++front] = x;
        }
    }
    
    public int pop() {
        if(front >= 0)
        {
            return st[front--];
        }
        return -1;
    }
    
    public void increment(int k, int val) {
        int limit = Math.min(k, front + 1 );
        for(int i = 0; i < limit; i++)
        {
            st[i] += val;
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