import com.sun.deploy.security.BadCertificateDialog;

import java.util.List;

public class AddTwoNumbers {


    //
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //返回的列表
        ListNode listNode = new ListNode(0);
        ListNode curr = listNode;
        int carry = 0;
        while (l1.next != null || l2.next != null) {
            int num1 = (l1 != null)? l1.val : 0;
            int num2 = (l2 != null)? l2.val : 0;
            int sum = num1 + num2 + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return listNode.next;
    }
}
