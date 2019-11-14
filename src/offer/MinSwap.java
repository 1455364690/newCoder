package offer;

import java.util.Scanner;

/**
 * @author sunjh
 * @date 2019/9/26 10:41
 */
public class MinSwap {
    public static int minNum;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            minNum = 0;
            int num = reader.nextInt();
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = reader.nextInt();
            }
            selectSort(arr);
            System.out.println(minNum);
        }
        reader.close();
    }

    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            int index = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (min != array[i]) {
                int tmp = array[i];
                array[i] = array[index];
                array[index] = tmp;
                minNum++;
            }
        }
    }
}
