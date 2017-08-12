/**
 * Created by Administrator on 2017/8/12.
 */
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) return null;
        int length = 0;
        ListNode index = head;
        while (index != null){
            length++;
            index = index.next;
        }
        if (k > length) return null;
        int skipTimes = length - k;
        index = head;
        while (skipTimes > 0){
            index = index.next;
            skipTimes--;
        }
        return index;
    }
}
