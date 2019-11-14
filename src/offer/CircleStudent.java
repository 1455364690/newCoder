package offer;

import java.util.LinkedList;

/**
 * @author sunjh
 * @date 2019/9/29 22:38
 */
public class CircleStudent {
    public static void main(String[] args) {
        System.out.println(LastRemaining_Solution(5,3));
    }
    public static int LastRemaining_Solution(int n, int m) {
        if(n == 0){
            return -1;
        }
        if(1 == n){
            return 0;
        }
        LinkedList<Integer> list = new LinkedList();
        for(int i=0;i<n;i++){
            list.add(i);
        }
        int index = 0;
        for(int i=0;i<n-1;i++){
            index = (index+m-1)%list.size();
            list.remove(index);
            System.out.println(list);
        }
        return list.get(0);
    }
}
