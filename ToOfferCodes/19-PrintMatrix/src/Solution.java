import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/15.
 */
public class Solution {
    public enum Direction{
        LEFT,
        RIGHT,
        UP,
        DOWN
    }

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        boolean [][] booMatrix = new boolean[matrix.length][matrix[0].length];
        int xLength = matrix[0].length;
        int yLength = matrix.length;
        int xindex = 0;
        int yindex = 0;
        Direction direction = Direction.RIGHT;
        ArrayList<Integer> resList = new ArrayList<>(xLength*yLength);
        int insertCount = 0;

        while (xindex <= xLength && yindex <= yLength){
            resList.add(matrix[yindex][xindex]);
            insertCount++;
            booMatrix[yindex][xindex] = true;
            if (insertCount == xLength*yLength) break;
            switch (direction){
                case RIGHT:{
                    if (xindex+1 == xLength || booMatrix[yindex][xindex+1]){
                        direction = Direction.DOWN;
                        yindex++;
                    } else {
                        xindex++;
                    }
                    break;
                }
                case LEFT:{
                    if (xindex-1 < 0 || booMatrix[yindex][xindex-1]){
                        direction = Direction.UP;
                        yindex--;
                    } else {
                        xindex--;
                    }
                    break;
                }
                case UP:{
                    if (yindex-1 < 0 || booMatrix[yindex-1][xindex]){
                        direction = Direction.RIGHT;
                        xindex++;
                    } else {
                        yindex--;
                    }
                    break;
                }
                case DOWN:{
                    if (yindex+1 == yLength || booMatrix[yindex+1][xindex]){
                        direction = Direction.LEFT;
                        xindex--;
                    } else {
                        yindex++;
                    }
                    break;
                }
            }
        }

        return resList;
    }
}
