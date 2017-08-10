/**
 * Description:
 *  自己的思路：
 *      假设，跳n阶的跳法是f(n)，则f(n+1)=f(n)+f(n-1)+...+f(1)+1，这是因为，我们可以把跳n+1个台阶转成，从第n
 *     阶直接跳到顶，第n-1阶直接跳到顶，以此类推。令g(n)=f(n-1)+f(n-2)+...+f(1)，则f(n)=g(n)+1，其中f(1)=1。
 *  比较优的思路：
 *      同样的，可以得出f(n)=f(n-1)+f(n-2)+...+f(1)+1，而f(n-1)=f(n-2)+...+f(1)+1，故f(n)=2*f(n-1)，也
 *     就是f(n)=2^(n-1)
 *
 *  记住：能迭代，别递归！！！
 * Created by Administrator on 2017/8/10.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.JumpFloorII(4));
    }
}
