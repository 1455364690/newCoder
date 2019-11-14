package offer;

/**
 * @author sunjh
 * @date 2019/9/25 22:45
 */
public class FirstNum {
    public static void main(String[] args) {
        System.out.println(FirstNotRepeatingChar("google"));
    }

    public static int FirstNotRepeatingChar(String str) {
        if ("".equals(str)) {
            return -1;
        }
        int[] arr = new int[58];
        char[] chars = str.toCharArray();
        for (char i : chars) {
            arr[i - 65]++;
        }

        for (int i = 0; i < chars.length; i++) {
            if (arr[chars[i]-65] == 1) {
                return i;
            }
        }
        return -1;
    }
}
