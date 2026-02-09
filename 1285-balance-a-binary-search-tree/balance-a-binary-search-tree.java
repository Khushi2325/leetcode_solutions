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
    public void inorder(TreeNode root, ArrayList<Integer> li){
        if(root == null) return;

        inorder(root.left, li);
        li.add(root.val);
        inorder(root.right, li);
    }

    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> li = new ArrayList<>();

        inorder(root, li);

        return sol(li, 0, li.size());
    }

    public TreeNode sol(ArrayList<Integer> li, int st, int en){
        if(st == en) return null;

        int mid = (st + en)/2;
        TreeNode root = new TreeNode(li.get(mid));

        root.left = sol(li, st, mid);
        root.right = sol(li, mid+1, en);

        return root;
    }
}