/**
 * Created by Administrator on 2017/8/14.
 */
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode index1 = list1;
        ListNode index2 = list2;
        ListNode l1Next;
        ListNode l2Next;
        ListNode head;

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val){
            head = list1;
        } else {
            head = list2;
        }

        while (index1 != null && index2 != null){
            if (index1.val <= index2.val){
                l1Next = index1.next;
                if (l1Next == null || l1Next.val >= index2.val){
                    index1.next = index2;
                }
                index1 = l1Next;
            } else {
                l2Next = index2.next;
                if (l2Next == null || l2Next.val >= index1.val){
                    index2.next = index1;
                }
                index2 = l2Next;
            }
        }

        return head;
    }
}
