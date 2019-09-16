package offer;

/**
 * @author sunjh
 * @date 2019/9/16 18:00
 */
public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(Find(1, a));
    }

    public static boolean Find(int target, int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("i:" + i);
            if (findX(target, array[i])) {
                return true;
            }
        }
        return false;
    }

    private static boolean findX(int target, int[] array) {
        int start = 0;
        int end = array.length - 1;
        int mid = -1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] > target) {
                end = mid - 1;
            } else if (array[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        if (array[mid] == target) {
            return true;
        }
        return false;
    }
}
