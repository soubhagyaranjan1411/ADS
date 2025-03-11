import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class LeetcodeProblem257 {
    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", paths);
        }
        return paths;
    }

    private static void findPaths(TreeNode node, String path, List<String> paths) {
        if (node.left == null && node.right == null) {
            paths.add(path + node.val);
        }
        if (node.left != null) {
            findPaths(node.left, path + node.val + "->", paths);
        }
        if (node.right != null) {
            findPaths(node.right, path + node.val + "->", paths);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);

        List<String> result = binaryTreePaths(root);
        for (String path : result) {
            System.out.println(path);
        }
    }
}
