class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> m = new HashMap<>();
        //num, index(originally)

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i],i);
        }


        for (int i = 0; i < nums.length; i++) {
            
            int diff = target-nums[i];

            if (m.containsKey(diff) && m.get(diff)!=i) {
                return new int[]{i, m.get(diff)};
            }
        }

        return new int[]{0,0};
    }
}