import java.util.HashMap;

/**
 * Created by Administrator on 2017/8/20.
 */
public class Solution {
    private HashMap<RandomListNode,RandomListNode> cache = new HashMap<>();

    public RandomListNode Clone(RandomListNode pHead){
        RandomListNode cloneHead = buildBasicLinklist(pHead);
        addRandomLink(pHead, cloneHead);
        return cloneHead;
    }

    private RandomListNode buildBasicLinklist(RandomListNode pHead){
        RandomListNode oriIndex = pHead;
        RandomListNode cloneHead = null;
        RandomListNode index = null;

        while (oriIndex != null) {
            RandomListNode newNode = new RandomListNode(oriIndex.label);
            cache.put(oriIndex, newNode);
            if (cloneHead == null) cloneHead = newNode;
            if (index == null) index = newNode;
            else {
                index.next = newNode;
                index = index.next;
            }
            oriIndex = oriIndex.next;
        }

        return cloneHead;
    }

    private void addRandomLink(RandomListNode pHead, RandomListNode cloneHead){
        RandomListNode pIndex = pHead;
        RandomListNode cloneIndex = cloneHead;

        while (pIndex != null){
            cloneIndex.random = cache.get(pIndex.random);
            pIndex = pIndex.next;
            cloneIndex = cloneIndex.next;
        }
    }
}
