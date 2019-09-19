package offer;
import	java.util.LinkedList;
import	java.util.Queue;

/**
 * @author sunjh
 * @date 2019/9/17 16:33
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class CreateTree {
    public static int[] preArray;
    public static int[] inArray;
    int a = 0;
    public void test(){
        int a = 1;
        System.out.println(a == this.a);
    }

    public static void main(String[] args) {
        int[] pre = {1,2,3,4,5,6,7};
        int[] in = {3,2,4,1,6,5,7};
        TreeNode node = reConstructBinaryTree(pre, in);
        bfs(node);
        System.out.println();
    }

    public static TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        TreeNode root = new TreeNode(pre[0]);
        preArray = pre;
        inArray = in;
        int rootPreIndex = 0;
        int rootInIndex = getIndex(pre[0], in);
        root.left = createPartTree(1, rootInIndex, 0, rootInIndex - 1);
        root.right = createPartTree(rootInIndex + 1, pre.length - 1, rootInIndex + 1, pre.length - 1);
        return root;
    }

    public static TreeNode createPartTree(int preStart, int preEnd, int inStart, int inEnd) {
        System.out.println(preArray[preStart]);
        System.out.println(preStart + "," + preEnd + "," + inStart + "," + inEnd);
        if (preStart > preEnd) {
            return null;
        }
        if (preStart == preEnd) {
            TreeNode root = new TreeNode(preArray[preStart]);
            return root;
        }
        TreeNode root = new TreeNode(preArray[preStart]);
        int rootPreIndex = preStart;
        int rootInIndex = getIndex(preArray[preStart], inArray);
        int leftLength = rootInIndex - inStart;
        int rightLength = inEnd - rootInIndex;
        root.left = createPartTree(preStart + 1, preStart + leftLength, inStart, rootInIndex - 1);
        root.right = createPartTree(preStart + leftLength + 1, preEnd, rootInIndex + 1, inEnd);
        return root;
    }

    public static int getIndex(int target, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void bfs(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<TreeNode> ();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.print(node.val+",");
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right != null){
                queue.add(node.right);
            }
        }
    }
}
