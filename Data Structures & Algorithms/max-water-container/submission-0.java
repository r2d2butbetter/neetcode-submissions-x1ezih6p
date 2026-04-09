class Solution {
    public static int maxArea(int[] heights) {
        int front = 0, back = heights.length - 1;
        int max = 0;

        while (front < back) {
            int capacity;

            if (heights[front] < heights[back]) {
                capacity = (back - front) * heights[front];
                front++;
            } else {
                capacity = (back - front) * heights[back];
                back--;
            }

            max = Math.max(capacity, max);
        }
        return max;
    }
}
