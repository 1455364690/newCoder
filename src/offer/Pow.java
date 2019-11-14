package offer;

import java.util.Stack;

/**
 * @author sunjh
 * @date 2019/9/26 23:23
 */
public class Pow {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        root.left = node2;
        root.right = node3;
        node2.left = node4;
        node2.right = node5;
        node3.left = node6;
        node5.left = node7;
        System.out.println(TreeDepth(root));
    }

    public static int TreeDepth(TreeNode root) {
        if (null == root) {
            return 0;
        }
        return DFS(root);
    }

    public static int DFS(TreeNode root) {
        int len = 1;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int tmpLen = len;
            TreeNode tmp = stack.pop();
            tmpLen--;
            if (null != tmp.right) {
                stack.push(tmp.right);
                tmpLen++;
            }
            if (null != tmp.left) {
                stack.push(tmp.left);
                tmpLen++;
            }
            if (tmpLen > len) {
                len = tmpLen;
            }
            for (TreeNode a: stack){
                System.out.print(a.val+" ");
            }
            System.out.println();
            System.out.println(len);
        }
        return len;
    }
}
