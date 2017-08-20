import java.util.Stack;

/**
 * Created by Administrator on 2017/8/20.
 */
public class Solution {

    TreeNode newHead = null;
    TreeNode lastIndex = null;

    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        ConvertByDFS(pRootOfTree);
        return newHead;
    }

    private void ConvertByDFS(TreeNode index) {
        if (index.left != null) ConvertByDFS(index.left);

        if (newHead == null) newHead = index;
        if (lastIndex == null) lastIndex = index;
        else {
            lastIndex.right = index;
            index.left = lastIndex;
            lastIndex = index;
        }

        if (index.right != null) ConvertByDFS(index.right);
    }
}
