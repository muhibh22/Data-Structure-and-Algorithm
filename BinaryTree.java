import java.util.Stack;
public class BinaryTree {
    private TreeNode root;

    
    private class TreeNode{
        private  TreeNode left;
        private TreeNode right;
        private int data;
        public TreeNode(int data){
            this.data=data;
        }
    }
    public void createBinaryTree(){
        TreeNode first=new TreeNode(9);
        TreeNode second=new TreeNode(2);
        TreeNode third=new TreeNode(3);
        TreeNode fourth=new TreeNode(4);
        root=first;
        first.left=second;
        first.right=third;
        second.left=fourth;
    }

    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print(root.data+ " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderStack(){
        if(root==null){
            return;
        }
        Stack <TreeNode> stack=new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode temp=stack.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null){
                stack.push(temp.right);
            }
            if(temp.left!=null){
                stack.push(temp.left);
            }
        }
        System.out.println();

    }
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
        System.out.println();
        bt.preOrderStack();
    }
}
