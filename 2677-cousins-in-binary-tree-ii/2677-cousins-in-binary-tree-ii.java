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
    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null)
            return null;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        root.val = 0;
        while(!queue.isEmpty()){
            int lvlSum = 0;
            int n = queue.size();
            List<TreeNode> curr = new ArrayList<>();
            for(int i = 0; i < n; i++){
                TreeNode node = queue.poll();
                curr.add(node);
                if(node.left != null){
                    queue.add(node.left);
                    lvlSum += node.left.val;
                }
                if(node.right != null){
                    queue.add(node.right);
                    lvlSum += node.right.val;
                }
            }
            for(TreeNode node : curr){
                int sibSum = 0;
                if(node.left != null)
                    sibSum += node.left.val;
                if(node.right != null)
                    sibSum += node.right.val;
                if(node.left != null)
                    node.left.val = lvlSum - sibSum;
                if(node.right != null)
                    node.right.val = lvlSum - sibSum;
            }
        }

        return root;
    }
}