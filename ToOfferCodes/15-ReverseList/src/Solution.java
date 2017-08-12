/**
 * Created by Administrator on 2017/8/12.
 */
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (head == null) return null;
        ListNode index = head;
        ListNode indexLast = null;
        ListNode indexNext = index.next;

        while (index != null){
            index.next = indexLast;
            indexLast = index;
            index = indexNext;
            if (indexNext != null)
                indexNext = indexNext.next;
        }

        return indexLast;
    }
}
