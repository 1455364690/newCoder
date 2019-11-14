package offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sunjh
 * @date 2019/9/26 10:26
 */
public class SpeacialSort {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int lenA = reader.nextInt();
            int lenB = reader.nextInt();
            Integer[] arrA = new Integer[lenA];
            Integer[] arrB = new Integer[lenB];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < lenA; j++) {
                arrA[j] = reader.nextInt();
            }
            for (int j = 0; j < lenB; j++) {
                arrB[j] = reader.nextInt();
                map.put(arrB[j], j);
            }
            Arrays.sort(arrA, (o1, o2) -> {
                if (map.containsKey(o1) && map.containsKey(o2)) {
                    return map.get(o1) - map.get(o2);
                } else if (!map.containsKey(o1) && !map.containsKey(o2)) {
                    return o1 - o2;
                } else if (map.containsKey(o1)) {
                    return -1;
                } else if (!map.containsKey(o1)) {
                    return 1;
                }
                return 0;
            });
            System.out.print(arrA[0]);
            for (int j=1;j<arrA.length;j++){
                System.out.print(" "+arrA[j]);
            }
            System.out.println();
        }
        reader.close();
    }
}
