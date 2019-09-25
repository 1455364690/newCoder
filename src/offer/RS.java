package offer;

import java.util.*;

/**
 * @author sunjh
 * @date 2019/9/24 22:28
 */
public class RS {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int arrALen = reader.nextInt();
            int arrBLen = reader.nextInt();
            List<Integer> list = new ArrayList<>();
            Map<Integer, Integer> list2 = new LinkedHashMap<>();
            List<Integer> other = new ArrayList<>();
            for (int j = 0; j < arrALen; j++) {
                list.add(reader.nextInt());
            }
            for (int j = 0; j < arrBLen; j++) {
                list2.put(reader.nextInt(), 0);
            }
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