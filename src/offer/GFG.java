package offer;

/**
 * @author sunjh
 * @date 2019/9/25 9:49
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class GFG {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int arrALen = reader.nextInt();
            int arrBLen = reader.nextInt();
            Integer[] list = new Integer[arrALen];
            Map<Integer, Integer> map = new HashMap<>();
            //List<Integer> listA = new ArrayList<>();
            Integer[] list2 = new Integer[arrBLen];

            for (int j = 0; j < arrALen; j++) {
                list[j] = reader.nextInt();
            }
            for (int j = 0; j < arrBLen; j++) {
                list2[j] = reader.nextInt();
            }
            for (int j = 0; j < arrBLen; j++) {
                map.put(list2[j], j);
            }
            Arrays.sort(list, (o1, o2) -> {
                if (map.get(o1) == null && map.get(o2) == null) {
                    return o1 > o2 ? 1 : -1;
                } else if (map.get(o1) != null && map.get(o2) != null) {
                    return map.get(o1) > map.get(o2) ? 1 : -1;
                } else if (map.get(o1) == null) {
                    return 1;
                } else if (map.get(o2) == null) {
                    return -1;
                }
                return 1;
            });
            for (int j = 0; j < arrALen - 1; j++) {
                System.out.print(list[j] + " ");
            }
            System.out.println(list[arrALen - 1]);
        }
    }
}
