package offer;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author sunjh
 * @date 2019/9/20 18:41
 */
public class SortIntegerArray {
    public String PrintMinNumber(int[] numbers) {
        String[] strList = new String[numbers.length];
        String[] strListBack = new String[numbers.length];
        Map<String, Integer> map = new HashMap<>();
        int maxLen = 0;
        for (int i = 0; i < numbers.length; i++) {
            String tmp = "" + numbers[i];
            strList[i] = tmp;
            strListBack[i] = tmp;
            if (tmp.length() > maxLen) {
                maxLen = tmp.length();
            }
        }
        for (int i = 0; i < strList.length; i++) {
            int len = strList[i].length();
            for (int j = len; j < maxLen; j++) {
                strList[i] += "" + strList[i].charAt(0);
            }
        }
        Arrays.sort(strListBack,new Comparator<String> (){

            @Override
            public int compare(String o1, String o2) {

                return 0;
            }
        });
        String resStr = "";
        for (String i : strList) {
            resStr += "" + map.get(i);
        }
        return resStr;
    }
}
