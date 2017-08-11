/**
 * Created by Administrator on 2017/8/11.
 */
public class Solution {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }

    public int NumberOf1_2(int n){
        char ch[] = Integer.toBinaryString(n).toCharArray();
        int count = 0;
        for (int i=0; i<ch.length; i++){
            if (ch[i] == '1') count++;
        }
        return count;
    }


}
