public class LCA {
    //LEETCODE 235
//find the lowest common ancestors of two given nodes in a BST
//APPRAOCH
//TARVERSE IN BST MOVE LEFT IF BOTH NODES ARE SMALLER THAN ROOT
//MOVE RIGHT IF BOTH NODES ARE GREATER THAN ROOT
    public static TreeNode LcA(TreeNode root,TreeNode p,TreeNode q){
        while(root!=null){
            if(p.val<root.val && q.val<root.val){
                root=root.left;
            }else if(p.val>root.val && q.val>root.val){
                root=root.right;
            }else{
                return root;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);
        TreeNode p = root.left;
        TreeNode q = root.right;
        System.out.println("Lowest Common Ancestor: " + LcA(root, p, q).val);
    }
}
