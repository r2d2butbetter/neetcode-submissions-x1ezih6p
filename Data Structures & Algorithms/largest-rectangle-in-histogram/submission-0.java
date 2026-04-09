class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stk = new Stack<>();
        int max = 0;
        stk.push(0);

        for (int i = 1; i < heights.length; i++) {
            while (!stk.empty() && heights[i] < heights[stk.peek()]) {
                max = getMax(heights, stk, max, i);

            }

            stk.push(i);
        }

        int i = heights.length;
        while (!stk.empty()) {
            max = getMax(heights, stk, max, i);
        }
        return max;
    }

    private static int getMax(int[] arr, Stack<Integer> stk, int max, int i) {
        int area;
        int popped = stk.pop();

        if (stk.empty()) {
            area = arr[popped] * i;
        } else {
            area = arr[popped] * (i - 1 - stk.peek());
        }
        return Math.max(max, area);
    }
}
