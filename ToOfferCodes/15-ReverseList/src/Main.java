/**
 * Description:
 *      三个指针：当前，上一个，下一个。上一个和下一个元素可能指null，如果需要访问里边的元素，必须先判空。
 * Created by Administrator on 2017/8/12.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        ListNode newHead = s.ReverseList(n1);
        ListNode index = newHead;
        while (index != null){
            System.out.print(index.val + " ");
            index = index.next;
        }
        System.out.println();
    }
}
