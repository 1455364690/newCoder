package offer;

import java.util.Arrays;

/**
 * @author sunjh
 * @date 2019/9/22 21:08
 */
public class FindMax {
    public int findMax(int[][] array) {
        int[] nodeList = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            nodeList[i * 2] = array[i][0];
            nodeList[i * 2 + 1] = array[i][1];
        }
        Arrays.sort(nodeList);
        int max = 0;
        for (int i = 0; i < nodeList.length - 1; i++) {
            if (nodeList[i] == nodeList[i + 1]) {
                continue;
            }
            int num = numInArray(nodeList[i], nodeList[i + 1], array);
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int numInArray(int start, int end, int[][] array) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (start >= array[i][0] && end <= array[i][1]) {
                num++;
            }
        }
        return num;
    }

}
