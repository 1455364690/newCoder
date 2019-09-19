package offer;

/**
 * @author sunjh
 * @date 2019/9/19 10:13
 */
public class QuickSort {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int len = arr.length - 1;
        arr = qsort(arr, 0, len);
        for (int i : arr) {
            System.out.print(i + "\t");
        }
    }

    public static int[] qsort(int arr[], int start, int end) {
        int pivot = arr[(start + end) / 2];
        int i = start;
        int j = end;
        while (i < j) {
            while ((i < j) && (arr[i] < pivot)) {
                i++;
            }
            while ((i < j) && (arr[j] > pivot)) {
                j--;
            }
            if ((arr[i] == arr[j]) && (i < j)) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        if (i - 1 > start) {
            arr = qsort(arr, start, i - 1);
        }
        if (j + 1 < end) {
            arr = qsort(arr, j + 1, end);
        }
        return (arr);
    }
}
