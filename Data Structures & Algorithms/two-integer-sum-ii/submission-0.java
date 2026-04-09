class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int front = 0, back = numbers.length - 1;

        while (front < back) {
            if (numbers[front] + numbers[back] < target) {
                front++;
            } else if (numbers[front] + numbers[back] > target) {
                back--;
            } else {
                return new int[] { front + 1, back + 1 }; // one indexed!!
            }
        }

        return new int[] {};
    }
}
