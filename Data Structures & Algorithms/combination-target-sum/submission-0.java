class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();

        track(nums, res, curr, target, 0);
        return res;
    }

    public static void track(int[] nums, List<List<Integer>> res, List<Integer> curr, int target, int i)
    {
        if(target==0)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        if(target<0 || i>=nums.length) return;

        curr.add(nums[i]);
        track(nums, res, curr, target-nums[i], i);
        curr.remove(curr.size()-1);
        track(nums, res, curr, target, i+1);

    }
}
