import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/12.
 */
public class Solution {
    public void reOrderArray(int [] array) {
        ArrayList<Integer> oddList = new ArrayList(array.length);
        ArrayList<Integer> evenList = new ArrayList(array.length);

        for (int i : array){
            if (i%2 == 0){
                evenList.add(i);
            }else{
                oddList.add(i);
            }
        }

        oddList.trimToSize();
        evenList.trimToSize();

        ArrayList<Integer> resList = new ArrayList();
        resList.addAll(oddList);
        resList.addAll(evenList);
        for (int i=0; i<array.length; i++){
            array[i] = resList.get(i);
        }
    }
}
