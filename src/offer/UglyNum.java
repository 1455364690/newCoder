package offer;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author sunjh
 * @date 2019/9/26 23:16
 */
public class UglyNum {
    public int GetUglyNumber_Solution(int index) {
        Queue<Integer> list2 = new LinkedList<Integer>();
        Queue<Integer> list3 = new LinkedList<Integer>();
        Queue<Integer> list5 = new LinkedList<Integer>();
        if(1 == index){
            return 1;
        }
        list2.add(2);
        int res = 5;
        for(int i=2;i<=index;i++){
            res = Math.min(Math.min(list2.poll(),list3.poll()),list5.peek());
            list2.offer(res * 2);
            list3.offer(res * 3);
            list5.offer(res * 5);
        }
        return res;
    }
}
