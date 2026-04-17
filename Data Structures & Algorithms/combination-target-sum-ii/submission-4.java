class Solution {
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        track(nums, res, curr, target, 0);

        return res;
    }

        public void track(int[] nums, List<List<Integer>> res, List<Integer> curr, int target, int i)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }

        if(i>=nums.length || target<0)
        {
           return;
        }

        curr.add(nums[i]);
        track(nums, res, curr, target-nums[i], i+1);
        curr.remove(curr.size()-1);


        while (i + 1 < nums.length && nums[i] == nums[i + 1]) {
        i++;
    }
        track(nums, res, curr, target, i+1);
    }
}

