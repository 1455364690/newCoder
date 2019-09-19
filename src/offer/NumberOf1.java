package offer;

import java.util.LinkedList;

/**
 * @author sunjh
 * @date 2019/9/19 23:25
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n > 0) {
            int numOf1 = 0;
            while (n > 0) {
                numOf1 += n % 2;
                n = n / 2;
            }
            return numOf1;
        } else {
            return getComplementCode(n);
        }
    }

    public int getComplementCode(int n) {
        LinkedList<Boolean> code = new LinkedList<>();
        for (int i = 0; i < 32; i++) {
            code.add(true);
        }
        int num = 0;
        n = -n;
        int index = 31;
        while (n > 0) {
            if (n % 2 == 1) {
                code.set(index, false);
            }
            index--;
            n = n / 2;
        }
        for (boolean i : code) {
            if (i) {
                num++;
            }
        }
        if (code.size() == 0) {
            return 1;
        }
        if (!code.get(code.size() - 1)) {
            num++;
        } else {
            for (int i = code.size() - 2; i >= 0; i--) {
                if (code.get(i)) {
                    num--;
                } else {
                    break;
                }
            }
        }
        return num;
    }
}
