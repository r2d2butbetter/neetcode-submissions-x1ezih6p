class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] top = new int[k];
        Hashtable<Integer, Integer> tb = new Hashtable<>();
        //key, val ---> num, freq
        //fill the hashtable
        for (int i = 0; i < nums.length; i++) {
            if (tb.containsKey(nums[i])) {
                int val = tb.get(nums[i]) +1;
                tb.put(nums[i], val);
            }
            else
            {
                tb.put(nums[i], 1);
            }
        }

        // Find k elements with highest frequency
        for (int i = 0; i < k; i++) {
            int maxKey = -1;
            int maxFreq = -1;
            for (Integer key : tb.keySet()) {
                if (tb.get(key) > maxFreq) {
                    maxFreq = tb.get(key);
                    maxKey = key;
                }
            }
            top[i] = maxKey;
            tb.remove(maxKey);
        }
        return top;
    }
}
