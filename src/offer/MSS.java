package offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author sunjh
 * @date 2019/9/24 22:21
 */
public class MSS {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i=0;i<n;i++){
            int num = reader.nextInt();
            int[] arr = new int[num];
            for (int j=0;j<num;j++){
                arr[j] = reader.nextInt();
            }
            System.out.println(minSwaps(arr,num));
        }
        reader.close();
    }

    public static int minSwaps(int[] A, int N) {
        int[] b = Arrays.copyOf(A, N);
        Arrays.sort(b);
        int num = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] != b[i]) {
                num++;
                int index = getIndex(b, A[i], i);
                int temp = A[i];
                A[i] = A[index];
                A[index] = temp;
                if (A[i] != b[i]) {
                    i--;
                }
            }
        }
        return num;
    }

    public static int getIndex(int[] A, int num, int start) {
        for (int i = start; i < A.length; i++) {
            if (A[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
/*


2
5
5 5 4 6 4
11
2 3 2 4 5 12 2 3 3 3 12
 */