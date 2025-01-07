public class DFS {
    public static void main(String[] args) {

    }

    public static void preorder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preorder(root.left);
        preorder(root.right);
        return;
    }
    
}
