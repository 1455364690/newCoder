package offer;

/**
 * @author sunjh
 * @date 2019/9/20 10:15
 */
public class CheckBinSearchTree {
    public int[] sq;

    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence.length == 0){
            return false;
        }
        sq = sequence;
        return verifySubSquenceOfBST(0, sq.length - 1);
    }

    public boolean verifySubSquenceOfBST(int start, int end) {
        System.out.println(start + "," + end);
        if (start >= end) {
            return true;
        }
        int root = sq[end];
        int index;
        for (index = start; index < end; index++) {
            if (sq[index] > root) {
                break;
            }
        }
        System.out.println(index);
        for (int i = start; i < index; i++) {
            if (sq[i] > root) {
                return false;
            }
        }
        for (int i = index; i < end; i++) {
            if (sq[i] < root) {
                return false;
            }
        }
        return verifySubSquenceOfBST(start, index - 1) && verifySubSquenceOfBST(index, end - 1);
    }
}
