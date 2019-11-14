package offer;

import java.util.*;

/**
 * @author sunjh
 * @date 2019/9/18 16:57
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<String, String>();
        map.put("b", "b");
        map.put("a", "a");
        map.put("c", "c");
// 通过ArrayList构造函数把map.entrySet()转换成list
        List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(map.entrySet());
// 通过比较器实现比较排序
        Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> mapping1, Map.Entry<String, String> mapping2) {
                return -mapping1.getValue().compareTo(mapping2.getValue());
            }
        });
        for (Map.Entry<String, String> key : list) {
            System.out.println(key.getKey() + " ：" + key.getValue());
        }
    }
}
