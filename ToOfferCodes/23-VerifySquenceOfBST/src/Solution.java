/**
 * Created by Administrator on 2017/8/18.
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0) return false;
        return VerifySquenceOfBST(sequence, sequence.length-1, 0);
    }

    private boolean VerifySquenceOfBST(int [] sequence, int begIndex, int endIndex){
        if (begIndex == endIndex) return true;

        int rightBeg = -1;
        int rightEnd = endIndex;
        int leftBeg = -1;
        int leftEnd = endIndex;
        int root = begIndex;

        for (int i = begIndex-1; i >= endIndex; i--){
            if (sequence[i] > sequence[root]){
                if (leftBeg != -1) return false;
                if (rightBeg == -1) rightBeg = i;
            }
            if (sequence[i] < sequence[root]){
                if (leftBeg == -1) leftBeg = i;
                if (rightBeg != -1 && rightEnd == endIndex) rightEnd = i+1;
            }
        }

        boolean leftSequence = true;
        boolean rightSequence = true;
        if (leftBeg != -1) leftSequence = VerifySquenceOfBST(sequence, leftBeg, leftEnd);
        if (rightBeg != -1) rightSequence = VerifySquenceOfBST(sequence, rightBeg, rightEnd);

        return  leftSequence && rightSequence;
    }
}
