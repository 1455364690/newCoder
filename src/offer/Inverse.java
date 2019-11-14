package offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sunjh
 * @date 2019/9/26 9:39
 */
public class Inverse {
    public static int inverseNum = 0;

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 0; i < n; i++) {
            int num = reader.nextInt();
            inverseNum = 0;
            int[] arr = new int[num];
            for (int j = 0; j < num; j++) {
                arr[j] = reader.nextInt();
            }
            System.out.println(getInverseNum(arr));
        }
        reader.close();
    }

    public static int getInverseNum(int[] array) {
        mergeSort(array);
        return inverseNum;
//        int res = 0;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] > array[j]) {
//                    res++;
//                }
//
//            }
//        }
//        return res;
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }
        int[] arrayA = Arrays.copyOfRange(array, 0, (array.length) / 2);
        int[] arrayB = Arrays.copyOfRange(array, (array.length) / 2, array.length);
        return merge(mergeSort(arrayA), mergeSort(arrayB));
    }

    public static int[] merge(int[] arrayA, int[] arrayB) {
        int[] array = new int[arrayA.length + arrayB.length];
        int i = arrayA.length - 1;
        int j = arrayB.length - 1;
        int index = array.length - 1;
        while (i >= 0 && j >= 0) {
            if (arrayA[i] > arrayB[j]) {
                inverseNum += j + 1;
                array[index] = arrayA[i];
                i--;
                index--;
            } else {
                array[index] = arrayB[j];
                j--;
                index--;
            }
        }
        while (i >= 0) {
            array[index] = arrayA[i];
            index--;
            i--;
        }
        while (j >= 0) {
            array[index] = arrayB[j];
            index--;
            j--;
        }
        return array;
    }
}
