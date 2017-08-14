/**
 * Description:
 *      这题我用的是非递归版本，为的是开辟更少的空间（想让代码更少，可以使用递归或者new新链表，但
 *     前者会开辟更多的栈空间，后者会开辟更多的堆空间）
 * Created by Administrator on 2017/8/14.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n1_1 = new ListNode(1);
        ListNode n1_2 = new ListNode(3);
        ListNode n1_3 = new ListNode(5);

        n1_1.next = n1_2;
        n1_2.next = n1_3;

        ListNode n2_1 = new ListNode(1);
        ListNode n2_2 = new ListNode(3);
        ListNode n2_3 = new ListNode(5);

        n2_1.next = n2_2;
        n2_2.next = n2_3;

        ListNode head = s.Merge(n1_1, n2_1);
        ListNode index = head;
        while (index != null){
            System.out.print(index.val + " ");
            index = index.next;
        }

    }
}
