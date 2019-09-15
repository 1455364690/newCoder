package xiaozhao.网易;

import java.util.Scanner;

/**
 * @author sunjh
 * @date 2019/9/15 19:46
 */
public class 被3整除 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int start = reader.nextInt();
        int end = reader.nextInt();
        if (start > end) {
            System.out.println(0);
            return;
        }
        if (start == end && start % 3 == 0) {
            System.out.println(1);
        }
        int num = end - start;
        if (start % 3 == 0) {
            if (end % 3 == 0) {
                System.out.println(num * 2 / 3);
            }
            if (end % 3 == 1) {
                System.out.println((num + 2) * 2 / 3 - 1);
            }
            if (end % 3 == 2) {
                System.out.println((num + 1) * 2 / 3);
            }
        }
        if (start % 3 == 1) {
            if (end % 3 == 0) {
                System.out.println((num + 1) * 2 / 3);
            }
            if (end % 3 == 1) {
                System.out.println(num * 2 / 3 + 1);
            }
            if (end % 3 == 2) {
                System.out.println((num + 2) * 2 / 3);
            }
        }
        if (start % 3 == 2) {
            if (end % 3 == 0) {
                System.out.println((num + 2) * 2 / 3 - 1);
            }
            if (end % 3 == 1) {
                System.out.println((num + 1) * 2 / 3);
            }
            if (end % 3 == 2) {
                System.out.println(num * 2 / 3 + 1);
            }
        }
        reader.close();
    }
}
