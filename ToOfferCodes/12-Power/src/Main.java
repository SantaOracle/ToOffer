/**
 * Description:
 *      这题如果直接用常规解法，运算时间肯定爆炸。故，我们需要换一个思路。
 *      首先，将指数换成二进制表示（先假设指数是正的，底数也是正的），比如
 *     10^13 = 10^1101 = 10^1000 * 10^0100 * 10^0001。
 *      接下来，我们对指数进行逐个移位检查，每移一位，乘数翻倍，当检查到当前
 *     指数位数位1时，乘上这个乘数。
 *      最后，我们需要注意各种情况的判断，主要是针对指数的正负数和0的情况。
 * Created by Administrator on 2017/8/11.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.Power(2.7,10));
    }
}
