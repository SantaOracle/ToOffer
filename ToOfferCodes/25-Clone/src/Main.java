/**
 * Description:
 *      自己的思路：先建立正常的单链表，在建立链表的同时，将每个节点和对应的clone结点存入一个map，
 *     第二次遍历来连接random，通过原链表node找到对应clone结点。【这里程序虽然通过了，但是有一个疑问，
 *     我们执行cache.put(oriIndex, newNode)这条语句时，我不是很清楚这里是直接把oriIndex实时引用
 *     存了进去，还是复制了oriIndex对应节点的引用地址存。事实证明，其存的KEY是把当前oriIndex引用地址
 *     复制并保存，KEY值不随oriIndex引用地址改变而变化】
 *      别人的思路（时间上复杂度相同，空间上我比他多开了个MAP）：
 *          1.复制每个节点，如：复制节点A得到A1，将A1插入节点A后面
 *          2.遍历链表，A1->random = A->random->next;
 *          3.将链表拆分成原链表和复制后的链表
 * Created by Administrator on 2017/8/20.
 */
public class Main {
    public static void main(String[] args) {
        Solution s = new Solution();
        RandomListNode n1 = new RandomListNode(1);
        RandomListNode n2 = new RandomListNode(2);
        RandomListNode n3 = new RandomListNode(3);

        n1.next = n2;
        n2.next = n3;

        n1.random = n3;
        n2.random = n3;
        n3.random = n1;

        RandomListNode cloneHead = s.Clone(n1);
    }
}
