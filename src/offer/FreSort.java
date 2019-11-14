package offer;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author sunjh
 * @date 2019/9/26 9:02
 */
public class FreSort {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int num = reader.nextInt();
            int[] arr = new int[num];
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < num; j++) {
                arr[j] = reader.nextInt();
                map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
            }
            int flag = 0;
            while (!map.isEmpty()) {
                int max = 0;
                int index = 0;
                for (int item : map.keySet()) {
                    if (map.get(item) > max || (map.get(item) == max && item < index)) {
                        max = map.get(item);
                        index = item;
                    }
                }
                if (max == 0) {
                    break;
                }
                for (int j = 0; j < max; j++) {
                    if (flag == 0) {
                        System.out.print(index);
                        flag = 1;
                    } else {
                        System.out.print(" " + index);
                    }
                }
                map.remove(index);
            }
            System.out.println();
        }
        reader.close();

    }
}
