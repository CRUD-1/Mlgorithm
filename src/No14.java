import java.util.*;

//字符串数组中的最长公共前缀。
public class No14 {
    public static void main(String[] args) {
        //[]
        //[""]
        //["ab","a"]
        //["dog","racecar","car"]
        //["flower","flow","flight"]
        String[] strings = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strings));
    }


    public static String longestCommonPrefix(String[] strs) {
        //数组长度为
        if(strs.length==0)
            return "";
        String ans = strs[0];
        for(int i = 1;i<strs.length;i++){
            int j = 0;
            for (;j<ans.length() && j < strs[i].length();j++){
                if(ans.charAt(j)!=strs[i].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            if(ans.equals("")){
                return ans;
            }
        }
        return ans;
    }


    //我的没作对
    public static String longestCommonPrefix2(String[] strs) {
        //返回的字符串
        String result = "";
        //字符串数组元素的第几位字符
        int flag = 0;
        int flag2 = 0;
        int max = 0;
        //遍历字符串数据，依次从第0位取到最后一位。通过flag技术，同时放入set。判断set和技术flag是否相同。不同则退出返回结果。
        Set<String> set = new HashSet<>();
        ArrayList<String> list = new ArrayList<>();


        if (strs.length == 0) {
            return "";
        } else {
            max = strs[0].length();
            for (String str : strs) {
                if (max >= str.length()) {
                    max = str.length();
                }
            }
        }
        while (flag < max) {
            //for循环遍历每一个单词
            for (String str : strs) {
                if(str.equals("")){
                    return "";
                }
                //去单词的固定为字符
                String ss = String.valueOf(str.charAt(flag));
                set.add(ss);
                if (set.size() > flag + 1||set.size()>max) {
                    if (flag == 0) {
                        return "";
                    }
                    for (String s : strs) {
                        set.remove(String.valueOf(s.charAt(flag)));
                    }

                    result = strs[0].toString().substring(0, flag - 1);
                    System.out.println(result);
                    return result;
                }
            }
            //位数加一
            flag++;
//            flag2 = flag;
        }
        result = strs[0].toString().substring(0, flag2 - 1);
        System.out.println(result);
        return result;
    }


}
