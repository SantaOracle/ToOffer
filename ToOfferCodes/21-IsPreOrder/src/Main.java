/**
 * Description:
 *      先说题目里的坑：
 *          1.数组长度可能为0
 *          2.弹栈元素可能无法在压栈元素中找到
 *      再来说我的思路：
 *          1.判断弹栈元素是否存在
 *          2.判断是否可pop：当定位pushA的index在>=topIndex的时候，可pop；反之直接false
 *          3.更新top：从pushAIndex开始往左找，找到的第一个没被弹出去的元素即为新的topIndex，如果找不到topIndex=-1（栈空）
 * Created by Administrator on 2017/8/15.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int []pushA = {1,2,3,4,5};
        int []popA = {4,3,5,2,1};

        System.out.println(s.IsPopOrder(pushA, popA));
    }
}
