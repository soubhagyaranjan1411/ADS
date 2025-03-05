class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LeetcodeProblem112 {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        return leftSum || rightSum;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        int targetSum = 3;

        boolean result = hasPathSum(root, targetSum);
        System.out.println(result);
    }
}