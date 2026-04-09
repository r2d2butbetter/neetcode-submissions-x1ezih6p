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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root==null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); //offer-add, poll-remove (FIFO fashion)

        while(!queue.isEmpty())
        {
            List<Integer> thislevel = new ArrayList<>();
            int count_of_level = queue.size();

            for(int i =0; i<count_of_level; i++)
            {
                TreeNode curr = queue.poll();
                thislevel.add(curr.val);

                if(curr.left!=null) queue.offer(curr.left);
                if(curr.right!=null) queue.offer(curr.right);
            }

            result.add(thislevel);
        }

return result;
    }
}
