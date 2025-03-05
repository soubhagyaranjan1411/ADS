class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LeetcodeProblem100 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);

        boolean result = isSameTree(p, q);
        System.out.println(result);
    }
}