package offer;
import	java.net.Socket;

/**
 * @author sunjh
 * @date 2019/9/18 16:57
 */
public class Test {
    public static void main(String[] args) {
        RandomListNode randomListNode = new RandomListNode(1);
        RandomListNode randomListNode1 = new RandomListNode(2);
        RandomListNode randomListNode2 = new RandomListNode(3);
        RandomListNode randomListNode3 = new RandomListNode(4);
        RandomListNode randomListNode4 = new RandomListNode(5);
        randomListNode.next = randomListNode1;
        randomListNode1.next = randomListNode2;
        randomListNode2.next = randomListNode3;
        randomListNode3.next = randomListNode4;
        randomListNode.random = randomListNode3;
        randomListNode2.random = randomListNode4;
        ListCopy listCopy = new ListCopy();
        RandomListNode nH = listCopy.Clone(randomListNode);
        while (nH != null) {
            if (nH != null) {
                System.out.print(nH.label + ",");
            }else {
                System.out.print("null,");
            }
            if (nH.next != null) {
                System.out.print(nH.next.label + ",");
            }else {
                System.out.print("null,");
            }
            if (nH.random != null) {
                System.out.print(nH.random.label);
            }else {
                System.out.print("null,");
            }
            System.out.println();
            nH = nH.next;
        }
    }
}
