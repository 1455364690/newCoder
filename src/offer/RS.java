package offer;

import java.util.*;

/**
 * @author sunjh
 * @date 2019/9/24 22:28
 */
public class RS {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //测试用例数量
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            //第一个数组长度
            int arrALen = reader.nextInt();
            //第二个数组长度
            int arrBLen = reader.nextInt();
            //用来存放第一个数组
            List<Integer> list = new ArrayList<>();
            //用来存放第二个数组
            List<Integer> list3 = new ArrayList<>();
            Map<Integer, Integer> list2 = new LinkedHashMap<>();
            //用来存放第一个数组中不在第二个数组的元素
            List<Integer> other = new ArrayList<>();
            //读入第一个数组
            for (int j = 0; j < arrALen; j++) {
                list.add(reader.nextInt());
            }
            //读入第二个数组
            for (int j = 0; j < arrBLen; j++) {
                list3.add(reader.nextInt());
                //list2.put(reader.nextInt(), 0);
            }
            for (int j = 0; j < arrBLen; j++) {
                list2.put(list3.get(j), 0);
                System.out.println(list2);
            }
            //遍历第一个数组，若是在第二个数组中则+1；否则加入other数组
            for (Integer j : list) {
                if (list2.containsKey(j)) {
                    list2.put(j, list2.get(j) + 1);
                } else {
                    other.add(j);
                }
            }
            Collections.sort(other);
            int index = 0;
            for (Integer a : list2.keySet()) {
                int num = list2.get(a);
                for (int k = 0; k < num; k++) {
                    if (0 == index) {
                        System.out.print(a);
                        index++;
                    } else {
                        System.out.print(" " + a);
                    }
                }
            }
            for (Integer a : other) {
                System.out.print(" " + a);
            }
            System.out.println();
        }
    }
}
/*
3
7 3
8 6 2 4 5 4 0
8 0 4
7 3
8 6 2 4 5 4 0
8 0 4
7 3
8 6 2 4 5 4 0
8 0 4



*/