class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        dfs(nums, used, res, curr);

        return res;
    }

    public void dfs(int[] nums, boolean[] used, List<List<Integer>> res, List<Integer> curr)
    {
        if(curr.size() == nums.length)
        {
            res.add(new ArrayList<>(curr));
            return;
        }

        for(int i=0; i<nums.length; i++)
        {
            if(used[i]) continue; //skimplements

            curr.add(nums[i]);
            used[i] = true;

            dfs(nums, used, res, curr);
            curr.remove(curr.size()-1);
            used[i] = false;
        }
    }
}
