/**
 * Created by Administrator on 2017/8/15.
 */
public class Solution {

    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0) return true;

        boolean []boolArr = new boolean[pushA.length];
        int topIndex = -1;
        int popIndex = 0;
        while (popIndex < popA.length){
            int pushAIndex = -1;
            for (int i=0; i<pushA.length; i++){
                if (pushA[i] == popA[popIndex]){
                    pushAIndex = i;
                    break;
                }
            }
            if (pushAIndex == -1) return false;
            if (pushAIndex < topIndex) return false;
            boolArr[pushAIndex] = true;
            topIndex = -1;
            for (int i=pushAIndex; i>=0; i--){
                if (!boolArr[i]){
                    topIndex = i;
                    break;
                }
            }
            popIndex++;
        }
        return true;
    }
}
