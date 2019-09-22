package offer;

/**
 * @author sunjh
 * @date 2019/9/22 20:55
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] data = new int[]{5, 2, 8, 9, 10};

        System.out.println("未排序前");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }

        shellSort(data);

        System.out.println("\n排序后");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public static void shellSort(int[] data) {
        int j = 0;
        int max = 0;
        for (int step = data.length / 2; step > 0; step /= 2) {
            for (int i = step; i < data.length; i++) {
                max = data[i];
                for (j = i; j >= step; j -= step) {
                    if (max > data[j - step]) {
                        data[j] = data[j - step];
                    } else {
                        break;
                    }
                }
                data[j] = max;
            }
        }
    }
}
