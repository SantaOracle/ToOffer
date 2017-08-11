/**
 * Description:
 *      正常解法：
 *          对于n（先举个正数的例子），比如n=10，其二进制表示为1010，而当期减1后，其二进制表示为1001，
 *         不难发现，n与n-1在二进制表示上，从右到左直到n当中出现第一个1的位置的这一段，两者属于完全变反
 *         的状态，此时n & n-1得到的结果，便会把n最右边的一个1消除。故，n当中有几个1，就可以这样消几次。
 *      谐星解法：
 *          直接用Integer.toBinaryString(n).toCharArray()，然后检查char[]当中有几个1，还有更谐的
 *         转换为char数组后，直接把'0'全部替换为''，然后取替换后的数组长度...
 * Created by Administrator on 2017/8/11.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.NumberOf1(10));
    }
}
