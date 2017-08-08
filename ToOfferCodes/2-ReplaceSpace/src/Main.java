/**
 * Created by Administrator on 2017/8/8.
 */
public class Main {

    public static void main(String[] args) {
        String str = new String("Hello World!");
        StringBuffer sb = new StringBuffer(str);
        Solution s = new Solution();

        System.out.println(s.replaceSpace(sb));
    }
}
