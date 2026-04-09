class MinStack {

    long min;
    Stack<Long> stk;

    public MinStack() {
        stk = new Stack<>();
    }

    public void push(int val) {
        if (stk.empty()) {
            stk.push(0L); // the difference is 0;
            min = val;
        } else {
            stk.push(val-min);// this will end up being -ve when the min changes!!
            if (val < min) {
                min = val;
            }
        }
    }

    public void pop() {
        long val = stk.pop();

        if (val < 0) {
            min = min - val; // min had changed and we recover it
        }
    }

    public int top() {
        long val = stk.peek();
        if (val > 0) {
            return (int) (val + min);
        }
        return (int) min;
    }

    public int getMin() {
        return (int) min;
    }
}