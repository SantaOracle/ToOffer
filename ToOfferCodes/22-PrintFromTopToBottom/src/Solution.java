import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Administrator on 2017/8/18.
 */
public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        if (root == null)
            return new ArrayList<Integer>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        ArrayList<Integer> resList = new ArrayList<>();
        while (!queue.isEmpty()){
            TreeNode index = queue.poll();
            resList.add(index.val);
            if (index.left != null)
                queue.offer(index.left);
            if (index.right != null)
                queue.offer(index.right);
        }
        return resList;
    }
}
