class MinStack {
    Stack<Integer> st = new Stack<>();
    int min;
    public MinStack() {
        this.min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if(val <= min) {
            st.push(min);
            min = val;
        }
        st.push(val);
    }
    
    public void pop() {
        if(st.pop() == min) min = st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min;
    }
}
