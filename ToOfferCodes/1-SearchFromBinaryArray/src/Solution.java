/**
 * Created by Administrator on 2017/7/8.
 */
public class Solution {

    public boolean Find(int target, int [][] array) {
        int xLength, yLength;

        yLength = array[0].length;
        xLength = array.length;

        int xIndex = 0;
        int yIndex = 0;

        while (yIndex < yLength && xIndex < xLength){
            if (array[xIndex][yIndex] == target)
                return true;

            if (array[xIndex][yIndex] > target){
                if (xIndex == 0)
                    return false;

                if (array[xIndex-1][yIndex] == target){
                    return true;
                }

                if (array[xIndex-1][yIndex] < target){
                    yIndex++;
                    continue;
                }

                if (array[xIndex-1][yIndex] > target){
                    xIndex--;
                    continue;
                }
            }

            if (array[xIndex][yIndex] < target){
                if (xIndex == xLength-1){
                    yIndex++;
                }else{
                    xIndex++;
                }

            }
        }

        return false;
    }
}
