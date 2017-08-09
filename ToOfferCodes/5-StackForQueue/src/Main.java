/**
 * Created by Administrator on 2017/8/9.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.push(4);
        s.push(3);
        s.push(7);
        System.out.println(s.pop());
        s.push(9);
        System.out.println(s.pop());
    }
}
