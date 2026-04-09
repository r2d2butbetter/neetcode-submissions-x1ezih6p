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

    // public List<Integer> rightSideView(TreeNode root) {
    //     List<Integer> list = new ArrayList<>();

    //     dfs(root, 0, list);

    //     return list;
    // }

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int level_size = queue.size();
            List<Integer> level_ele = new ArrayList<>(level_size);

            int i = 0;
            for (i = 0; i < level_size; i++) {
                TreeNode curr = queue.poll();
                level_ele.add(0, curr.val);

                if (curr.left != null)
                    queue.offer(curr.left);
                if (curr.right != null)
                    queue.offer(curr.right);

            }
            result.add(level_ele.getFirst());
        }
        return result;
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