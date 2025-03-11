public class MaximumHeight {
    //find the maximum depth(height) of a binary tree
    //APPROACH:use recursion to traverse the tree
    public static int maxdep(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=maxdep(root.left);
        int right=maxdep(root.right);
        return Math.max(left,right)+1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("Maximum Depth: " + maxdep(root));
    }
}
