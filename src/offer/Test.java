package offer;

/**
 * @author sunjh
 * @date 2019/9/18 16:57
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {2,9,5,16,17,15,19,18,12};
        int[] b = {4,3,5,1,2};
        CheckBinSearchTree checkBinSearchTree = new CheckBinSearchTree();
        System.out.println(checkBinSearchTree.VerifySquenceOfBST(a));
    }
}
