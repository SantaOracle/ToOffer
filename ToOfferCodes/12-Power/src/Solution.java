/**
 * Created by Administrator on 2017/8/11.
 */
public class Solution {
    public double Power(double base, int exponent) {
        if (Math.abs(exponent) == 0)
            return 1;
        double res = 1;
        double curt = base;
        int absExponent = Math.abs(exponent);
        while (absExponent > 0){
            if ((absExponent & 1) == 1){
                res *= curt;
            }
            curt *= curt;
            absExponent >>= 1;
        }
        if (exponent < 0){
            return 1/res;
        }else{
            return res;
        }
    }
}
