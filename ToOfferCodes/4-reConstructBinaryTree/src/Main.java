/**
 * Created by Administrator on 2017/8/8.
 */
public class Main {
    public static void main(String[] args) {
        int []pre = {1,2,4,7,3,5,6,8};
        int []in = {4,7,2,1,5,3,8,6};
        Solution s = new Solution();

        TreeNode root = s.reConstructBinaryTree(pre, in);
        s.printAfterRootConsequence(root);
    }


}
