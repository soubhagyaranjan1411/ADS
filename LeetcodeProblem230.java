import java.util.Stack;

public class LeetcodeProblem230 {
    // find kth smallest element in a BST
    // APPROACH: use inorder traversal to get the elements in sorted order
    // then return the kth element
    public static int kthsmallest(TreeNode root,int k){
        Stack<TreeNode>stack=new Stack<>();
        while (true) { 
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(--k==0){
                return root.val;
            }
            root=root.right;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println("Kth Smallest Element: " + kthsmallest(root, 1));
    }
}
