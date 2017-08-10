/**
 * Created by Administrator on 2017/8/10.
 */
public class Solution {
    public int Fibonacci(int n) {
        int index1 = 1;
        int index2 = 1;
        if (n == 0) return 0;
        if (n == 1 || n == 2)
            return 1;
        n -= 2;
        while (n > 0){
            index2 = index1 + index2;
            index1 = index2 - index1;
            n--;
        }
        return index2;
    }
}
