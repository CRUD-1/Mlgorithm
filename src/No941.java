public class No941 {

    //山峰数组
    public static void main(String[] args) {
        //2,1
        //0,3,2,1
        int[] a = new int[]{1,2};
        System.out.println(validMountainArray(a));
    }

    public static boolean validMountainArray(int[] a) {
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<a.length-1&&a[i]<a[i+1]){
            j = 1;
            i++;
            if (i == a.length - 1) {
                break;
            }
        }
        while(i<a.length-1&&a[i]>a[i+1]){
            k = 1;
            i++;
            if (i == a.length - 1) {
                break;
            }
        }
        if (i == a.length-1&&k==1&&j==1) {
            return true;
        } else {
            return false;
        }
    }
}
