/**
 * Description:
 *      自己的思路：
 *          先遍历一遍链表，获取链表长度，再根据链表长度和k，取倒数第k个结点
*       更优的思路：
 *          初始化两个指针全部指向表头，第一个指针先走k步，之后两个指针同时往后遍历，当第一个指针
 *         遍历到表末时，返回第二个指针的结点。相比我的思路，这样的好处是剩下了第二次遍历的操作。
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(7);
        ListNode n4 = new ListNode(9);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode index = s.FindKthToTail(n1, 2);
        System.out.println(index.val);
    }
}
