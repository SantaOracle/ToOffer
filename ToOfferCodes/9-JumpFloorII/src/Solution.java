/**
 * Created by Administrator on 2017/8/10.
 */
public class Solution {
    public int JumpFloorII(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        target -= 1;
        int total = 1;
        int index = 0;
        while (target > 0){
            index = total + 1;
            total += index;
            target--;
        }
        return index;
    }
}
