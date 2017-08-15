/**
 * Description:
 *      我的代码，易于理解，不足之处是新建了一个boolean矩阵，其实这里想改进的话，可以使用4个边界值而
 *     没必要弄一整个boolean矩阵
 * Created by Administrator on 2017/8/15.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        int [][]matrix = {{1,2,3},{4,5,6},{7,8,9}};


        System.out.println(s.printMatrix(matrix));
    }
}
