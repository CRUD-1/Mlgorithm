import java.util.*;

/**
 * 字母异位词分组
 */
public class No49 {

    //排序，转换为字符数组排序
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            //排序
            Arrays.sort(chars);
            //key
            String key = new String(chars);
            //如果没有就是新的list，有了就是key
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }

    //计数，通过26长度的数组存储字符并计数
    //["ddddddddddg","dgggggggggg"]
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            int[] charArray = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                    charArray[str.charAt(i)-'a']++;
            }
            StringBuffer s = new StringBuffer();
            for (int i = 0; i < charArray.length; i++) {
                if(charArray[i]!=0){
                    s.append((char)(i+'a'));
                    s.append(charArray[i]);
                }
            }
            String key = s.toString();
            List<String> orDefault = map.getOrDefault(key, new ArrayList<String>());
            orDefault.add(str);
            map.put(key,orDefault);
        }
        return new ArrayList<List<String>>(map.values());
    }

}
