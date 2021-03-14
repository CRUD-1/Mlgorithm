import javax.swing.*;

/**
 * 两数相加
 */
public class No1 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode() {}
     * ListNode(int val) { this.val = val; }
     * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1 = -0;
        ListNode copy1 = l1;
        while(copy1.next!=null){
            sum1 = (sum1*10) + copy1.val;
            copy1 = copy1.next;
        }
        if(copy1.next==null){
            sum1 = (sum1*10) + copy1.val;
        }
        int sum2 = 0;
        ListNode copy2 = l2;
        while (copy2.next!=null){
            sum2 = (sum2*10) + copy2.val;
            copy2 = copy2.next;

        }
        if(copy2.next==null){
            sum2 = (sum2*10) + copy2.val;
        }
        int sum = sum1 + sum2;
        System.out.println(sum);

        ListNode result = new ListNode();
        while(sum%10!=0){
            ListNode fanhui = new ListNode(sum%10);
            result.next = fanhui;
        }
        return null;
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(3);
        ListNode test2 = new ListNode(2,test1);
        ListNode test3 = new ListNode(1,test2);
        ListNode test4 = new ListNode(6);
        ListNode test5 = new ListNode(5,test4);
        ListNode test6 = new ListNode(4,test5);
        No1 no1 = new No1();
        no1.addTwoNumbers(test3,test6);
    }
}
