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
    int postIndex;
    Map<Integer, Integer> inorderIndexMap;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        inorderIndexMap = new HashMap<>();
        
        for(int i = 0; i< inorder.length; i++){
            inorderIndexMap.put(inorder[i], i);
        }
        return buildTreeRecursive(inorder, postorder, 0, inorder.length - 1);
    }
    
    private TreeNode buildTreeRecursive(int []inorder, int []postorder, int inorderStart, int inorderEnd){
        if(inorderStart > inorderEnd){
            return null;
        }
        
        int rootVal = postorder[postIndex];
        postIndex = postIndex - 1;
        System.out.println("RootVal: => " + rootVal);
        
        
        TreeNode root = new TreeNode(rootVal);
        
        int inorderIndex = inorderIndexMap.get(rootVal);
        
        root.right = buildTreeRecursive(inorder, postorder, inorderIndex + 1, inorderEnd);
        root.left = buildTreeRecursive(inorder, postorder, inorderStart, inorderIndex - 1);
        
        return root;
    }
    
}