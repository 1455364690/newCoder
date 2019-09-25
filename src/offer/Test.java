package offer;

import java.util.ArrayList;

/**
 * @author sunjh
 * @date 2019/9/18 16:57
 */
public class Test {
    public static void main(String[] args) {
        StringArray stringArray = new StringArray();
        ArrayList<String> list = stringArray.Permutation("aac");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
