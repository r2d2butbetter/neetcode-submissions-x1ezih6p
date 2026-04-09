class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }
        int maxlen = 0;
        for (Integer num : numSet) {

            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length++;
                }

                maxlen = Math.max(length, maxlen);
            }
        }

        return maxlen;
    }
}
