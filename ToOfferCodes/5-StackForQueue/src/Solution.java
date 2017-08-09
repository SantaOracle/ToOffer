import java.util.Stack;

/**
 * Created by Administrator on 2017/8/9.
 */
public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        if (stack1.isEmpty() && !stack2.isEmpty()){
            while (!stack2.isEmpty())
                stack1.push(stack2.pop());
        }
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty())
            System.out.println("Error, queue is empty!");

        if (!stack1.isEmpty() && stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
