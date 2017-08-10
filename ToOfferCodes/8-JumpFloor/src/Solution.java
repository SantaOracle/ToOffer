/**
 * Created by Administrator on 2017/8/10.
 */
public class Solution {
    public int JumpFloor(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        return (JumpFloor(target-1) + JumpFloor(target-2));
    }
}
