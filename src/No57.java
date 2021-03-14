//插入区间
public class No57 {
    public static void main(String[] args) {

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        //新插入的区间
        int newHead = newInterval[0];
        int newTail = newInterval[1];
        int[][] result = new int[intervals.length + newInterval.length][2];
        for (int i = 0; i < intervals.length; i++) {
            int head = intervals[i][0];
            int tail = intervals[i][1];
        }
        return null;
    }
}
