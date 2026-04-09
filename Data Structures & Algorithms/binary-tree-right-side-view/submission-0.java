/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        dfs(root, 0, list);

        return list;
    }


    public void dfs(TreeNode node, int depth, List<Integer> res)
    {
        if (node==null) {
            return;
        }

        if (res.size()==depth)//MEANS WE ARE THE FIRST TO REACH THIS DEPTH
        {
            res.add(node.val);
        }

        dfs(node.right, depth+1, res);
        dfs(node.left, depth+1, res);//try left after right because above if condition...
    }

}