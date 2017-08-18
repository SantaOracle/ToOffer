/**
 * Description:
 *      坑逼点：
 *          1.数组有可能长度为0
 *          2.有可能没有右子树（对于我一开始的设想这确实是个坑）
 *      我的思路：
 *          手上有一个数组，假如它是合法的后根遍历数组，那么它的值特征必然是
 *        【一组比root小的数字】【一组比root大的数字】root。我们从右往左遍历，只要发现比root大的数字
 *        出现在比root小的数字堆中，那么这个数组就是不合法的。
 * Created by Administrator on 2017/8/18.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int []sequence = {5,4,3,2,1};

        System.out.println(s.VerifySquenceOfBST(sequence));
    }
}
