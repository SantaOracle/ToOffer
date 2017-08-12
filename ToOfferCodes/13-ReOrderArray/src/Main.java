/**
 * Description:
 *      不是很理解为什么在同一数组内进行大规模元素移动的解法会得到这么多人的推荐，我的理解是，可以用可接受的辅助空间
 *     替代掉一定的时间复杂度。另外，n%2 == 1 可以等价为 n&1 == 1，即判断某数是否为奇数，记住，位运算效率永远比我
 *     们熟悉的十进制符号运算效率要高得多。
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int []array = {1,5,0,1,4,9,21,33,42,10,5,7,6,3};
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
        s.reOrderArray(array);
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
