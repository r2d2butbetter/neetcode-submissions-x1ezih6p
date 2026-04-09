class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stk = new Stack<>();

        for (String c : tokens) {
            if (c.equals("+")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top2 + top1);

            } else if (c.equals("-")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top2 - top1);
            }

            else if (c.equals("*")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top2 * top1);
            }

            else if (c.equals("/")) {
                int top1 = stk.pop();
                int top2 = stk.pop();
                stk.push(top2 / top1);
            } else {
                stk.push(Integer.parseInt(c));
            }
        }
        return stk.pop();
    }
}
