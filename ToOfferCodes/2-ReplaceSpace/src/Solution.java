/**
 * Created by Administrator on 2017/8/8.
 */
public class Solution {

    public String replaceSpace(StringBuffer str) {
        int spaceCnt = 0;
        int index = 0;

        while (str.indexOf(" ", index) != -1){
            int spIndex =  str.indexOf(" ", index);
            str.deleteCharAt(spIndex);
            str.insert(spIndex, "%20");
        }

        return str.toString();
    }
}
