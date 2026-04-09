class Solution {
    public static int trap(int[] height) {
        int front = 0, back = height.length - 1;
        int frontMax = height[front], backMax = height[back];
        int result = 0;

        while (front < back) {
            if (frontMax < backMax) {
                front++;
                frontMax = Math.max(frontMax, height[front]);
                result += frontMax - height[front];
            }

            else {
                back--;
                backMax = Math.max(backMax, height[back]);
                result += backMax - height[back];
            }
        }

        return result;
    }
}
