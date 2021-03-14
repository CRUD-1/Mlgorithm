//import org.junit.Test;

//排序树组中，查询给定值的开始结束位置
public class No34 {
    public static void main(String[] args) {
        int fanhui[] = searchRange(new int[]{5,7,7,8,8,10},8);
        System.out.println(fanhui[0]);;
        System.out.println(fanhui[1]);;

    }

    public static int[] searchRange(int[] nums, int target) {
        int answer[] = new int[2];
        //为空直接返回
        if (nums.length == 0) {
            return new int[]{-1,-1};
        }
        answer[0] = searchLeft(nums, target);
        answer[1] = searchRight(nums, target);
        return answer;
    }
    public static int searchLeft(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        //左边界
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] == target) {
                right = mid;
            }
        }
        return left;
    }
    public static int searchRight(int[] nums, int target){
        int left = 0;
        int right = nums.length - 1;
        //右边界
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid-1;
            } else if (nums[mid] == target) {
                left = mid;
            }
        }
        return left;
    }
}
