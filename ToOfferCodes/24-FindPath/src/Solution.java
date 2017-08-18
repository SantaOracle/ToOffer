import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/18.
 */
public class Solution {
    private ArrayList<ArrayList<Integer>> resList = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null) return resList;
        FindPathByDFS(root, target, new ArrayList<Integer>(), 0);
        return resList;
    }

    private void FindPathByDFS(TreeNode indexNode, int target, ArrayList<Integer> pathList, int curtCnt){
        pathList.add(indexNode.val);
        curtCnt += indexNode.val;
        //判断是否是叶节点
        if (indexNode.left == null && indexNode.right == null){
            if (curtCnt == target) {
                resList.add(new ArrayList<>(pathList));
            }
        } else {
            if (indexNode.left != null)
                FindPathByDFS(indexNode.left, target, pathList, curtCnt);
            if (indexNode.right != null)
                FindPathByDFS(indexNode.right, target, pathList, curtCnt);
        }
        pathList.remove(pathList.size()-1);
    }

}
