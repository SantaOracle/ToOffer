import java.util.Stack;

/**
 * Created by Administrator on 2017/8/15.
 */
public class Solution {
    Stack<Integer> stack = new Stack<>();
    int min;

    public void push(int node) {
        if (stack.isEmpty() || node < min)
            min = node;
        stack.push(node);
    }

    public void pop() {
        if (stack.isEmpty()) return;
        int node = stack.pop();
        if (stack.isEmpty()){
            min = 0;
            return;
        }
        if (min == node){
            Stack<Integer> tmpStack = new Stack<>();
            int tmpMin = stack.peek();
            while (!stack.isEmpty()){
                int tmpNode = stack.pop();
                if (tmpNode < tmpMin)
                    tmpMin = tmpNode;
                tmpStack.push(tmpNode);
            }
            min = tmpMin;
            while (!tmpStack.isEmpty()){
                stack.push(tmpStack.pop());
            }
        }
    }

    public int top() {
        if (stack.isEmpty()) return 0;
        return stack.peek();
    }

    public int min() {
        return min;
    }
}
