package offer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

/**
 * @author sunjh
 * @date 2019/9/29 23:14
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.println(deleteDuplication(head));
    }

    public static ListNode deleteDuplication(ListNode pHead)
    {
        if(null == pHead || null == pHead.next){
            return pHead;
        }
        Map<Integer,Integer> map = new HashMap<>();
        ListNode p = pHead;
        while(p!=null){
            map.put(p.val,map.getOrDefault(map.get(p.val),0)+1);
        }
        p = pHead;
        ListNode pA = pHead.next;
        while(pA!=null){
            if(map.get(pA.val) > 1){
                p.next = pA.next;
            }else{
                p = p.next;
            }
            pA = pA.next;
        }
        //return pHead;
        while (pHead!=null){
            System.out.print(pHead.val+" ");
            pHead = pHead.next;
        }
        return pHead;
    }
}
