/**
 * Description:
 *  1.根据先根遍历结果，找到当前根
 *  2.根据中根遍历以及当前根，找到左右子树的元素
 *  3.根据左右字数元素个数，确认lpre,lin,rpre,rin，并进行递归
 *  4.递归出口：pre与in元素个数为1或0
 * Created by Administrator on 2017/8/8.
 */
public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0){
            return null;
        }else if (pre.length == 1){
            return new TreeNode(pre[0]);
        }

        TreeNode root = new TreeNode(pre[0]);
        int rootIndex = 0;
        for (int i=0; i<in.length; i++){
            if (in[i] == pre[0]){
                rootIndex = i;
                break;
            }
        }

        int leftNum = rootIndex;
        int rightNum = in.length - (rootIndex + 1);

        int []lpre = new int[leftNum];
        int []lin = new int[leftNum];
        int []rpre = new int[rightNum];
        int []rin = new int[rightNum];

        if (leftNum > 0){
            //录左先根
            int inputIndex = 0;
            for (int i=1; i<1+leftNum; i++){
                lpre[inputIndex] = pre[i];
                inputIndex++;
            }

            //录左中跟
            inputIndex = 0;
            for (int i=0; i<leftNum; i++){
                lin[inputIndex] = in[i];
                inputIndex++;
            }
        }

        if (rightNum > 0){
            //录右先根
            int inputIndex = 0;
            for (int i=1+leftNum; i<pre.length; i++){
                rpre[inputIndex] = pre[i];
                inputIndex++;
            }

            //录右中根
            inputIndex = 0;
            for (int i=rootIndex+1; i<in.length; i++){
                rin[inputIndex] = in[i];
                inputIndex++;
            }
        }

        root.left = reConstructBinaryTree(lpre, lin);
        root.right = reConstructBinaryTree(rpre, rin);

        return root;
    }

    public void printAfterRootConsequence(TreeNode root){
        if (root == null)
            return;

        printAfterRootConsequence(root.left);
        printAfterRootConsequence(root.right);
        System.out.print(root.val + " ");
    }
}
