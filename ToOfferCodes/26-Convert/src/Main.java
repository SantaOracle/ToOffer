/**
 * Description:
 *      自己的思路：其实最后形成的链表打印出来的结果和对该搜索树进行中根遍历打印的结果是一致的，
 *     用递归对树进行中根遍历就好了。
 * Created by Administrator on 2017/8/20.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("start");

        Solution s = new Solution();
        TreeNode n1 = new TreeNode(7);
        TreeNode n2 = new TreeNode(4);
        TreeNode n3 = new TreeNode(9);
        TreeNode n4 = new TreeNode(1);
        TreeNode n5 = new TreeNode(6);
        TreeNode n6 = new TreeNode(8);
        TreeNode n7 = new TreeNode(10);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        TreeNode newHead = s.Convert(n1);
        TreeNode index = newHead;
        TreeNode newTail = null;
        while (index != null) {
            System.out.print(index.val + " ");
            if (index.right == null) newTail = index;
            index = index.right;
        }
        System.out.println();
        index = newTail;
        while (index != null) {
            System.out.print(index.val + " ");
            index = index.left;
        }

    }
}
