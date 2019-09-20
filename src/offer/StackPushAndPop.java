package offer;

import java.util.Stack;

/**
 * @author sunjh
 * @date 2019/9/20 9:50
 */
public class StackPushAndPop {
    public boolean IsPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 1;
        int popIndex = 0;
        stack.push(pushA[0]);
        while (popIndex < popA.length) {
            if (!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                int a = stack.pop();
                //System.out.println(a + "出栈");
                popIndex++;
            } else {
                //System.out.println("pushIndex:"+pushIndex);
                if (pushIndex < pushA.length) {
                    stack.push(pushA[pushIndex]);
                    //System.out.println(pushA[pushIndex] + "入栈");
                    pushIndex++;
                } else {
                    break;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
