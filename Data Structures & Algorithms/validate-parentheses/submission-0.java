class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '{' || ch == '[' || ch == '(') {
                stk.push(ch);
            } else if (ch == '}' || ch == ']' || ch == ')') {
                                if (stk.isEmpty()) {
                    return false;
                }
                
                if (ch == '}' && stk.peek() == '{') {
                    stk.pop();
                } else if (ch == ']' && stk.peek() == '[') {
                    stk.pop();
                } else if (ch == ')' && stk.peek() == '(') {
                    stk.pop();
                } else {
                    return false;
                }
            }
        }
        if (stk.isEmpty()) {
            return true;
        }
        return false;
    }
}