//import org.junit.Test;

/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:输入: 123     输出: 321
 * 示例 2:输入: -123    输出: -321
 * 示例 3:输入: 120     输出: 21
 * 特殊用例：100、0、-120、901000、1534236469(超出范围)
 */
public class ReverseInteger07 {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }

//    @Test
//    public static int reverse(int x) {
//        int i = 0;//返回的数值
//        //去掉末尾0
//        if (x != 0) {
//            while (x % 10 == 0) {
//                x = x / 10;
//            }
//        }
//        //循环取余，并赋值给新变量
//        while (x!=0) {
//            i = (i * 10) + x % 10;
//            x = x / 10;
//        }
//        return i;
//    }
    public static int reverse(int x) {
        int i = 0;//返回的数值
        //循环取余，并赋值给新变量
        while (x!=0) {
            int t = x % 10;
            x = x / 10;
            if(i > Integer.MAX_VALUE/10||(Integer.MAX_VALUE/10==i&&t>7)){
                return 0;
            }
            if(i < Integer.MIN_VALUE/10||(Integer.MIN_VALUE/10==i&&t<-8)){
                return 0;
            }
            i = i * 10 + t;
        }
        return i;
    }
}
