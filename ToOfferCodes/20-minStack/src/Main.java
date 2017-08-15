/**
 * Created by Administrator on 2017/8/15.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();

        s.push(3);
        s.push(5);
        s.push(1);
        System.out.println(s.min());
        s.push(-1);
        System.out.println(s.min());
        s.pop();
        System.out.println(s.min());
        System.out.println(s.top());
        System.out.println(s.top());
    }
}
