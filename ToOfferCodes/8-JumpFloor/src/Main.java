/**
 * Description: 其实这个解法不是一个好解法，因为递归会数据量大时，会消耗大量空间。
 *  而这道题，是有规律可循的，假设跳n级台阶的跳法为f(n)，且f(1)=1；f(2)=2，而
 *  f(n)=f(n-1)+f(n-2)。这样，我们就能构造出一个类斐波那契数列。
 *  记住：能用迭代，别用递归！！！！
 * Created by Administrator on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.JumpFloor(4));
    }
}
