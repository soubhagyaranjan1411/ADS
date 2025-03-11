import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
public class LeetcodeProblem94 {
    //given the root of a binary tree, return the inorder traversal of its nodes' values
    //APPROACH:use recursion(dfs) to traverse the tree
    //then we are going to visit root.left, then root, then root.right
    public static List<Integer> inorderTraversal(TreeNode root){
        List<Integer> res=new ArrayList<>();
        Stack<TreeNode>stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!stack.isEmpty()){
            while(curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));
    }
}
