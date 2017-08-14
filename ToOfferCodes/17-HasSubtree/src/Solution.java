import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/8/14.
 */
public class Solution {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 == null) return false;
        if (root2 == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        boolean isFound = false;
        boolean res = false;

        queue.offer(root1);
        while (!queue.isEmpty()){
            TreeNode index = queue.poll();
            if (index.val == root2.val){
                isFound = true;
                if (hasSubTreeByBFS(index, root2)) res = true;
            }
            if (index.left != null) queue.offer(index.left);
            if (index.right != null) queue.offer(index.right);
        }

        if (isFound) {
            return res;
        } else {
            return isFound;
        }
    }

    private boolean hasSubTreeByBFS(TreeNode root1, TreeNode root2){
        Queue<TreeNode> queue1 = new LinkedList();
        Queue<TreeNode> queue2 = new LinkedList();

        queue1.offer(root1);
        queue2.offer(root2);
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            TreeNode index1 = queue1.poll();
            TreeNode index2 = queue2.poll();

            if (index1.val != index2.val) return false;
            if (index1.left != null) queue1.offer(index1.left);
            if (index1.right != null) queue1.offer(index1.right);
            if (index2.left != null) queue2.offer(index2.left);
            if (index2.right != null) queue2.offer(index2.right);
        }
        return true;
    }
}
