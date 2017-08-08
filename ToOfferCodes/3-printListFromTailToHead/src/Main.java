import java.util.ArrayList;

/**
 * Created by Administrator on 2017/8/8.
 */
public class Main {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);

        n1.next = n2;
        n2.next = n3;

        Solution s = new Solution();
        ArrayList<Integer> list = s.printListFromTailToHead(n1);

        System.out.println(list);
    }
}
