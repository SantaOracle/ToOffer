/**
 * Description:
 *      自己思路：先找到跟root2值相同的点（可能有多个），然后进行广度遍历（由于字数可能不触及root1叶节点，深度遍历
 *     有可能出问题）
 * Created by Administrator on 2017/8/14.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        TreeNode n1_1 = new TreeNode(8);
        TreeNode n1_2 = new TreeNode(8);
        TreeNode n1_3 = new TreeNode(7);
        TreeNode n1_4 = new TreeNode(9);
        TreeNode n1_5 = new TreeNode(3);
        TreeNode n1_10 = new TreeNode(4);
        TreeNode n1_11 = new TreeNode(7);

        n1_1.left = n1_2;
        n1_1.right = n1_3;
        n1_2.left = n1_4;
        n1_2.right = n1_5;
        n1_5.left = n1_10;
        n1_5.right = n1_11;

        TreeNode n2_1 = new TreeNode(8);
        TreeNode n2_2 = new TreeNode(9);
        TreeNode n2_3 = new TreeNode(2);

        n2_1.left = n2_2;
        n2_1.right = n2_3;

        System.out.println(s.HasSubtree(n1_1, n2_1));
    }
}
