package offer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author sunjh
 * @date 2019/9/24 19:58
 */
public class StringArray {
    public ArrayList<String> Permutation(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        ArrayList<String> list = new ArrayList<String>();
        for (Character i : chars) {
            list.add("" + i);
        }
        return getStrings(list);
    }

    public ArrayList<String> getStrings(ArrayList<String> list) {
        if (list.size() == 1) {
            return list;
        } else {
            ArrayList<String> newList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0 && list.get(i).equals(list.get(i - 1))) {
                    continue;
                }
                String head = list.get(i);
                list.remove(i);
                ArrayList<String> tmp = getStrings(list);
                for (int j = 0; j < tmp.size(); j++) {
                    newList.add(head + tmp.get(j));
                }
                list.add(i, head);
            }
            return newList;
        }
    }
}
