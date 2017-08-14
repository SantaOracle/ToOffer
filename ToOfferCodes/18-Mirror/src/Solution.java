import java.util.Stack;

/**
 * Created by Administrator on 2017/8/14.
 */
public class Solution {
    public void Mirror(TreeNode root) {
        doMirror(root);
    }

    private TreeNode doMirror(TreeNode index){
        if (index == null) return null;
        doMirror(index.left);
        doMirror(index.right);
        TreeNode exchangeTemp = index.left;
        index.left = index.right;
        index.right = exchangeTemp;
        return index;
    }

    private void doMirrorByStack(TreeNode root){
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.empty()) {
            TreeNode node = stack.pop();
            if(node.left != null || node.right != null) {
                TreeNode nodeLeft = node.left;
                TreeNode nodeRight = node.right;
                node.left = nodeRight;
                node.right = nodeLeft;
            }
            if(node.left != null) stack.push(node.left);
            if(node.right != null) stack.push(node.right);
        }
    }
}
