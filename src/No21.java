//链表合并
public class No21 {

    public static void main(String[] args) {
        ListNode res = mergeTwoLists(new ListNode(1), new ListNode(2));
        while (res != null) {
            System.out.println(res.val);
            res = res.next;
        }

    }

    //递归
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1.val < l2.val) {
            l1.next = l2;
        }
        if (l1 == null) {

        }
        if (l2 == null) {

        }
        return null;
    }
    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode r = result;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                result.next = l1;
                result = result.next;
                l1 = l1.next;
            } else {
                result.next = l2;
                result = result.next;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            result.next = l2;
        }
        if (l2 == null) {
            result.next = l1;
        }
        return r.next;
    }

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
}



