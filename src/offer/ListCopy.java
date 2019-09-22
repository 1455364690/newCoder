package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjh
 * @date 2019/9/20 16:39
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}

public class ListCopy {
    public RandomListNode Clone(RandomListNode pHead) {
        Map<Integer, RandomListNode> map = new HashMap<>();
        RandomListNode p = pHead;
        RandomListNode newHead = new RandomListNode(0);
        RandomListNode np = newHead;
        while (p != null) {
            RandomListNode tmp = new RandomListNode(p.label);
            map.put(tmp.label, tmp);
            np.next = tmp;
            np = tmp;
            p = p.next == null ? p.random : p.next;
        }
        p = pHead;
        np = newHead.next;
        while (p != null) {
            if (p.random != null) {
                np.random = map.get(p.random.label);
            }
            p = p.next;
            np = np.next;
        }
        return newHead.next;
    }
}
