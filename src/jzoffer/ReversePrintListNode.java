/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
package jzoffer;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class ReversePrintListNode {
    private Stack<ListNode> stack = new Stack<>();
    public int[] reversePrint(ListNode head) {
        ListNode listNode = null;
        int i = 0;
        while (head!=null){
            listNode = head;
            stack.push(listNode);
            head = head.next;
            i++;
        }
        int array[] = new int[i];
        int j = 0;
        while(!stack.isEmpty()){
            array[j] = stack.pop().val;
            j++;
        }
        return array;
    }
}
