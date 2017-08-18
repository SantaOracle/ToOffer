import java.util.ArrayList;

/**
 * Description:
 *      自己的思路：
 *          使用递归进行深度优先遍历，同时记录路径，到达叶节点的时候判断值是否等于target，
 *         若相等，就把路径加到结果路径里。
 *      注意：
 *          1.由于ArrayList是引用类型，所以我们在进行递归记录路径的时候，在同一个递归逻辑
 *         中，一开始添加了当前节点，最后要把当前节点去掉。
 *          2.还是因为引用类型，我们不能直接把pathList添加到resList里边，否则之后修改pathList
 *         的时候，resList里边的值也没了。必须这么写：resList.add(new ArrayList(pathList))
 * Created by Administrator on 2017/8/18.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode root = buildTree();
        ArrayList<ArrayList<Integer>> resList = s.FindPath(root, 12);
        System.out.println(resList);
    }

    private static TreeNode buildTree(){
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(5);
        TreeNode n3 = new TreeNode(7);
        TreeNode n4 = new TreeNode(8);
        TreeNode n5 = new TreeNode(4);
        TreeNode n6 = new TreeNode(2);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        return n1;
    }
}
