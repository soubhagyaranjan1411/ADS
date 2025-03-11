public class DiameterOfBinary {
    //problem statement:the diameter of a binary tree is the length of the longest path between any two nodes in a tree
    //Approach:use recusrion to find the height of the left and right subtree
    //update the maximim diameter at each node

    static int diameter=0;
    public static int diameterOfBT(TreeNode root){
        height(root);
        return diameter;
    }
    public static int height(TreeNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println("Diameter of the binary tree is: " + diameterOfBT(root));
    }
}

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}
