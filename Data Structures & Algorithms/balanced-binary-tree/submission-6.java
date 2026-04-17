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
    public boolean isBalanced(TreeNode root) {
        return dfs(root);
    }


    public boolean dfs(TreeNode root)
    {
        Stack<TreeNode> stk = new Stack<>();

        TreeNode node = root, last =null;
        Map<TreeNode, Integer> depths = new HashMap<>();

        while(!stk.isEmpty() || node!=null)
        {
            if(node!=null)
            {
                stk.push(node);
            node = node.left;
            }

            else{

                node = stk.peek();
                if(node.right==null || last==node.right)
                {
                    stk.pop();
                    int left = depths.getOrDefault(node.left, 0);
                    int right = depths.getOrDefault(node.right, 0);

                    if(Math.abs(left-right)> 1) return false;

                    depths.put(node, 1+ Math.max(left, right));
                    last = node;
                    node=null;
                }
                else{
                    node = node.right;
                }
            }
        }

        return true;
    }
}
