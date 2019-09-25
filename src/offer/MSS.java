package offer;

import java.util.Arrays;

/**
 * @author sunjh
 * @date 2019/9/24 22:21
 */
public class MSS {
    public static void main(String[] args) {
        int[] a = {1,5,4,3,2};
        System.out.println(minSwaps(a, 5));
    }

    public static int minSwaps(int[] A, int N) {
        int[] b = Arrays.copyOf(A, N);
        int[] c = new int[N];
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
