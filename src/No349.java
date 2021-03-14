import java.util.*;

//数组交集
public class No349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set1.add(i);
        }
        for (int i : nums2) {
            if(set1.contains(i)){
                set2.add(i);
            }

        }
        int [] result = new int[set2.size()];
        int start = 0;
        for (Integer integer : set2) {
            result[start]  = integer;
            start++;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] nums1 = new int[]{1,2,2,1};
        int [] nums2 = new int[]{2,2};
        intersection(nums1,nums2);
    }

}
